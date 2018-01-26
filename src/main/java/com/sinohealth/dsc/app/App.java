package com.sinohealth.dsc.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.sinohealth.dsc.controller", "com.sinohealth.dsc.service" })
@MapperScan(basePackages="com.sinohealth.dsc.mapper")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
