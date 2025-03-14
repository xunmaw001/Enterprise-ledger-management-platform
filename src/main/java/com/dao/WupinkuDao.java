package com.dao;

import com.entity.WupinkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinkuVO;
import com.entity.view.WupinkuView;


/**
 * 物品库
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public interface WupinkuDao extends BaseMapper<WupinkuEntity> {
	
	List<WupinkuVO> selectListVO(@Param("ew") Wrapper<WupinkuEntity> wrapper);
	
	WupinkuVO selectVO(@Param("ew") Wrapper<WupinkuEntity> wrapper);
	
	List<WupinkuView> selectListView(@Param("ew") Wrapper<WupinkuEntity> wrapper);

	List<WupinkuView> selectListView(Pagination page,@Param("ew") Wrapper<WupinkuEntity> wrapper);
	
	WupinkuView selectView(@Param("ew") Wrapper<WupinkuEntity> wrapper);
	
}
