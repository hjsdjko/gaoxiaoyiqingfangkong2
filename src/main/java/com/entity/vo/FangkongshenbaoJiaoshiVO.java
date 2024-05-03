package com.entity.vo;

import com.entity.FangkongshenbaoJiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教师防控申报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangkongshenbao_jiaoshi")
public class FangkongshenbaoJiaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 当天体温
     */

    @TableField(value = "fangkongshenbao_jiaoshi_tiwen")
    private Double fangkongshenbaoJiaoshiTiwen;


    /**
     * 有无咳嗽
     */

    @TableField(value = "keshou_types")
    private Integer keshouTypes;


    /**
     * 有无外出
     */

    @TableField(value = "wuaichu_types")
    private Integer wuaichuTypes;


    /**
     * 外出地点
     */

    @TableField(value = "fangkongshenbao_jiaoshi_didian")
    private String fangkongshenbaoJiaoshiDidian;


    /**
     * 是否接触病患
     */

    @TableField(value = "binghuan_types")
    private Integer binghuanTypes;


    /**
     * 是否出入高风险区域
     */

    @TableField(value = "gaofengxian_types")
    private Integer gaofengxianTypes;


    /**
     * 备注
     */

    @TableField(value = "fangkongshenbao_jiaoshi_text")
    private String fangkongshenbaoJiaoshiText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：当天体温
	 */
    public Double getFangkongshenbaoJiaoshiTiwen() {
        return fangkongshenbaoJiaoshiTiwen;
    }


    /**
	 * 获取：当天体温
	 */

    public void setFangkongshenbaoJiaoshiTiwen(Double fangkongshenbaoJiaoshiTiwen) {
        this.fangkongshenbaoJiaoshiTiwen = fangkongshenbaoJiaoshiTiwen;
    }
    /**
	 * 设置：有无咳嗽
	 */
    public Integer getKeshouTypes() {
        return keshouTypes;
    }


    /**
	 * 获取：有无咳嗽
	 */

    public void setKeshouTypes(Integer keshouTypes) {
        this.keshouTypes = keshouTypes;
    }
    /**
	 * 设置：有无外出
	 */
    public Integer getWuaichuTypes() {
        return wuaichuTypes;
    }


    /**
	 * 获取：有无外出
	 */

    public void setWuaichuTypes(Integer wuaichuTypes) {
        this.wuaichuTypes = wuaichuTypes;
    }
    /**
	 * 设置：外出地点
	 */
    public String getFangkongshenbaoJiaoshiDidian() {
        return fangkongshenbaoJiaoshiDidian;
    }


    /**
	 * 获取：外出地点
	 */

    public void setFangkongshenbaoJiaoshiDidian(String fangkongshenbaoJiaoshiDidian) {
        this.fangkongshenbaoJiaoshiDidian = fangkongshenbaoJiaoshiDidian;
    }
    /**
	 * 设置：是否接触病患
	 */
    public Integer getBinghuanTypes() {
        return binghuanTypes;
    }


    /**
	 * 获取：是否接触病患
	 */

    public void setBinghuanTypes(Integer binghuanTypes) {
        this.binghuanTypes = binghuanTypes;
    }
    /**
	 * 设置：是否出入高风险区域
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 获取：是否出入高风险区域
	 */

    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getFangkongshenbaoJiaoshiText() {
        return fangkongshenbaoJiaoshiText;
    }


    /**
	 * 获取：备注
	 */

    public void setFangkongshenbaoJiaoshiText(String fangkongshenbaoJiaoshiText) {
        this.fangkongshenbaoJiaoshiText = fangkongshenbaoJiaoshiText;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
