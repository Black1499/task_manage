package com.lzx.service;

import com.lzx.dao.TaskMapper;
import com.lzx.entity.Task;
import com.lzx.vo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskSevice {

    @Autowired
    private TaskMapper taskMapper;

    private List<Task> list = null;

    private int num = 0;

    @Override
    public ApiResponse selectByTypeId(int typeId) {
        list = taskMapper.selectByTypeId(typeId);
        if (list == null) {
            return new ApiResponse(203, "该类型数据为空");
        } else {
            return new ApiResponse(200, list);
        }
    }

    @Override
    public ApiResponse selectByState() {
        list = taskMapper.selectByState();
        if (list == null) {
            return new ApiResponse(203, "该类型数据为空");
        } else {
            return new ApiResponse(200, list);
        }
    }

    @Override
    public ApiResponse insertTask(Task task) {
        if (task == null) {
            return new ApiResponse(403, "数据传输错误");
        } else {
            num = taskMapper.insert(task);
            if (num == 0) {
                return new ApiResponse(500, "插入失败");
            } else {
                return new ApiResponse(200, "插入成功");
            }
        }

    }

    @Override
    public ApiResponse updateDetail(Task task) {
        if (task == null) {
            return new ApiResponse(403, "数据传输错误");
        } else {
            num = taskMapper.updateByPrimaryKey(task);
            if (num == 0) {
                return new ApiResponse(500, "修改失败");
            } else {
                return new ApiResponse(200, "修改成功");
            }
        }

    }

    @Override
    public ApiResponse updateState(int taskId) {
        num = taskMapper.updateState(taskId);
        if (num == 0) {
            return new ApiResponse(500, "修改失败");
        } else {
            return new ApiResponse(200, "修改成功");
        }
    }

    @Override
    public ApiResponse deleteTask(int taskId) {
        num = taskMapper.deleteByPrimaryKey(taskId);
        if (num == 0) {
            return new ApiResponse(500, "删除失败");
        } else {
            return new ApiResponse(200, "删除成功");
        }
    }

}
