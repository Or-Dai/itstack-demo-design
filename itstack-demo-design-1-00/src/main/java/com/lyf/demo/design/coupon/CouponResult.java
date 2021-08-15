package com.lyf.demo.design.coupon;

/**
 * @author lyf
 * @create 2021-08-15-17:27
 * coupon:优惠券
 */
public class CouponResult {

    private String code; //编码
    private String info; //描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
