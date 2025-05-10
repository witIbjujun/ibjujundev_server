package com.wit.inspaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/WIT/**").allowedOrigins("http://ibjujundev.cafe24.com");
    }
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	// 파일 시스템의 경로
    	registry.addResourceHandler("/WIT/**").addResourceLocations("file:/ibjujundev/tomcat/webapps/FILE/ibjujun/");
    	registry.addResourceHandler("/WIT/Board/**").addResourceLocations("file:/ibjujundev/tomcat/webapps/FILE/ibjujun/Board/");
    }
}