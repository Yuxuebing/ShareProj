package pers.yxb.share.portal.service;

import org.springframework.stereotype.Service;
import pers.yxb.share.portal.entity.SysUser;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
@Service
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
