package com.josh.mall.coupon.dao;

import com.josh.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:22:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
