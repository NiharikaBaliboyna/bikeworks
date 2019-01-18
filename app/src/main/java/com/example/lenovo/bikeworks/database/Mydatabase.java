package com.example.lenovo.bikeworks.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {MyData.class},version=1,exportSchema = true)
public abstract class Mydatabase extends RoomDatabase {
    public abstract MyDao myDao();
}
