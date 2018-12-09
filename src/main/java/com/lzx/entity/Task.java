package com.lzx.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Task {
    private Integer taskId;

    private Integer typeId;

    private Integer userId;

    private String taskDetail;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskCreatedAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskFinishedAt;

    private Boolean taskState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail == null ? null : taskDetail.trim();
    }

    public Date getTaskCreatedAt() {
        return taskCreatedAt;
    }

    public void setTaskCreatedAt(Date taskCreatedAt) {
        this.taskCreatedAt = taskCreatedAt;
    }

    public Date getTaskFinishedAt() {
        return taskFinishedAt;
    }

    public void setTaskFinishedAt(Date taskFinishedAt) {
        this.taskFinishedAt = taskFinishedAt;
    }

    public Boolean getTaskState() {
        return taskState;
    }

    public void setTaskState(Boolean taskState) {
        this.taskState = taskState;
    }

    public Task() {
    }

    public Task(Integer taskId, Integer userId,String taskDetail) {
        this.userId = userId;
        this.taskId = taskId;
        this.taskDetail = taskDetail;
    }

    public Task(Integer taskId ,Date taskFinishedAt, Boolean taskState) {
        this.taskId = taskId;
        this.taskFinishedAt = taskFinishedAt;
        this.taskState = taskState;
    }


}