package com.lzx.dao;

import com.lzx.entity.Task;
import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(Task record);

    List<Task> selectByTypeId(Integer typeId);

    List<Task> selectByState();

    int updateByPrimaryKey(Task record);

    int updateState(Integer taskId);
}