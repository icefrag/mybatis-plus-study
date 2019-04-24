package com.wurui.demomybatisplusstudy;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.wurui.demomybatisplusstudy")
public class DemomybatisPlusStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomybatisPlusStudyApplication.class, args);
	}

	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
}
