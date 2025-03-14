package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinshangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinshangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinshangbaoView;


/**
 * 物品上报
 *
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public interface WupinshangbaoService extends IService<WupinshangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinshangbaoVO> selectListVO(Wrapper<WupinshangbaoEntity> wrapper);
   	
   	WupinshangbaoVO selectVO(@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);
   	
   	List<WupinshangbaoView> selectListView(Wrapper<WupinshangbaoEntity> wrapper);
   	
   	WupinshangbaoView selectView(@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinshangbaoEntity> wrapper);
   	
}

