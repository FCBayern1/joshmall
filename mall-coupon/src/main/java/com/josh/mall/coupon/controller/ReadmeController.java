package com.josh.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.josh.mall.coupon.entity.ReadmeEntity;
import com.josh.mall.coupon.service.ReadmeService;
import com.josh.common.utils.PageUtils;
import com.josh.common.utils.R;



/**
 * 
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:22:58
 */
@RestController
@RequestMapping("coupon/readme")
public class ReadmeController {
    @Autowired
    private ReadmeService readmeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("coupon:readme:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = readmeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
//    @RequiresPermissions("coupon:readme:info")
    public R info(@PathVariable("id") Integer id){
		ReadmeEntity readme = readmeService.getById(id);

        return R.ok().put("readme", readme);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("coupon:readme:save")
    public R save(@RequestBody ReadmeEntity readme){
		readmeService.save(readme);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("coupon:readme:update")
    public R update(@RequestBody ReadmeEntity readme){
		readmeService.updateById(readme);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//    @RequiresPermissions("coupon:readme:delete")
    public R delete(@RequestBody Integer[] ids){
		readmeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
