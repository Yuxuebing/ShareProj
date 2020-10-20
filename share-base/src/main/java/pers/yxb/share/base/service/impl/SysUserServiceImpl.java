package pers.yxb.share.base.service.impl;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.yxb.share.base.dao.SysUserDao;
import pers.yxb.share.base.entity.SysUser;
import pers.yxb.share.base.service.SysUserService;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    /**
     * 新增用户
     * @param sysUser
     */
    @Override
    public void insertUser(SysUser sysUser) {
        String password = sysUser.getPassword();
        // 生成盐,默认长度 16 位
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        // 设置 hash 算法迭代次数
        int times = 2;
        // 得到 hash 后的密码
        String encodedPassword = new SimpleHash("md5", password, salt, times).toString();
        // 存储用户信息，包括 salt 与 hash 后的密码
        sysUser.setSalt(salt);
        sysUser.setPassword(encodedPassword);
        sysUserDao.insertUser(sysUser);
    }

    /**
     * 根据名字查找用户
     */
    @Override
    public SysUser selectUserByName(String name) {
        return sysUserDao.findUserByName(name);
    }

}
