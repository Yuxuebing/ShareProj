package pers.yxb.share.portal.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.yxb.share.portal.entity.SysUser;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
@Mapper
public interface SysUserDao {

    /**
     * 插入用户信息
     */
    void insertUser(SysUser sysUser);

    /**
     * 通过名字查询用户信息
     */
    SysUser findUserByName(@Param("name") String name);
}
