package com.huangguang.async_mysql.dao.impl;

import com.huangguang.async_mysql.dao.StudentDao;
import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.mapper.StudentMapper;
import org.apache.ibatis.annotations.Mapper;
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

    @Override
    public int save(Student student)  {
        System.out.println(student.toString());
        int i = studentMapper.insert(student);
        //Thread.sleep(50 * 1000);
        return i;
    }

    @Override
    public void insertPro(Student student) {
        System.out.println("准备调用存储过程");
        studentMapper.insertPro(student);
    }
}
