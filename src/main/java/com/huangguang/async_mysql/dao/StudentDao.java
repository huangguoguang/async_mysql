package com.huangguang.async_mysql.dao;

import com.huangguang.async_mysql.entity.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 10:12
 */
public interface StudentDao {

    List<Student> getStudentList();


    int save(Student student);


    //模拟调用存储过程
    void insertPro(Student student);
}
