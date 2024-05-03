package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 学院管理员
 *
 * @author 
 * @email
 */
@TableName("xueyuan")
public class XueyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueyuanEntity() {

	}

	public XueyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 学院管理员姓名
     */
    @ColumnInfo(comment="学院管理员姓名",type="varchar(200)")
    @TableField(value = "xueyuan_name")

    private String xueyuanName;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 头像
     */
    @ColumnInfo(comment="头像",type="varchar(200)")
    @TableField(value = "xueyuan_photo")

    private String xueyuanPhoto;


    /**
     * 联系方式
     */
    @ColumnInfo(comment="联系方式",type="varchar(200)")
    @TableField(value = "xueyuan_phone")

    private String xueyuanPhone;


    /**
     * 电子邮箱
     */
    @ColumnInfo(comment="电子邮箱",type="varchar(200)")
    @TableField(value = "xueyuan_email")

    private String xueyuanEmail;


    /**
     * 学院
     */
    @ColumnInfo(comment="学院",type="int(11)")
    @TableField(value = "xuanyuan_types")

    private Integer xuanyuanTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xueyuan_delete")

    private Integer xueyuanDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学院管理员姓名
	 */
    public String getXueyuanName() {
        return xueyuanName;
    }
    /**
	 * 设置：学院管理员姓名
	 */

    public void setXueyuanName(String xueyuanName) {
        this.xueyuanName = xueyuanName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：头像
	 */
    public String getXueyuanPhoto() {
        return xueyuanPhoto;
    }
    /**
	 * 设置：头像
	 */

    public void setXueyuanPhoto(String xueyuanPhoto) {
        this.xueyuanPhoto = xueyuanPhoto;
    }
    /**
	 * 获取：联系方式
	 */
    public String getXueyuanPhone() {
        return xueyuanPhone;
    }
    /**
	 * 设置：联系方式
	 */

    public void setXueyuanPhone(String xueyuanPhone) {
        this.xueyuanPhone = xueyuanPhone;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getXueyuanEmail() {
        return xueyuanEmail;
    }
    /**
	 * 设置：电子邮箱
	 */

    public void setXueyuanEmail(String xueyuanEmail) {
        this.xueyuanEmail = xueyuanEmail;
    }
    /**
	 * 获取：学院
	 */
    public Integer getXuanyuanTypes() {
        return xuanyuanTypes;
    }
    /**
	 * 设置：学院
	 */

    public void setXuanyuanTypes(Integer xuanyuanTypes) {
        this.xuanyuanTypes = xuanyuanTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXueyuanDelete() {
        return xueyuanDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setXueyuanDelete(Integer xueyuanDelete) {
        this.xueyuanDelete = xueyuanDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xueyuan{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", xueyuanName=" + xueyuanName +
            ", sexTypes=" + sexTypes +
            ", xueyuanPhoto=" + xueyuanPhoto +
            ", xueyuanPhone=" + xueyuanPhone +
            ", xueyuanEmail=" + xueyuanEmail +
            ", xuanyuanTypes=" + xuanyuanTypes +
            ", xueyuanDelete=" + xueyuanDelete +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
