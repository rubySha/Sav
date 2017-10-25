package com.sav.model;

import com.blade.jdbc.annotation.Table;
import com.blade.jdbc.core.ActiveRecord;

/**
 * Created by Sha on 2017/10/24.
 */
@Table(value = "goods_info")
public class Goods_info extends ActiveRecord {
//    private int id;
    private String goods_id;
    private String goods_name;
    private String img_url;
    private String goods_price;


    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }
}
