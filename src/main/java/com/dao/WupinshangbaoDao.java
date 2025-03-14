package com.dao;

import com.entity.WupinshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinshangbaoVO;
import com.entity.view.WupinshangbaoView;


/**
 * 物品上报
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public interface WupinshangbaoDao extends BaseMapper<WupinshangbaoEntity> {
	
	List<WupinshangbaoVO> selectListVO(@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);
	
	WupinshangbaoVO selectVO(@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);
	
	List<WupinshangbaoView> selectListView(@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);

	List<WupinshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);
	
	WupinshangbaoView selectView(@Param("ew") Wrapper<WupinshangbaoEntity> wrapper);
	
}
