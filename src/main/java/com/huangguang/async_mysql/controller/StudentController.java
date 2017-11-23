package com.huangguang.async_mysql.controller;

import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 10:00
 */
@RestController
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "list")
    public List<Student> getStudentList() {
        List<Student> list = studentService.getStudentList();
        return list;
    }
}
