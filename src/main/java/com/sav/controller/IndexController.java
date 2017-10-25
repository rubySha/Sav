package com.sav.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;

/**
 * Created by Sha on 2017/10/23.
 */
@Path
public class IndexController {

//    @Route(value = "/home", method = HttpMethod.GET)
    public String home(){
        return "index.html";
    }

}
