package com.example.pmdmroom.addTasks.domain

import com.example.pmdmroom.addTasks.data.TaskRepository
import com.example.pmdmroom.addTasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}