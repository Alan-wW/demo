package com.example.demo.service;

import com.example.demo.entity.Exam;
import org.springframework.stereotype.Service;

/**
 * @Author: 邢彬
 * @Date: 2022/06/01/08:52
 * @Description:
 */
public interface ExamService {
    Exam selectByPrimaryName(String name);
    int insertSelective(Exam record);
}
