package pers.yxb.share.base.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import pers.yxb.share.base.entity.SysUser;
import pers.yxb.share.base.service.SysPermissionService;
import pers.yxb.share.base.service.SysRoleService;
import pers.yxb.share.base.service.SysUserService;

import java.util.Set;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/17 0017
 * @Version
 * @Describe
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysPermissionService permissionService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        /*Set<String> roles = roleService.getRolesByUserName(username);//角色集合
        Set<String> perms = permissionService.findPermissionsByUsername(username);//权限集合
        info.setRoles(roles);
        info.setStringPermissions(perms);*/
        return info;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName = token.getPrincipal().toString();
        SysUser user = sysUserService.selectUserByName(userName);
        if (user == null) {
            throw new UnknownAccountException(); // 账号不存在
        }
        String passwordInDB = user.getPassword();
        String salt = user.getSalt();
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userName, passwordInDB, ByteSource.Util.bytes(salt), getName());
        return authenticationInfo;
    }
}
