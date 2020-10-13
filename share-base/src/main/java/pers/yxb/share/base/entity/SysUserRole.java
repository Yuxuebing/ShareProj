package pers.yxb.share.base.entity;

import java.io.Serializable;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public class SysUserRole implements Serializable,Cloneable {
    /** 主键 */
    private String id ;
    /** 用户ID */
    private String userId ;
    /** 角色ID */
    private String roleId ;

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
    /** 角色ID */
    public String getRoleId(){
        return this.roleId;
    }
    /** 角色ID */
    public void setRoleId(String roleId){
        this.roleId = roleId;
    }
}
