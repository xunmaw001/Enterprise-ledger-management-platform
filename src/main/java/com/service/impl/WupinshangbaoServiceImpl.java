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


import com.dao.WupinshangbaoDao;
import com.entity.WupinshangbaoEntity;
import com.service.WupinshangbaoService;
import com.entity.vo.WupinshangbaoVO;
import com.entity.view.WupinshangbaoView;

@Service("wupinshangbaoService")
public class WupinshangbaoServiceImpl extends ServiceImpl<WupinshangbaoDao, WupinshangbaoEntity> implements WupinshangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinshangbaoEntity> page = this.selectPage(
                new Query<WupinshangbaoEntity>(params).getPage(),
                new EntityWrapper<WupinshangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinshangbaoEntity> wrapper) {
		  Page<WupinshangbaoView> page =new Query<WupinshangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinshangbaoVO> selectListVO(Wrapper<WupinshangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinshangbaoVO selectVO(Wrapper<WupinshangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinshangbaoView> selectListView(Wrapper<WupinshangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinshangbaoView selectView(Wrapper<WupinshangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
