package com.s3.controller;

import com.s3.pojo.Schedule;
import com.s3.pojo.Trip;
import com.s3.service.ScheduleService;
import com.s3.service.TripServie;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class ScheduleController {
    @Resource
    ScheduleService ss;
    @Resource
    TripServie ts;
    @RequestMapping("/show")
    public String show(Integer trip_mode_id, Model model){
        List<Schedule> list = ss.getAlls(trip_mode_id);
        model.addAttribute("list",list);
        List<Trip> list1 = ts.getAll();
        model.addAttribute("lists",list1);
        return "index";
    }

    @RequestMapping("/toadd")
    public String  toadd(Model model){
        List<Trip> list1 = ts.getAll();
        model.addAttribute("lists",list1);
        return "add";
    }

    @RequestMapping("/add")
    public String  add(Schedules schedules){
        int result = ss.add(schedules);
        if(result>0){
            return "redirect:/show";
        }else{
            return "add";
        }
    }
    @RequestMapping("/update/{id}")
    public String  update(@PathVariable("id") Integer id){
        int result = ss.update(id);
        if(result<1){
            return "redirect:/show";
        }else{
            return "redirect:/show";
        }
    }
}
