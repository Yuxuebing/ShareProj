package pers.yxb.share.portal.entity;

import java.io.Serializable;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public class SysUserOrg implements Serializable,Cloneable {
    /** 主键 */
    private String id ;
    /** 用户ID */
    private String userId ;
    /** 机构ID */
    private String orgId ;

    /** 主键 */
    public String getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(String id){
        this.id = id;
    }
    /** 用户ID */
    public String getUserId(){
        return this.userId;
    }
    /** 用户ID */
    public void setUserId(String userId){
        this.userId = userId;
    }
    /** 机构ID */
    public String getOrgId(){
        return this.orgId;
    }
    /** 机构ID */
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }
}
