package com.s3.service;

import com.s3.pojo.Schedule;
import org.springframework.scheduling.annotation.Schedules;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAlls( Integer trip_mode_id);
    int add(Schedules schedules);
    int update(Integer id);
}
