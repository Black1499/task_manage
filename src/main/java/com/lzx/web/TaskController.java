package com.lzx.web;

import com.lzx.entity.Task;
import com.lzx.service.TaskServiceImpl;
import com.lzx.vo.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskService;

    @GetMapping("/state")
    @ResponseBody
    public ApiResponse getTaskByState() {
        return  taskService.selectByState();
    }

    @GetMapping("/{typeId}")
    @ResponseBody
    public ApiResponse getTaskByTypeId(@PathVariable("typeId") int typeId) {
        return  taskService.selectByTypeId(typeId);
    }

    @PostMapping
    @ResponseBody
    public ApiResponse addTask(@RequestBody Task task){
        return taskService.insertTask(task);
    }

    @PutMapping
    @ResponseBody
    public ApiResponse updateTaskDetail(@RequestBody Task task){
        return taskService.updateDetail(task);
    }


    @PutMapping("/{taskId}")
    @ResponseBody
    public ApiResponse updateTaskState(@PathVariable("taskId")int taskId){
        return taskService.updateState(taskId);
    }


    @DeleteMapping("/{taskId}")
    @ResponseBody
    public ApiResponse deleteTaskById(@PathVariable("taskId")int taskId){
        return taskService.deleteTask(taskId);
    }


}
