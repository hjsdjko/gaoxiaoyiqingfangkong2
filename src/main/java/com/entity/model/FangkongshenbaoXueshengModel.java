package com.entity.model;

import com.entity.FangkongshenbaoXueshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生防控申报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangkongshenbaoXueshengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 当天体温
     */
    private Double fangkongshenbaoXueshengTiwen;


    /**
     * 有无咳嗽
     */
    private Integer keshouTypes;


    /**
     * 有无外出
     */
    private Integer wuaichuTypes;


    /**
     * 外出地点
     */
    private String fangkongshenbaoXueshengDidian;


    /**
     * 是否接触病患
     */
    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */
    private Integer gaofengxianTypes;


    /**
     * 备注
     */
    private String fangkongshenbaoXueshengText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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

    }
