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
 * 学生防控申报
 *
 * @author 
 * @email
 */
@TableName("fangkongshenbao_xuesheng")
public class FangkongshenbaoXueshengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangkongshenbaoXueshengEntity() {

	}

	public FangkongshenbaoXueshengEntity(T t) {
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
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 当天体温
     */
    @ColumnInfo(comment="当天体温",type="decimal(10,1)")
    @TableField(value = "fangkongshenbao_xuesheng_tiwen")

    private Double fangkongshenbaoXueshengTiwen;


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
    @TableField(value = "fangkongshenbao_xuesheng_didian")

    private String fangkongshenbaoXueshengDidian;


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
    @TableField(value = "fangkongshenbao_xuesheng_text")

    private String fangkongshenbaoXueshengText;


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
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：当天体温
	 */
    public Double getFangkongshenbaoXueshengTiwen() {
        return fangkongshenbaoXueshengTiwen;
    }
    /**
	 * 设置：当天体温
	 */

    public void setFangkongshenbaoXueshengTiwen(Double fangkongshenbaoXueshengTiwen) {
        this.fangkongshenbaoXueshengTiwen = fangkongshenbaoXueshengTiwen;
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
    public String getFangkongshenbaoXueshengDidian() {
        return fangkongshenbaoXueshengDidian;
    }
    /**
	 * 设置：外出地点
	 */

    public void setFangkongshenbaoXueshengDidian(String fangkongshenbaoXueshengDidian) {
        this.fangkongshenbaoXueshengDidian = fangkongshenbaoXueshengDidian;
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
    public String getFangkongshenbaoXueshengText() {
        return fangkongshenbaoXueshengText;
    }
    /**
	 * 设置：备注
	 */

    public void setFangkongshenbaoXueshengText(String fangkongshenbaoXueshengText) {
        this.fangkongshenbaoXueshengText = fangkongshenbaoXueshengText;
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
        return "FangkongshenbaoXuesheng{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", fangkongshenbaoXueshengTiwen=" + fangkongshenbaoXueshengTiwen +
            ", keshouTypes=" + keshouTypes +
            ", wuaichuTypes=" + wuaichuTypes +
            ", fangkongshenbaoXueshengDidian=" + fangkongshenbaoXueshengDidian +
            ", binghuanTypes=" + binghuanTypes +
            ", gaofengxianTypes=" + gaofengxianTypes +
            ", fangkongshenbaoXueshengText=" + fangkongshenbaoXueshengText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
