package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(XxlJobAdminApplication.class, args);
		String dbUrl = context.getEnvironment().getProperty("spring.datasource.dynamic.datasource.master.url");
		System.err.println("连接到数据库::" +dbUrl);
	}

}