package com.sav.model;

import com.blade.jdbc.annotation.Table;
import com.blade.jdbc.core.ActiveRecord;

import java.util.Date;

/**
 * Created by Sha on 2017/11/7.
 */
@Table(value = "video_info")
public class Video extends ActiveRecord {
    private Integer videoId;
    private String  videoType;
    private String  videoUrl;
    private String  videoImgUrl;
    private String  videoDate;
    private Date    videoSpiderDate;
    private String  videoRegion;
    private String  videoTitle;
    private String  videoTag;

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoImgUrl() {
        return videoImgUrl;
    }

    public void setVideoImgUrl(String videoImgUrl) {
        this.videoImgUrl = videoImgUrl;
    }

    public String getVideoDate() {
        return videoDate;
    }

    public void setVideoDate(String videoDate) {
        this.videoDate = videoDate;
    }

    public Date getVideoSpiderDate() {
        return videoSpiderDate;
    }

    public void setVideoSpiderDate(Date videoSpiderDate) {
        this.videoSpiderDate = videoSpiderDate;
    }

    public String getVideoRegion() {
        return videoRegion;
    }

    public void setVideoRegion(String videoRegion) {
        this.videoRegion = videoRegion;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoTag() {
        return videoTag;
    }

    public void setVideoTag(String videoTag) {
        this.videoTag = videoTag;
    }
}
