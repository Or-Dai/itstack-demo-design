package com.lyf.demo.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author lyf
 * @create 2021-08-15-17:35
 * 模拟实物商品服务
 */
public class GoodsService {

        public Boolean deliverGoods(DeliverReq req){
            System.out.println("模拟发货实物商品一个："+JSON.toJSONString(req));
            return true;
        }

}
