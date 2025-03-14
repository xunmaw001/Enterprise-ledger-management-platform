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


import com.dao.WupinkuDao;
import com.entity.WupinkuEntity;
import com.service.WupinkuService;
import com.entity.vo.WupinkuVO;
import com.entity.view.WupinkuView;

@Service("wupinkuService")
public class WupinkuServiceImpl extends ServiceImpl<WupinkuDao, WupinkuEntity> implements WupinkuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinkuEntity> page = this.selectPage(
                new Query<WupinkuEntity>(params).getPage(),
                new EntityWrapper<WupinkuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinkuEntity> wrapper) {
		  Page<WupinkuView> page =new Query<WupinkuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinkuVO> selectListVO(Wrapper<WupinkuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinkuVO selectVO(Wrapper<WupinkuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinkuView> selectListView(Wrapper<WupinkuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinkuView selectView(Wrapper<WupinkuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
