package pers.yxb.share.portal.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.yxb.share.portal.entity.SysUser;
import pers.yxb.share.portal.service.SysPermissionService;
import pers.yxb.share.portal.service.SysRoleService;
import pers.yxb.share.portal.service.SysUserService;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Configuration
public class ShiroConfig {

    class MyRealm extends AuthorizingRealm {
        @Autowired
        private SysUserService userService;

        @Autowired
        private SysRoleService roleService;

        @Autowired
        private SysPermissionService permissionService;

        /**
         * 身份认证
         * @param authenticationToken
         * @return
         * @throws AuthenticationException
         */
        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
            String username = (String)authenticationToken.getPrincipal();
            SysUser user = userService.selectUserByName(username);
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo( user.getUsername(),
                    user.getPassword(), // 密码
                    ByteSource.Util.bytes(user.getSalt()),
                    getName());
            return authenticationInfo;
        }

        /**
         * 授权
         * @param principalCollection
         * @return
         */
        @Override
        protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
            String username = (String)principalCollection.getPrimaryPrincipal();
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            Set<String> roles = roleService.getRolesByUserName(username);//角色集合
            Set<String> perms = permissionService.findPermissionsByUsername(username);//权限集合
            info.setRoles(roles);
            info.setStringPermissions(perms);
            return info;
        }
    }

    /**
     * 自定义realm
     * 这里bean需要取名为authorizer，否则会报authorizer无法加载
     * @return
     */
    @Bean("authorizer")
    public MyRealm realm() {
        return new MyRealm();
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/**", "authc");
        return chainDefinition;
    }
}
