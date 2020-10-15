package pers.yxb.share.base.dao;

import org.apache.ibatis.annotations.Mapper;
import pers.yxb.share.base.entity.SysOrg;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-18
 */
@Mapper
public interface SysOrgDao {
    /**
     * 插入机构信息
     */
    void insertOrg(SysOrg sysOrg);
}
