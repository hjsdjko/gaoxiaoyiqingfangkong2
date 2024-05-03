package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.FangkongshenbaoXueshengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 学生防控申报
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("fangkongshenbao_xuesheng")
public class FangkongshenbaoXueshengView extends FangkongshenbaoXueshengEntity implements Serializable {
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

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 宿舍号
		*/

		@ColumnInfo(comment="宿舍号",type="varchar(200)")
		private String yonghuSuse;
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
		private Integer yonghuDelete;



	public FangkongshenbaoXueshengView() {

	}

	public FangkongshenbaoXueshengView(FangkongshenbaoXueshengEntity fangkongshenbaoXueshengEntity) {
		try {
			BeanUtils.copyProperties(this, fangkongshenbaoXueshengEntity);
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


	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 宿舍号
		*/
		public String getYonghuSuse() {
			return yonghuSuse;
		}
		/**
		* 设置： 宿舍号
		*/
		public void setYonghuSuse(String yonghuSuse) {
			this.yonghuSuse = yonghuSuse;
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
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "FangkongshenbaoXueshengView{" +
			", keshouValue=" + keshouValue +
			", wuaichuValue=" + wuaichuValue +
			", binghuanValue=" + binghuanValue +
			", gaofengxianValue=" + gaofengxianValue +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhone=" + yonghuPhone +
			", yonghuEmail=" + yonghuEmail +
			", yonghuSuse=" + yonghuSuse +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
