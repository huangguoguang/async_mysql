package com.huangguang.async_mysql.service.impl;

import com.huangguang.async_mysql.config.StudentProperties;
import com.huangguang.async_mysql.dao.StudentDao;
import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.event.StudentEvent;
import com.huangguang.async_mysql.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 10:12
 */
@Service
public class StudentServiceImpl implements StudentService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private StudentProperties properties;

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    @Override
    public int save(Student student) {
        long start = System.currentTimeMillis();
        student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        student.setName(properties.getName());
        student.setAddress(properties.getAddress());
        student.setSex(properties.getSex());
        student.setBirth(properties.getBirth());
        student.setDepartment(properties.getDepartment());
        context.publishEvent(new StudentEvent(student));
        long end = System.currentTimeMillis();
        logger.info("执行时间:{}", end - start);
        return 1;
    }
}
