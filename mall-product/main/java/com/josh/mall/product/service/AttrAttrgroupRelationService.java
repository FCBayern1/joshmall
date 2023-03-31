package com.josh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-03-31 23:37:52
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

