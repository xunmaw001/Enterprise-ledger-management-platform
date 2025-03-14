package com.entity.view;

import com.entity.WupinkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
@TableName("wupinku")
public class WupinkuView  extends WupinkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinkuView(){
	}
 
 	public WupinkuView(WupinkuEntity wupinkuEntity){
 	try {
			BeanUtils.copyProperties(this, wupinkuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
