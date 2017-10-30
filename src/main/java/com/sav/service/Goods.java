package com.sav.service;

import com.sav.model.GoodsInfo;

import java.util.List;

/**
 * Created by Sha on 2017/10/24.
 */
public interface Goods {
    List<GoodsInfo> initGoods();
    int deleteGoods(int id);
}
