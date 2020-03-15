package com.iv.org.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.iv.org.biz.config.ServiceConfig;

@Configuration
@ComponentScan("com.iv.org.service.controller")
@Import({ServiceConfig.class})
public class ProjectConfig {

}
