package com.example.framework.db.bean;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:39
 * @Description:
 */
//数据库表名
@Entity
public class Image {
    //主键
    @PrimaryKey
    private int id;
    private String imagePath;
    private String title;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image() {
    }

    //忽略这个构造方法
    @Ignore
    public Image(int id, String imagePath, String title, String url) {
        this.id = id;
        this.imagePath = imagePath;
        this.title = title;
        this.url = url;
    }
}
