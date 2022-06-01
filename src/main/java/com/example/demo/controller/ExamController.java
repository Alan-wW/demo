package com.example.demo.controller;

import com.example.demo.entity.Exam;
import com.example.demo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 邢彬
 * @Date: 2022/06/01/08:51
 * @Description:
 */
@RestController
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
}
