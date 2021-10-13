package com.s3.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    private Integer id;
    private String user_name;
    private String duty;
    private Integer trip_mode_id;
    private Integer status;
    private String depart_time;

}
