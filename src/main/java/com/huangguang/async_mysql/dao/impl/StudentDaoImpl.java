package com.huangguang.async_mysql.dao.impl;

import com.huangguang.async_mysql.dao.StudentDao;
import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 10:13
 */
@Service
public class StudentDaoImpl implements StudentDao {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        Student student = new Student();
        return studentMapper.getStudentList(student);
    }
}
