package com.huangguang.async_mysql.listener;

import com.huangguang.async_mysql.dao.StudentDao;
import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.event.StudentEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 14:20
 */
@Service
public class StudentEventListener {
    @Autowired
    private StudentDao studentDao;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Async
    @EventListener
    public void save(ApplicationEvent event) {
        if (event instanceof StudentEvent) {
            logger.info("监听到事件：");
            StudentEvent studentEvent = (StudentEvent) event;
            Student student = (Student) studentEvent.getSource();
            logger.info(student.toString());
            studentDao.save(student);
        }
    }
}
