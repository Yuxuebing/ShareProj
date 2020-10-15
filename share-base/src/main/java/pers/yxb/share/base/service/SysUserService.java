package pers.yxb.share.base.service;

import org.springframework.stereotype.Service;
import pers.yxb.share.base.entity.SysUser;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public interface SysUserService {
    /**
     * 新增用户
     * @param sysUser
     */
    void insertUser(SysUser sysUser);

    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    SysUser selectUserByName(String name);
}
