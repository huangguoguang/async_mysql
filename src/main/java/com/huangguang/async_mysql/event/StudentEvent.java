package com.huangguang.async_mysql.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * User : huangguang
 * DATE : 2017-11-23 14:17
 */
public class StudentEvent extends ApplicationEvent {
    public StudentEvent(Object source) {
        super(source);
    }
}
