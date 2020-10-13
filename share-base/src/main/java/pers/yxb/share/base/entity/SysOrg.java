package pers.yxb.share.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public class SysOrg implements Serializable,Cloneable {
    /** 主键 */
    private String id ;
    /** 名称 */
    private String name ;
    /** 父级ID */
    private String parentId ;
    /** 层级 */
    private Integer grade ;
    /** 图标 */
    private String icon ;
    /** 序号 */
    private Integer seq ;
    /** 是否删除 */
    private String isDel ;
    /** 创建人ID */
    private String createdUserId ;
    /** 创建人姓名 */
    private String createdUserName ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新人ID */
    private String updateUserId ;
    /** 更新人姓名 */
    private String updateUserName ;
    /** 更新时间 */
    private Date updatedTime ;

    /** 主键 */
    public String getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(String id){
        this.id = id;
    }
    /** 名称 */
    public String getName(){
        return this.name;
    }
    /** 名称 */
    public void setName(String name){
        this.name = name;
    }
    /** 父级ID */
    public String getParentId(){
        return this.parentId;
    }
    /** 父级ID */
    public void setParentId(String parentId){
        this.parentId = parentId;
    }
    /** 层级 */
    public Integer getGrade(){
        return this.grade;
    }
    /** 层级 */
    public void setGrade(Integer grade){
        this.grade = grade;
    }
    /** 图标 */
    public String getIcon(){
        return this.icon;
    }
    /** 图标 */
    public void setIcon(String icon){
        this.icon = icon;
    }
    /** 序号 */
    public Integer getSeq(){
        return this.seq;
    }
    /** 序号 */
    public void setSeq(Integer seq){
        this.seq = seq;
    }
    /** 是否删除 */
    public String getIsDel(){
        return this.isDel;
    }
    /** 是否删除 */
    public void setIsDel(String isDel){
        this.isDel = isDel;
    }
    /** 创建人ID */
    public String getCreatedUserId(){
        return this.createdUserId;
    }
    /** 创建人ID */
    public void setCreatedUserId(String createdUserId){
        this.createdUserId = createdUserId;
    }
    /** 创建人姓名 */
    public String getCreatedUserName(){
        return this.createdUserName;
    }
    /** 创建人姓名 */
    public void setCreatedUserName(String createdUserName){
        this.createdUserName = createdUserName;
    }
    /** 创建时间 */
    public Date getCreatedTime(){
        return this.createdTime;
    }
    /** 创建时间 */
    public void setCreatedTime(Date createdTime){
        this.createdTime = createdTime;
    }
    /** 更新人ID */
    public String getUpdateUserId(){
        return this.updateUserId;
    }
    /** 更新人ID */
    public void setUpdateUserId(String updateUserId){
        this.updateUserId = updateUserId;
    }
    /** 更新人姓名 */
    public String getUpdateUserName(){
        return this.updateUserName;
    }
    /** 更新人姓名 */
    public void setUpdateUserName(String updateUserName){
        this.updateUserName = updateUserName;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime = updatedTime;
    }
}
