package com.sav;

import com.blade.Blade;

/**
 * Created by Sha on 2017/10/23.
 */
public class Application {
    public static void main(String[] args) {
        Blade.me().get("/", (req, res) -> res.text("Hello World!")).start(Application.class, args);
    }
}
