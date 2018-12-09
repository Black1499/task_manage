package com.lzx.web;

import com.lzx.entity.TaskType;
import com.lzx.service.TaskTypeServicImpl;
import com.lzx.vo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/taskType")
public class TaskTypeController {

    @Autowired
    private TaskTypeServicImpl service;


    @ResponseBody
    @GetMapping
    public ApiResponse listAll(){
        return service.selectTaskTypeAll();
    }

    @ResponseBody
    @PostMapping
    public ApiResponse addTaskType(@RequestBody TaskType taskType){
        return service.insertTaskType(taskType);
    }

    @ResponseBody
    @DeleteMapping("{taskTypeId}")
    public ApiResponse deleteTaskType(@PathVariable("taskTypeId")int taskTypeId){
        return service.deleteTaskType(taskTypeId);
    }

    @ResponseBody
    @PutMapping
    public ApiResponse updateTaskType(@RequestBody TaskType taskType){
        return service.updateTask(taskType);
    }
}
