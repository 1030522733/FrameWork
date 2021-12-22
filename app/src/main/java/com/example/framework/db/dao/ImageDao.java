package com.example.framework.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.framework.db.bean.Image;

import java.util.List;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:47
 * @Description:
 */
@Dao
public interface ImageDao {

    @Query("SELECT * FROM image")
    List<Image> getAll();

    @Query("SELECT * FROM image WHERE id LIKE :id LIMIT 1")
    Image queryBannerId(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Image... images);

    @Delete
    void delete(Image image);
}
