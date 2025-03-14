package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinkuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinkuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinkuView;


/**
 * 物品库
 *
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public interface WupinkuService extends IService<WupinkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinkuVO> selectListVO(Wrapper<WupinkuEntity> wrapper);
   	
   	WupinkuVO selectVO(@Param("ew") Wrapper<WupinkuEntity> wrapper);
   	
   	List<WupinkuView> selectListView(Wrapper<WupinkuEntity> wrapper);
   	
   	WupinkuView selectView(@Param("ew") Wrapper<WupinkuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinkuEntity> wrapper);
   	
}

