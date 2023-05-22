package com.josh.mall.product.dao;

import com.josh.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-05-22 20:39:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
