package com.example.demo.service;

import com.example.demo.entity.Exam;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 邢彬
 * @Date: 2022/06/01/08:52
 * @Description:
 */
public interface ExamService {
    Exam selectByPrimaryName(String name);
    int insertSelective(Exam record);
    int updateByPrimaryKeySelective(Exam record);
    List<Exam> selectAll();
}
