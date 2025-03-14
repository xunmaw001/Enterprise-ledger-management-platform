package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
@TableName("gongzi")
public class GongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongziEntity() {
		
	}
	
	public GongziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
