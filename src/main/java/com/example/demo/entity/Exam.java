package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * exam
 * @author 
 */
@Data
@NoArgsConstructor
public class Exam implements Serializable {
    private Integer id;

    private String name;

    private String address;

    private String related;

    private String sexy;

    private static final long serialVersionUID = 1L;
}