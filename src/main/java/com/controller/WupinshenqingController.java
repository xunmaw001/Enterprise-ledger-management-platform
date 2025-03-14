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

import com.entity.WupinshenqingEntity;
import com.entity.view.WupinshenqingView;

import com.service.WupinshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 物品申请
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-30 14:34:20
 */
@RestController
@RequestMapping("/wupinshenqing")
public class WupinshenqingController {
    @Autowired
    private WupinshenqingService wupinshenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WupinshenqingEntity wupinshenqing, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wupinshenqing.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WupinshenqingEntity> ew = new EntityWrapper<WupinshenqingEntity>();
		PageUtils page = wupinshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinshenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WupinshenqingEntity wupinshenqing, HttpServletRequest request){
        EntityWrapper<WupinshenqingEntity> ew = new EntityWrapper<WupinshenqingEntity>();
		PageUtils page = wupinshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WupinshenqingEntity wupinshenqing){
       	EntityWrapper<WupinshenqingEntity> ew = new EntityWrapper<WupinshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wupinshenqing, "wupinshenqing")); 
        return R.ok().put("data", wupinshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WupinshenqingEntity wupinshenqing){
        EntityWrapper< WupinshenqingEntity> ew = new EntityWrapper< WupinshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wupinshenqing, "wupinshenqing")); 
		WupinshenqingView wupinshenqingView =  wupinshenqingService.selectView(ew);
		return R.ok("查询物品申请成功").put("data", wupinshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        WupinshenqingEntity wupinshenqing = wupinshenqingService.selectById(id);
        return R.ok().put("data", wupinshenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        WupinshenqingEntity wupinshenqing = wupinshenqingService.selectById(id);
        return R.ok().put("data", wupinshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WupinshenqingEntity wupinshenqing, HttpServletRequest request){
    	wupinshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinshenqing);

        wupinshenqingService.insert(wupinshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WupinshenqingEntity wupinshenqing, HttpServletRequest request){
    	wupinshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinshenqing);

        wupinshenqingService.insert(wupinshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WupinshenqingEntity wupinshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wupinshenqing);
        wupinshenqingService.updateById(wupinshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wupinshenqingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WupinshenqingEntity> wrapper = new EntityWrapper<WupinshenqingEntity>();
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

		int count = wupinshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
