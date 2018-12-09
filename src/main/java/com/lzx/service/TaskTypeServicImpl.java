package com.lzx.service;

import com.lzx.dao.TaskTypeMapper;
import com.lzx.entity.TaskType;
import com.lzx.vo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskTypeServicImpl implements TaskTypeService {

    @Autowired
    private TaskTypeMapper taskTypeMapper;

    private List<TaskType> list = null;

    private int num = 0;

    @Override
    public ApiResponse selectTaskTypeAll() {
        list = taskTypeMapper.selectAll();
        if (list == null) {
            return new ApiResponse(203, "该类型数据为空");
        } else {
            return new ApiResponse(200, list);
        }
    }

    @Override
    public ApiResponse insertTaskType(TaskType taskType) {
        if (taskType == null) {
            return new ApiResponse(403, "数据传输错误");
        } else {
            num = taskTypeMapper.insert(taskType);
            if (num == 0) {
                return new ApiResponse(500, "添加失败");
            } else {
                return new ApiResponse(200, "添加成功");
            }
        }
    }

    @Override
    public ApiResponse deleteTaskType(int typeId) {
        num = taskTypeMapper.deleteByPrimaryKey(typeId);
        if (num == 0) {
            return new ApiResponse(500, "删除失败");
        } else {
            return new ApiResponse(200, "删除成功");
        }
    }

    @Override
    public ApiResponse updateTask(TaskType taskType) {
        num = taskTypeMapper.updateByPrimaryKey(taskType);
        if (num == 0) {
            return new ApiResponse(500, "修改失败");
        } else {
            return new ApiResponse(200, "修改成功");
        }
    }
}
