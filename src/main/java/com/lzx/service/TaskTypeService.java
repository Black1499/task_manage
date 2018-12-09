package com.lzx.service;

import com.lzx.entity.TaskType;
import com.lzx.vo.ApiResponse;

import java.util.List;

public interface TaskTypeService {

    ApiResponse selectTaskTypeAll();

    ApiResponse insertTaskType(TaskType taskType);

    ApiResponse deleteTaskType(int typeId);

    ApiResponse updateTask(TaskType taskType);
}
