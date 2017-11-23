package com.huangguang.async_mysql;

import com.huangguang.async_mysql.entity.Student;
import com.huangguang.async_mysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class AsyncMysqlApplication {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(AsyncMysqlApplication.class, args);
	}

	@Scheduled(fixedDelay = 10000)
	public void save() {
		studentService.save(new Student());
	}
}
