package com.entity.vo;

import com.entity.GongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 工资
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public class GongziVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 加班薪资
	 */
	
	private Integer jiabanxinzi;
		
	/**
	 * 缺勤薪资
	 */
	
	private Integer queqinxinzi;
		
	/**
	 * 高温补贴
	 */
	
	private Integer gaowenbutie;
		
	/**
	 * 工龄奖
	 */
	
	private Integer gonglingjiang;
		
	/**
	 * 实发工资
	 */
	
	private Integer shifagongzi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：加班薪资
	 */
	 
	public void setJiabanxinzi(Integer jiabanxinzi) {
		this.jiabanxinzi = jiabanxinzi;
	}
	
	/**
	 * 获取：加班薪资
	 */
	public Integer getJiabanxinzi() {
		return jiabanxinzi;
	}
				
	
	/**
	 * 设置：缺勤薪资
	 */
	 
	public void setQueqinxinzi(Integer queqinxinzi) {
		this.queqinxinzi = queqinxinzi;
	}
	
	/**
	 * 获取：缺勤薪资
	 */
	public Integer getQueqinxinzi() {
		return queqinxinzi;
	}
				
	
	/**
	 * 设置：高温补贴
	 */
	 
	public void setGaowenbutie(Integer gaowenbutie) {
		this.gaowenbutie = gaowenbutie;
	}
	
	/**
	 * 获取：高温补贴
	 */
	public Integer getGaowenbutie() {
		return gaowenbutie;
	}
				
	
	/**
	 * 设置：工龄奖
	 */
	 
	public void setGonglingjiang(Integer gonglingjiang) {
		this.gonglingjiang = gonglingjiang;
	}
	
	/**
	 * 获取：工龄奖
	 */
	public Integer getGonglingjiang() {
		return gonglingjiang;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
