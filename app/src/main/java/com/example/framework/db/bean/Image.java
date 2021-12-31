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
@Entity(tableName = "image")
public class Image {
    //主键
    @PrimaryKey(autoGenerate = true)
    private int id = 0;
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

    @Ignore
    public Image(String title,String imagePath, String url) {
        this.title = title;
        this.imagePath = imagePath;
        this.url = url;
    }
}
