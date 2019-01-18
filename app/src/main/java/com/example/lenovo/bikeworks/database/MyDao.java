package com.example.lenovo.bikeworks.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;
@Dao
public interface MyDao {

    @Query("select * from MyData")
    List<MyData> getAllData();
    @Insert
    void insert(MyData m);
    @Update
    void upadateData(MyData m);
    @Delete
    void deleteData(MyData m);

}
