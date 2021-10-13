package com.s3.mapper;

import com.s3.pojo.Trip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TripMapper {
    List<Trip>getAll();
}
