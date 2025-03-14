package com.dao;

import com.entity.WupinshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinshenqingVO;
import com.entity.view.WupinshenqingView;


/**
 * 物品申请
 * 
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
public interface WupinshenqingDao extends BaseMapper<WupinshenqingEntity> {
	
	List<WupinshenqingVO> selectListVO(@Param("ew") Wrapper<WupinshenqingEntity> wrapper);
	
	WupinshenqingVO selectVO(@Param("ew") Wrapper<WupinshenqingEntity> wrapper);
	
	List<WupinshenqingView> selectListView(@Param("ew") Wrapper<WupinshenqingEntity> wrapper);

	List<WupinshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<WupinshenqingEntity> wrapper);
	
	WupinshenqingView selectView(@Param("ew") Wrapper<WupinshenqingEntity> wrapper);
	
}
