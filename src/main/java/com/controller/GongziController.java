package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongziEntity;
import com.entity.view.GongziView;

import com.service.GongziService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 工资
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
@RestController
@RequestMapping("/gongzi")
public class GongziController {
    @Autowired
    private GongziService gongziService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongziEntity gongzi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			gongzi.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongziEntity> ew = new EntityWrapper<GongziEntity>();
		PageUtils page = gongziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongziEntity gongzi, HttpServletRequest request){
        EntityWrapper<GongziEntity> ew = new EntityWrapper<GongziEntity>();
		PageUtils page = gongziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongziEntity gongzi){
       	EntityWrapper<GongziEntity> ew = new EntityWrapper<GongziEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongzi, "gongzi")); 
        return R.ok().put("data", gongziService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongziEntity gongzi){
        EntityWrapper< GongziEntity> ew = new EntityWrapper< GongziEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongzi, "gongzi")); 
		GongziView gongziView =  gongziService.selectView(ew);
		return R.ok("查询工资成功").put("data", gongziView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        GongziEntity gongzi = gongziService.selectById(id);
        return R.ok().put("data", gongzi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        GongziEntity gongzi = gongziService.selectById(id);
        return R.ok().put("data", gongzi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongziEntity gongzi, HttpServletRequest request){
    	gongzi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzi);

        gongziService.insert(gongzi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongziEntity gongzi, HttpServletRequest request){
    	gongzi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzi);

        gongziService.insert(gongzi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongziEntity gongzi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongzi);
        gongziService.updateById(gongzi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongziService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongziEntity> wrapper = new EntityWrapper<GongziEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = gongziService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
