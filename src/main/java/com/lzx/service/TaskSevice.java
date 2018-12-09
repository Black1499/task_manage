package com.lzx.service;

import com.lzx.entity.Task;
import com.lzx.vo.ApiResponse;

import java.util.List;

public interface TaskSevice {

    ApiResponse selectByTypeId(int typeId);

    ApiResponse selectByState();

    ApiResponse insertTask(Task task);

    ApiResponse updateDetail(Task task);

    ApiResponse updateState(int taskId);

    ApiResponse deleteTask(int taskId);

}
