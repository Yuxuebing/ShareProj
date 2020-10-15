package pers.yxb.share.base.service.impl;

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
