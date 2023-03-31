package com.josh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-03-31 23:37:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

