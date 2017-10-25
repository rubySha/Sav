package com.sav.service;

import com.blade.ioc.annotation.Bean;
import com.sav.model.Goods_info;

import java.util.List;

/**
 * Created by Sha on 2017/10/24.
 */
public interface Goods {
    List<Goods_info> initGoods();
    int deleteGoods(int id);
}
