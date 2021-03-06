package com.sav.service.impl;

import com.blade.ioc.annotation.Bean;
import com.sav.model.User;
import com.sav.model.Video;
import com.sav.service.VideoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sha on 2017/12/28.
 */
@Bean
public class VideoServiceImpl implements VideoService{

    @Override
    public List<Video> getVideoList(){
        Video video = new Video();
        List<Video> videos = video.where("videoType", "国产自拍").findAll();
        return videos;
    }
}
