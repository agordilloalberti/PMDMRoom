package com.example.pmdmroom.addTasks.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TasksManageDatabase : RoomDatabase(){
    abstract fun taskDao():TaskDao
}