package com.s3.mapper;

import com.s3.pojo.Schedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.scheduling.annotation.Schedules;

import java.util.List;
@Mapper
public interface ScheduleMapper {
    List<Schedule>getAlls(@Param("trip_mode_id") Integer trip_mode_id);
    int add(Schedules schedules);
    int update(Integer id);
}
