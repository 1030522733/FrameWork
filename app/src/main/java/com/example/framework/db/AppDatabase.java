package com.example.framework.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.framework.db.bean.Image;
import com.example.framework.db.dao.ImageDao;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:38
 * @Description:
 */
//通过注解方式数据库，在里面建了一个表，规定版本号，且不允许导出
@Database(entities = {Image.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    //定了一个抽象方法imageDao()。Room库会采用编译时技术对这个ImageDao 进行实现。
    public abstract ImageDao imageDao();
}
