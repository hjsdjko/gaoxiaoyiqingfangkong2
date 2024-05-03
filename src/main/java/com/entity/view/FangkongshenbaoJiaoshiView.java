package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.FangkongshenbaoJiaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 教师防控申报
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("fangkongshenbao_jiaoshi")
public class FangkongshenbaoJiaoshiView extends FangkongshenbaoJiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 有无咳嗽的值
	*/
	@ColumnInfo(comment="有无咳嗽的字典表值",type="varchar(200)")
	private String keshouValue;
	/**
	* 有无外出的值
	*/
	@ColumnInfo(comment="有无外出的字典表值",type="varchar(200)")
	private String wuaichuValue;
	/**
	* 是否接触病患的值
	*/
	@ColumnInfo(comment="是否接触病患的字典表值",type="varchar(200)")
	private String binghuanValue;
	/**
	* 是否出入高风险区域的值
	*/
	@ColumnInfo(comment="是否出入高风险区域的字典表值",type="varchar(200)")
	private String gaofengxianValue;

	//级联表 教师
		/**
		* 教师姓名
		*/

		@ColumnInfo(comment="教师姓名",type="varchar(200)")
		private String jiaoshiName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(200)")
		private String jiaoshiPhoto;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String jiaoshiIdNumber;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String jiaoshiPhone;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String jiaoshiEmail;
		/**
		* 学院
		*/
		@ColumnInfo(comment="学院",type="int(11)")
		private Integer xuanyuanTypes;
			/**
			* 学院的值
			*/
			@ColumnInfo(comment="学院的字典表值",type="varchar(200)")
			private String xuanyuanValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jiaoshiDelete;



	public FangkongshenbaoJiaoshiView() {

	}

	public FangkongshenbaoJiaoshiView(FangkongshenbaoJiaoshiEntity fangkongshenbaoJiaoshiEntity) {
		try {
			BeanUtils.copyProperties(this, fangkongshenbaoJiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 有无咳嗽的值
	*/
	public String getKeshouValue() {
		return keshouValue;
	}
	/**
	* 设置： 有无咳嗽的值
	*/
	public void setKeshouValue(String keshouValue) {
		this.keshouValue = keshouValue;
	}
	//当前表的
	/**
	* 获取： 有无外出的值
	*/
	public String getWuaichuValue() {
		return wuaichuValue;
	}
	/**
	* 设置： 有无外出的值
	*/
	public void setWuaichuValue(String wuaichuValue) {
		this.wuaichuValue = wuaichuValue;
	}
	//当前表的
	/**
	* 获取： 是否接触病患的值
	*/
	public String getBinghuanValue() {
		return binghuanValue;
	}
	/**
	* 设置： 是否接触病患的值
	*/
	public void setBinghuanValue(String binghuanValue) {
		this.binghuanValue = binghuanValue;
	}
	//当前表的
	/**
	* 获取： 是否出入高风险区域的值
	*/
	public String getGaofengxianValue() {
		return gaofengxianValue;
	}
	/**
	* 设置： 是否出入高风险区域的值
	*/
	public void setGaofengxianValue(String gaofengxianValue) {
		this.gaofengxianValue = gaofengxianValue;
	}


	//级联表的get和set 教师

		/**
		* 获取： 教师姓名
		*/
		public String getJiaoshiName() {
			return jiaoshiName;
		}
		/**
		* 设置： 教师姓名
		*/
		public void setJiaoshiName(String jiaoshiName) {
			this.jiaoshiName = jiaoshiName;
		}

		/**
		* 获取： 头像
		*/
		public String getJiaoshiPhoto() {
			return jiaoshiPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setJiaoshiPhoto(String jiaoshiPhoto) {
			this.jiaoshiPhoto = jiaoshiPhoto;
		}

		/**
		* 获取： 身份证号
		*/
		public String getJiaoshiIdNumber() {
			return jiaoshiIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setJiaoshiIdNumber(String jiaoshiIdNumber) {
			this.jiaoshiIdNumber = jiaoshiIdNumber;
		}

		/**
		* 获取： 联系方式
		*/
		public String getJiaoshiPhone() {
			return jiaoshiPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setJiaoshiPhone(String jiaoshiPhone) {
			this.jiaoshiPhone = jiaoshiPhone;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getJiaoshiEmail() {
			return jiaoshiEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setJiaoshiEmail(String jiaoshiEmail) {
			this.jiaoshiEmail = jiaoshiEmail;
		}
		/**
		* 获取： 学院
		*/
		public Integer getXuanyuanTypes() {
			return xuanyuanTypes;
		}
		/**
		* 设置： 学院
		*/
		public void setXuanyuanTypes(Integer xuanyuanTypes) {
			this.xuanyuanTypes = xuanyuanTypes;
		}


			/**
			* 获取： 学院的值
			*/
			public String getXuanyuanValue() {
				return xuanyuanValue;
			}
			/**
			* 设置： 学院的值
			*/
			public void setXuanyuanValue(String xuanyuanValue) {
				this.xuanyuanValue = xuanyuanValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJiaoshiDelete() {
			return jiaoshiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJiaoshiDelete(Integer jiaoshiDelete) {
			this.jiaoshiDelete = jiaoshiDelete;
		}


	@Override
	public String toString() {
		return "FangkongshenbaoJiaoshiView{" +
			", keshouValue=" + keshouValue +
			", wuaichuValue=" + wuaichuValue +
			", binghuanValue=" + binghuanValue +
			", gaofengxianValue=" + gaofengxianValue +
			", jiaoshiName=" + jiaoshiName +
			", jiaoshiPhoto=" + jiaoshiPhoto +
			", jiaoshiIdNumber=" + jiaoshiIdNumber +
			", jiaoshiPhone=" + jiaoshiPhone +
			", jiaoshiEmail=" + jiaoshiEmail +
			", jiaoshiDelete=" + jiaoshiDelete +
			"} " + super.toString();
	}
}
