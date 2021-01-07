package com.james.gulimall.member.feign;

import com.james.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式远程调用接口
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/memberCouponTest")
    public R memberCouponsTest();
}
