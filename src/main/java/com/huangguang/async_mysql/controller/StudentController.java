package com.huangguang.async_mysql.controller;

import com.huangguang.async_mysql.entity.ResultMessage;
import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    @RequestMapping(value = "save")
    public ResultMessage saveStudent(@ModelAttribute Student student) {
        ResultMessage resultMessage = new ResultMessage();
        try {
           studentService.save(student);
           resultMessage.setCode(200);
           resultMessage.setMessage("成功");
        } catch (Exception e) {
            resultMessage.setCode(500);
            resultMessage.setMessage("失败");
        }
        return resultMessage;
    }

    @Scheduled(cron = "${schedule.cronTime}")
    public void testCron() {
        System.out.println("执行定时任务" + new Date());
        studentService.save(new Student());
    }
}
