package pers.yxb.share.base.entity;

import java.util.Date;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/13 0013
 * @Version
 * @Describe
 */
public class SysUser extends BaseEntity {
    /** 用户名 */
    private String username ;
    /** 密码 */
    private String password ;
    /** SALT */
    private String salt ;
    /** 真实姓名 */
    private String realName ;
    /** 性别 */
    private String sex ;
    /** 出生日期 */
    private Date birthday ;
    /** 手机号 */
    private String phone ;
    /** 邮箱 */
    private String email ;
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

    /** 用户名 */
    public String getUsername(){
        return this.username;
    }
    /** 用户名 */
    public void setUsername(String username){
        this.username = username;
    }
    /** 密码 */
    public String getPassword(){
        return this.password;
    }
    /** 密码 */
    public void setPassword(String password){
        this.password = password;
    }
    /** SALT */
    public String getSalt(){
        return this.salt;
    }
    /** SALT */
    public void setSalt(String salt){
        this.salt = salt;
    }
    /** 真实姓名 */
    public String getRealName(){
        return this.realName;
    }
    /** 真实姓名 */
    public void setRealName(String realName){
        this.realName = realName;
    }
    /** 性别 */
    public String getSex(){
        return this.sex;
    }
    /** 性别 */
    public void setSex(String sex){
        this.sex = sex;
    }
    /** 出生日期 */
    public Date getBirthday(){
        return this.birthday;
    }
    /** 出生日期 */
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    /** 手机号 */
    public String getPhone(){
        return this.phone;
    }
    /** 手机号 */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /** 邮箱 */
    public String getEmail(){
        return this.email;
    }
    /** 邮箱 */
    public void setEmail(String email){
        this.email = email;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysUser{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", salt='").append(salt).append('\'');
        sb.append(", realName='").append(realName).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", isDel='").append(isDel).append('\'');
        sb.append(", createdUserId='").append(createdUserId).append('\'');
        sb.append(", createdUserName='").append(createdUserName).append('\'');
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updateUserId='").append(updateUserId).append('\'');
        sb.append(", updateUserName='").append(updateUserName).append('\'');
        sb.append(", updatedTime=").append(updatedTime);
        sb.append('}');
        return sb.toString();
    }
}
