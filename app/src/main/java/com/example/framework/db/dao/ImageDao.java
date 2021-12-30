package com.example.framework.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.framework.db.bean.Image;

import java.util.List;
import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * @Author: JianTours
 * @Data: 2021/12/22 21:47
 * @Description:
 */
@Dao
public interface ImageDao {
    /**
     *这里我增加了一个Flowable和Completable。由于读取速率可能 远大于 观察者处理速率，
     * 故使用背压 Flowable 模式，这是为了防止表中数据过多，读取速率远大于接收数据，
     * 从而导致内存溢出的问题，Completable就是操作完成的回调，可以感知操作成功或失败， onComplete和onError。
     * ————————————————
     */

    @Query("SELECT * FROM image")
    Flowable<List<Image>> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertAll(List<Image> images);

    @Query("DELETE FROM image")
    Completable deleteAll();
}
