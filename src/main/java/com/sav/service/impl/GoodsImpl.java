package com.sav.service.impl;

import com.blade.ioc.annotation.Bean;
import com.sav.model.GoodsInfo;
import com.sav.service.Goods;

import java.util.List;

/**
 * Created by Sha on 2017/10/24.
 */
@Bean
public class GoodsImpl implements Goods {

    @Override
    public List<GoodsInfo> initGoods(){
        GoodsInfo goodsInfo  = new GoodsInfo();
        List<GoodsInfo> goods = goodsInfo.findAll();
        System.out.println(goods);
        return goods;
    }

    @Override
    public int deleteGoods(int id){
        return 1;
    }

}
