package com.huangguang.async_mysql.service;

import com.huangguang.async_mysql.entity.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 10:11
 */
public interface StudentService {

    List<Student> getStudentList();
}
