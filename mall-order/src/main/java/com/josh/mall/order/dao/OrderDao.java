package com.josh.mall.order.dao;

import com.josh.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:42:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
