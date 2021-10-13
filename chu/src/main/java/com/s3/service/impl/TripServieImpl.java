package com.s3.service.impl;

import com.s3.mapper.TripMapper;
import com.s3.pojo.Trip;
import com.s3.service.TripServie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TripServieImpl implements TripServie {
    @Resource
    TripMapper mapper;
    @Override
    public List<Trip> getAll() {
        return mapper.getAll();
    }
}
