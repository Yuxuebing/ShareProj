package pers.yxb.share.base.entity;

import java.io.Serializable;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public class SysPermission implements Serializable,Cloneable {
    /** 主键 */
    private String id ;
    /** 主体ID */
    private String masterId ;
    /** 资源ID */
    private String resourceId ;

    /** 主键 */
    public String getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(String id){
        this.id = id;
    }
    /** 主体ID */
    public String getMasterId(){
        return this.masterId;
    }
    /** 主体ID */
    public void setMasterId(String masterId){
        this.masterId = masterId;
    }
    /** 资源ID */
    public String getResourceId(){
        return this.resourceId;
    }
    /** 资源ID */
    public void setResourceId(String resourceId){
        this.resourceId = resourceId;
    }
}
