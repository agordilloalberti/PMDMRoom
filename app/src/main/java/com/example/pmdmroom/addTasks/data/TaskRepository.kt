package com.example.pmdmroom.addTasks.data

import com.example.pmdmroom.addTasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor(private val taskDao: TaskDao) {
    val tasks: Flow<List<TaskModel>> = taskDao.getTasks().map { items -> items.map { TaskModel(it.id, it.task, it.selected) } }


    suspend fun add(taskModel: TaskModel) {
        val taskEntity = TaskEntity(
            id = taskModel.id,
            task = taskModel.task,
            selected = taskModel.selected
        )
        taskDao.addTask(taskEntity)
    }
}

fun TaskModel.toData(): TaskEntity {
    return TaskEntity(this.id, this.task, this.selected)
}