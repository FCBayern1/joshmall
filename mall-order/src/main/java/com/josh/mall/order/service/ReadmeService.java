package com.josh.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.order.entity.ReadmeEntity;

import java.util.Map;

/**
 * 
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:42:53
 */
public interface ReadmeService extends IService<ReadmeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

