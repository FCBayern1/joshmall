package com.josh.mall.order.dao;

import com.josh.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:42:52
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
