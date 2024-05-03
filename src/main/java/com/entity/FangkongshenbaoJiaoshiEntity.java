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
 * 教师防控申报
 *
 * @author 
 * @email
 */
@TableName("fangkongshenbao_jiaoshi")
public class FangkongshenbaoJiaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangkongshenbaoJiaoshiEntity() {

	}

	public FangkongshenbaoJiaoshiEntity(T t) {
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
     * 教师
     */
    @ColumnInfo(comment="教师",type="int(11)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 当天体温
     */
    @ColumnInfo(comment="当天体温",type="decimal(10,1)")
    @TableField(value = "fangkongshenbao_jiaoshi_tiwen")

    private Double fangkongshenbaoJiaoshiTiwen;


    /**
     * 有无咳嗽
     */
    @ColumnInfo(comment="有无咳嗽",type="int(200)")
    @TableField(value = "keshou_types")

    private Integer keshouTypes;


    /**
     * 有无外出
     */
    @ColumnInfo(comment="有无外出",type="int(200)")
    @TableField(value = "wuaichu_types")

    private Integer wuaichuTypes;


    /**
     * 外出地点
     */
    @ColumnInfo(comment="外出地点",type="varchar(200)")
    @TableField(value = "fangkongshenbao_jiaoshi_didian")

    private String fangkongshenbaoJiaoshiDidian;


    /**
     * 是否接触病患
     */
    @ColumnInfo(comment="是否接触病患",type="int(200)")
    @TableField(value = "binghuan_types")

    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */
    @ColumnInfo(comment="是否出入高风险区域",type="int(200)")
    @TableField(value = "gaofengxian_types")

    private Integer gaofengxianTypes;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "fangkongshenbao_jiaoshi_text")

    private String fangkongshenbaoJiaoshiText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="date")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 设置：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：当天体温
	 */
    public Double getFangkongshenbaoJiaoshiTiwen() {
        return fangkongshenbaoJiaoshiTiwen;
    }
    /**
	 * 设置：当天体温
	 */

    public void setFangkongshenbaoJiaoshiTiwen(Double fangkongshenbaoJiaoshiTiwen) {
        this.fangkongshenbaoJiaoshiTiwen = fangkongshenbaoJiaoshiTiwen;
    }
    /**
	 * 获取：有无咳嗽
	 */
    public Integer getKeshouTypes() {
        return keshouTypes;
    }
    /**
	 * 设置：有无咳嗽
	 */

    public void setKeshouTypes(Integer keshouTypes) {
        this.keshouTypes = keshouTypes;
    }
    /**
	 * 获取：有无外出
	 */
    public Integer getWuaichuTypes() {
        return wuaichuTypes;
    }
    /**
	 * 设置：有无外出
	 */

    public void setWuaichuTypes(Integer wuaichuTypes) {
        this.wuaichuTypes = wuaichuTypes;
    }
    /**
	 * 获取：外出地点
	 */
    public String getFangkongshenbaoJiaoshiDidian() {
        return fangkongshenbaoJiaoshiDidian;
    }
    /**
	 * 设置：外出地点
	 */

    public void setFangkongshenbaoJiaoshiDidian(String fangkongshenbaoJiaoshiDidian) {
        this.fangkongshenbaoJiaoshiDidian = fangkongshenbaoJiaoshiDidian;
    }
    /**
	 * 获取：是否接触病患
	 */
    public Integer getBinghuanTypes() {
        return binghuanTypes;
    }
    /**
	 * 设置：是否接触病患
	 */

    public void setBinghuanTypes(Integer binghuanTypes) {
        this.binghuanTypes = binghuanTypes;
    }
    /**
	 * 获取：是否出入高风险区域
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }
    /**
	 * 设置：是否出入高风险区域
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getFangkongshenbaoJiaoshiText() {
        return fangkongshenbaoJiaoshiText;
    }
    /**
	 * 设置：备注
	 */

    public void setFangkongshenbaoJiaoshiText(String fangkongshenbaoJiaoshiText) {
        this.fangkongshenbaoJiaoshiText = fangkongshenbaoJiaoshiText;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "FangkongshenbaoJiaoshi{" +
            ", id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", fangkongshenbaoJiaoshiTiwen=" + fangkongshenbaoJiaoshiTiwen +
            ", keshouTypes=" + keshouTypes +
            ", wuaichuTypes=" + wuaichuTypes +
            ", fangkongshenbaoJiaoshiDidian=" + fangkongshenbaoJiaoshiDidian +
            ", binghuanTypes=" + binghuanTypes +
            ", gaofengxianTypes=" + gaofengxianTypes +
            ", fangkongshenbaoJiaoshiText=" + fangkongshenbaoJiaoshiText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
