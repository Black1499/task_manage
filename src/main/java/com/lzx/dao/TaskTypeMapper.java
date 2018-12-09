package com.lzx.dao;

import com.lzx.entity.TaskType;
import java.util.List;

public interface TaskTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(TaskType record);

    TaskType selectByPrimaryKey(Integer typeId);

    List<TaskType> selectAll();

    int updateByPrimaryKey(TaskType record);
}