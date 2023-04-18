package com.josh.mall.coupon.dao;

import com.josh.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 18:22:54
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
