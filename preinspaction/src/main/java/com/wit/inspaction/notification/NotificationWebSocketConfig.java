package com.wit.inspaction.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@CrossOrigin
@EnableWebSocket
public class NotificationWebSocketConfig implements WebSocketConfigurer {
    
	private static final Logger logger = LoggerFactory.getLogger(NotificationWebSocketConfig.class);
	
	@Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		
		if (logger.isInfoEnabled()) {
    		logger.info("☆★registerWebSocketHandlers");
    		logger.info("☆★registerWebSocketHandlers");
    	}
		registry.addHandler(new NotificationWebSocketHandler(), "/notification").setAllowedOrigins("*");
    }
}