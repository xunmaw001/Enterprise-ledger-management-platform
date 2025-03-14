package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinshenqingView;


/**
 * 物品申请
 *
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public interface WupinshenqingService extends IService<WupinshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinshenqingVO> selectListVO(Wrapper<WupinshenqingEntity> wrapper);
   	
   	WupinshenqingVO selectVO(@Param("ew") Wrapper<WupinshenqingEntity> wrapper);
   	
   	List<WupinshenqingView> selectListView(Wrapper<WupinshenqingEntity> wrapper);
   	
   	WupinshenqingView selectView(@Param("ew") Wrapper<WupinshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinshenqingEntity> wrapper);
   	
}

