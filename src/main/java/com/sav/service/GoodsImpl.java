package com.sav.service;

import com.blade.ioc.annotation.Bean;
import com.sav.model.Goods_info;

import java.util.List;

/**
 * Created by Sha on 2017/10/24.
 */
@Bean
public class GoodsImpl implements Goods{

    @Override
    public List<Goods_info> initGoods(){
        Goods_info goods_info  = new Goods_info();
        List<Goods_info> goods = goods_info.findAll();
        System.out.println(goods);
        return goods;
    }

    @Override
    public int deleteGoods(int id){
        return 1;
    }

}
