package com.josh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-03-31 23:37:50
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

