package com.josh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.coupon.entity.ReadmeEntity;

import java.util.Map;

/**
 * 
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:22:58
 */
public interface ReadmeService extends IService<ReadmeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

