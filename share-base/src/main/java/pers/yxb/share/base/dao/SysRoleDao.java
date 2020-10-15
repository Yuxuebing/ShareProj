package pers.yxb.share.base.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Mapper
public interface SysRoleDao {
    Set<String> getRolesByUserName(String username);
}
