package com.josh.mall.member.feign;

import com.josh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: Coupon service call
 * Author: joshua
 * Date: 2023/4/6
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
