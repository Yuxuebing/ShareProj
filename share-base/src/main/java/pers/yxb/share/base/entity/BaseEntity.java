package pers.yxb.share.base.entity;

import java.io.Serializable;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/13 0013
 * @Version
 * @Describe
 */
public class BaseEntity implements Serializable, Cloneable {
    protected String id;

    /** 主键 */
    public String getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(String id){
        this.id = id;
    }
}
