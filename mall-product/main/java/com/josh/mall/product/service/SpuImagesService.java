package com.josh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.josh.common.utils.PageUtils;
import com.josh.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-03-31 23:37:52
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

