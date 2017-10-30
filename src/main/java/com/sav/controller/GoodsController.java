package com.sav.controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.sav.model.GoodsInfo;
import com.sav.service.Goods;

import java.util.List;

/**
 * Created by Sha on 2017/10/24.
 */
@Path
public class GoodsController {

    @Inject
    private Goods goods;

    @Route(value = "/init", method = HttpMethod.GET)
    public List<GoodsInfo> home() {
    List<GoodsInfo> result = goods.initGoods();
        return result;
}

}
