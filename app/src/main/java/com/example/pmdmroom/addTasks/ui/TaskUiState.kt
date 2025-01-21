package com.example.pmdmroom.addTasks.ui

import com.example.pmdmroom.addTasks.ui.model.TaskModel

sealed interface TaskUiState {
    object Loading: TaskUiState
    data class Error(val throwable: Throwable): TaskUiState
    data class Success(val tasks:List<TaskModel>) : TaskUiState
}