package com.wit.inspaction.common;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppPushController {
	
	private static final Logger logger = LoggerFactory.getLogger(AppPushController.class);

    @Autowired
    private FcmService fcmService;

    @RequestMapping("/wit/senApp")
    public String sendNotification(@RequestBody HashMap<String, Object> param) {
    	
    	String token = param.get("token") == null ? "" : (String) param.get("token");
    	String title = param.get("title") == null ? "" : (String) param.get("title");
    	String body = param.get("body") == null ? "" : (String) param.get("body");
    	
    	logger.info("token호출====="+token);
    	logger.info("title호출====="+title);
    	logger.info("body호출====="+body);
//        fcmService.sendMessage(param);
        return "send";
    }
}
