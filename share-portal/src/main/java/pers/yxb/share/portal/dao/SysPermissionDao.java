package pers.yxb.share.portal.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Mapper
public interface SysPermissionDao {
    Set<String> findPermissionsByUsername(String username);
}
