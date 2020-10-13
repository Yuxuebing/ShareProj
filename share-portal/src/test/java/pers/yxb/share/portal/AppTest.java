package pers.yxb.share.portal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import pers.yxb.share.portal.entity.SysUser;
import pers.yxb.share.portal.service.SysOrgService;
import pers.yxb.share.portal.service.SysUserService;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private SysUserService userService;

    @Test
    public void getUsers() {
        System.out.println("begin getUsers---");
        SysUser sysUser= userService.selectUserByName("zhangsan");
        System.out.println(sysUser.getUsername());
    }

    @Test
    public void setUser() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("zhangsan");
        userService.insertUser(sysUser);
    }
}


