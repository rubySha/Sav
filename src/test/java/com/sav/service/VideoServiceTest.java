package com.sav.service;

import com.blade.ioc.annotation.Inject;
import com.sav.model.Video;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;


/**
 * Created by Sha on 2018/1/11.
 */
public class VideoServiceTest extends TestCase {

    @Inject
    private VideoService videoService;

    @Test
    public void test(){
        List<Video> list = videoService.getVideoList();
        System.out.print("");
    }

}
