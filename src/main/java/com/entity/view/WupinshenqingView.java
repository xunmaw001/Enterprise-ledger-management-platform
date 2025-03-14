package com.entity.view;

import com.entity.WupinshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
@TableName("wupinshenqing")
public class WupinshenqingView  extends WupinshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinshenqingView(){
	}
 
 	public WupinshenqingView(WupinshenqingEntity wupinshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, wupinshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
