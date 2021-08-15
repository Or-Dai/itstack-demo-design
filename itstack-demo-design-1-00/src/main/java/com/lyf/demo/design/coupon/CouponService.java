package com.lyf.demo.design.coupon;

/**
 * @author lyf
 * @create 2021-08-15-17:29
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber ,String uuid){
        System.out.println("模拟随机发放优惠券一张："+uId+","+couponNumber+","+uuid);
        return new CouponResult("0000","发放成功");
    }
}
