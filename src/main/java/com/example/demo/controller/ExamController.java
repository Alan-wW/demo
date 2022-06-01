package com.example.demo.controller;

import com.example.demo.entity.Exam;
import com.example.demo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 邢彬
 * @Date: 2022/06/01/08:51
 * @Description:
 */
@RestController
@CrossOrigin
public class ExamController {
    @Autowired
    private ExamService service;

    @GetMapping("/name")
    public Exam selectByName(@RequestParam("name") String name){
        return service.selectByPrimaryName(name);
    }
    @PostMapping("/insert")
    public int insert(Exam exam){
        return service.insertSelective(exam);
    }
    @GetMapping("/getall")
    public List<Exam> getList(){
        return service.selectAll();
    }
    @PostMapping("/update")
    public int update(Exam exam){
        return service.updateByPrimaryKeySelective(exam);
    }
}
