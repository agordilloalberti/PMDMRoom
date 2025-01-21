package com.example.pmdmroom.addTasks.domain

import com.example.pmdmroom.addTasks.data.TaskRepository
import com.example.pmdmroom.addTasks.ui.model.TaskModel
import javax.inject.Inject

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.add(taskModel)
    }
}