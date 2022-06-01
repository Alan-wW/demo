package com.example.demo.service.impl;

import com.example.demo.entity.Exam;
import com.example.demo.mapper.ExamDao;
import com.example.demo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 邢彬
 * @Date: 2022/06/01/08:52
 * @Description:
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamDao examDao;

    @Override
    public Exam selectByPrimaryName(String name) {
        return examDao.selectByPrimaryName(name);
    }

    @Override
    public int insertSelective(Exam record) {
        return examDao.insertSelective(record);
    }
}
