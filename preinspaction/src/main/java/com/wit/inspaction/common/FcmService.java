package com.wit.inspaction.common;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.wit.inspaction.user.model.UserDTO;
import com.wit.inspaction.user.service.UserService;
import com.wit.inspaction.user.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.firebase.messaging.Notification;

@Service
public class FcmService {
	
	private static final Logger logger = LoggerFactory.getLogger(FcmService.class);
	

	@Autowired
	private UserService userService;
	
    public int sendAppMessage(HashMap<String, Object> paramp) {
    	
    	String gubun = paramp.get("gubun") == null ? "" : (String) paramp.get("gubun");
    	List<String> companyIds = paramp.get("companyIds") != null ? (List<String>) paramp.get("companyIds") : new ArrayList<>();
    	List<String> userIds = paramp.get("userIds") != null ? (List<String>) paramp.get("userIds") : new ArrayList<>();
    	 
    	 logger.info("선택된 companyIds :: " + companyIds);
    	 logger.info("선택된 userIds :: " + userIds);
    	 
    	 HashMap<String, Object> paramMap = new HashMap<>();
    	 
    	 List<UserDTO> tokenList = null;
    			 
    	 // Token 리스트 가져오기
    	 if("S".equals(gubun)) {  //대상이 판매자
    		 paramMap.put("companyIds", companyIds);
    		 tokenList =  userService.getTokenList(paramMap);
    	 }else {
    		 
    	 }
    	
 		 
 		 // 메시지 발송 결과 변수
 	    int successCount = 0;
 	    
 	   for (UserDTO user : tokenList) {
 	        String token = user.getToken(); // UserDTO에 저장된 FCM 토큰
 	       logger.info("선택된 token ::" + token+"===");
 	       logger.info("선택된 title ::" + paramp.get("title").toString()+"===");
 	       logger.info("선택된 body ::" + paramp.get("body").toString()+"===");
 	        if (token == null || token.isEmpty()) {
 	            logger.warn("FCM 토큰이 없는 사용자: " + user.getClerkNo());
 	            continue; // 토큰이 없는 경우 건너뜀
 	        }

 	        try {
 	            // 메시지 생성 및 발송
 	          Message message = Message.builder()
 	        	        .setToken(token)
 	        	        .putData("title", paramp.get("title").toString()) // Optional: Data 메시지
 	        	        .putData("body", paramp.get("body").toString())
 	        	        .setNotification(Notification.builder()
 	        	                .setTitle(paramp.get("title").toString())
 	        	                .setBody(paramp.get("body").toString())
 	        	                .build())
 	        	        .build();
 	           
 	            String response = FirebaseMessaging.getInstance().send(message);
 	            logger.info("Message sent successfully to user: " + user.getClerkNo() + ", Response: " + response);
 	            successCount++;
 	        } catch (Exception e) {
 	            logger.error("Failed to send message to user: " + user.getClerkNo() + ", Error: " + e.getMessage());
 	        }
 	    }
 	       
 	      logger.info("Total messages sent successfully: " + successCount);
 	     return successCount; 
       
    }
}
