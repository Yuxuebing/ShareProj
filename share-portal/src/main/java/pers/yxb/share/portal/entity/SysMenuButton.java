package pers.yxb.share.portal.entity;

import java.io.Serializable;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
public class SysMenuButton implements Serializable,Cloneable {
    /** 主键 */
    private String id ;
    /** 菜单ID */
    private String menuId ;
    /** 按钮ID */
    private String btnId ;

    /** 主键 */
    public String getId(){
        return this.id;
    }
    /** 主键 */
    public void setId(String id){
        this.id = id;
    }
    /** 菜单ID */
    public String getMenuId(){
        return this.menuId;
    }
    /** 菜单ID */
    public void setMenuId(String menuId){
        this.menuId = menuId;
    }
    /** 按钮ID */
    public String getBtnId(){
        return this.btnId;
    }
    /** 按钮ID */
    public void setBtnId(String btnId){
        this.btnId = btnId;
    }
}
