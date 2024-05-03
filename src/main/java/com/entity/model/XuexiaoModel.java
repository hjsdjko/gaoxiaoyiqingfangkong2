package com.entity.model;

import com.entity.XuexiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学校管理员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuexiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 学校管理员姓名
     */
    private String xuexiaoName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 头像
     */
    private String xuexiaoPhoto;


    /**
     * 联系方式
     */
    private String xuexiaoPhone;


    /**
     * 电子邮箱
     */
    private String xuexiaoEmail;


    /**
     * 逻辑删除
     */
    private Integer xuexiaoDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：学校管理员姓名
	 */
    public String getXuexiaoName() {
        return xuexiaoName;
    }


    /**
	 * 设置：学校管理员姓名
	 */
    public void setXuexiaoName(String xuexiaoName) {
        this.xuexiaoName = xuexiaoName;
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
    public String getXuexiaoPhoto() {
        return xuexiaoPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setXuexiaoPhoto(String xuexiaoPhoto) {
        this.xuexiaoPhoto = xuexiaoPhoto;
    }
    /**
	 * 获取：联系方式
	 */
    public String getXuexiaoPhone() {
        return xuexiaoPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setXuexiaoPhone(String xuexiaoPhone) {
        this.xuexiaoPhone = xuexiaoPhone;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getXuexiaoEmail() {
        return xuexiaoEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setXuexiaoEmail(String xuexiaoEmail) {
        this.xuexiaoEmail = xuexiaoEmail;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXuexiaoDelete() {
        return xuexiaoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXuexiaoDelete(Integer xuexiaoDelete) {
        this.xuexiaoDelete = xuexiaoDelete;
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

    }
