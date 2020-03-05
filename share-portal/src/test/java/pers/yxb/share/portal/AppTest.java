package pers.yxb.share.portal;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.yxb.share.portal.entity.SysUser;
import pers.yxb.share.portal.service.SysUserService;

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PortalApplication.class)
public class AppTest {
    //DI注入数据源
    @Autowired
    DataSource dataSource;

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void testGetSysUser() {
//看一下默认数据源
        System.out.println(dataSource.getClass());
        try {
            //获得连接
            Connection connection =   dataSource.getConnection();
            System.out.println(connection);
            //关闭连接
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        SysUser sysUser = sysUserService.selectUserByName("3");
        System.out.println(sysUser);
    }

    public void testShiro() {
        UsernamePasswordToken token = new UsernamePasswordToken("","");
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录
        subject.logout();
    }

    @Test
    public void testHello() {
        System.out.println(Math.round(-11.6));
    }

    interface HelloInf {
        void sayHello();
    }
    class RealHello implements HelloInf {
        @Override
        public void sayHello() {
            System.out.println("The real hello!");
        }
    }
    class ProxyHello implements HelloInf {
        private RealHello realHello;
        @Override
        public void sayHello() {
            if(realHello==null) {
                realHello = new RealHello();
            }
            realHello.sayHello();
        }
    }

    class DyProxyHello implements InvocationHandler {
        private Object targetObject;
        public Object newProxyInstance(Object targetObject) {
            this.targetObject=targetObject;
            return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(),this);
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before");
            Object ret= method.invoke(targetObject, args);
            System.out.println("after");
            return ret;
        }
    }

    @Test
    public void testHello1() {
        DyProxyHello proxyHello = new DyProxyHello();
        HelloInf helloInf = (HelloInf)proxyHello.newProxyInstance(new ProxyHello());
        helloInf.sayHello();
    }
}
