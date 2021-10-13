package com.s3.service.impl;

import com.s3.mapper.ScheduleMapper;
import com.s3.pojo.Schedule;
import com.s3.service.ScheduleService;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    ScheduleMapper mapper;
    @Override
    public List<Schedule> getAlls(Integer trip_mode_id) {
        return mapper.getAlls(trip_mode_id);
    }

    @Override
    public int add(Schedules schedules) {
        return mapper.add(schedules);
    }

    @Override
    public int update(Integer id) {
        return mapper.update(id);
    }
}
