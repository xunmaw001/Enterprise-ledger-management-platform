package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WupinshenqingDao;
import com.entity.WupinshenqingEntity;
import com.service.WupinshenqingService;
import com.entity.vo.WupinshenqingVO;
import com.entity.view.WupinshenqingView;

@Service("wupinshenqingService")
public class WupinshenqingServiceImpl extends ServiceImpl<WupinshenqingDao, WupinshenqingEntity> implements WupinshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinshenqingEntity> page = this.selectPage(
                new Query<WupinshenqingEntity>(params).getPage(),
                new EntityWrapper<WupinshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinshenqingEntity> wrapper) {
		  Page<WupinshenqingView> page =new Query<WupinshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinshenqingVO> selectListVO(Wrapper<WupinshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinshenqingVO selectVO(Wrapper<WupinshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinshenqingView> selectListView(Wrapper<WupinshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinshenqingView selectView(Wrapper<WupinshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
