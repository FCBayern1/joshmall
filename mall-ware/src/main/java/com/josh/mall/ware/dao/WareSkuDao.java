package com.josh.mall.ware.dao;

import com.josh.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 19:04:15
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
