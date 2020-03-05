package pers.yxb.share.portal.entity;

import java.io.Serializable;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public class BaseEntity implements Serializable,Cloneable {
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
