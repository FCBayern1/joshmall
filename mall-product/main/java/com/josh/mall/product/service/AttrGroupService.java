package com.josh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-03-31 23:37:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

