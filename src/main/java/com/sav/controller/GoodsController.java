package com.sav.controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.sav.common.BaseMessage;
import com.sav.component.i18n.BaseMessageUtil;
import com.sav.constants.MsgInfoType;
import com.sav.constants.MsgOpType;
import com.sav.model.GoodsInfo;
import com.sav.service.Goods;

import java.util.List;

/**
 * Created by Sha on 2017/10/24.
 */
@Path(value = "/good")
public class GoodsController {

    @Inject
    private BaseMessageUtil baseMessageUtil;
    @Inject
    private Goods goods;

    @Route(value = "/init", method = HttpMethod.GET)
    public BaseMessage home() {
    List<GoodsInfo> result = goods.initGoods();
     return baseMessageUtil.success(MsgInfoType.GROUP, "", MsgOpType.ADD).data(result);
}

}
