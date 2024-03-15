package com.linkpay.agencyBase;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.linkpay")
@MapperScan("com.linkpay.agencyBase.mapper")
public class AgencyBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.linkpay.agencyBase.AgencyBaseApplication.class, args);
	}

}
