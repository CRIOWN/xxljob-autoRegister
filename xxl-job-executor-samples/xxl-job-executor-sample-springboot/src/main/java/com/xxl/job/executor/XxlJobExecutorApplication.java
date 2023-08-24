package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
public class XxlJobExecutorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(XxlJobExecutorApplication.class, args);
		String dbUrl = context.getEnvironment().getProperty("spring.datasource.url");
		System.err.println("连接到数据库::" +dbUrl);
	}

}