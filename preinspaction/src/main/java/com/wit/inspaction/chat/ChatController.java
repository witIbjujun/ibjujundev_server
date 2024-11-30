package com.wit.inspaction.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.chat.model.AuthorDTO;
import com.wit.inspaction.chat.model.ChatDTO;
import com.wit.inspaction.chat.service.ChatService;


@RestController
public class ChatController {
	
	@Autowired
	private ChatService chatService;
	
	@Autowired
	private SimpMessagingTemplate messagingTemplate;
	
	/**
	 * 채팅내용 조회 
	 * @return
	 */
	@RequestMapping("/wit/getChatList")
    public List<ChatDTO> getChatList(@RequestBody HashMap<String, Object> param) {
    	
		
		System.out.println("getChatList 호출");
		
		
		String chatId = param.get("chatId") == null ? "" : (String) param.get("chatId");
		
		//메시지 쿼리 
		List<ChatDTO> chatList = chatService.getChatList(param);
    	
		 // 각 메시지의 작성자 ID를 수집하여 중복을 제거한 목록을 생성
	    Set<String> authorIds = chatList.stream()
	        .map(ChatDTO::getAuthorId)
	        .collect(Collectors.toSet());

	    // 작성자 정보 쿼리
	    List<AuthorDTO> authors = chatService.getAuthorsByIds(param);

	    
	    // 작성자 정보를 ID 기준으로 매핑
	    Map<String, AuthorDTO> authorMap = authors.stream()
	        .collect(Collectors.toMap(AuthorDTO::getId, author -> author));

	    // 각 메시지에 작성자 정보 추가
	    chatList.forEach(chat -> {
	        String authorId = chat.getAuthorId();
	        if (authorMap.containsKey(authorId)) {
	            chat.setAuthor(authorMap.get(authorId));
	            
	            System.out.println("web soket 호출한다. ");
	            System.out.println("chatId==== "+chatId);
	            
	            messagingTemplate.convertAndSend("/topic/chat/" + chatId, chat);
	            
	        }
	    });
		
        return chatList;
    }
	
	/**
	 * 채팅내용 조회 
	 * @return
	 */
	@RequestMapping("/wit/saveChatMessage")
	public String saveChatMessage(@RequestBody HashMap<String, Object> param) {
		
		System.out.println("saveChatMessage 호출");
		
		String chatId = param.get("chatId") == null ? "" : (String) param.get("chatId");
	    Map<String, Object> authorMap = (Map<String, Object>) param.get("author");
	    String authorId = (String) authorMap.get("id");
	    Long createdAt = (Long) param.get("createdAt");
	    String text = (String) param.get("text");
	    String type = (String) param.get("type");
	    Map<String, Object> metadata = (Map<String, Object>) param.get("metadata");
		
	    System.out.println("chatId === " + (String) param.get("chatId"));

	    Map<String, Object> authorMap1 = (Map<String, Object>) param.get("author");
	    if (authorMap1 != null) {
	        System.out.println("author id === " + (String) authorMap1.get("id"));
	    }

	    System.out.println("createdAt === " + (Long) param.get("createdAt"));
	    System.out.println("text === " + (String) param.get("text"));
	    System.out.println("type === " + (String) param.get("type"));

	    Map<String, Object> metadataMap = (Map<String, Object>) param.get("metadata");
	    if (metadataMap != null) {
	        System.out.println("metadata === " + metadataMap);
	    }
	    
	    HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("chatId", chatId);
		paramMap.put("clerkNo", authorId);
		paramMap.put("messageContent", text);
		paramMap.put("messageStatus", "sent");
		paramMap.put("messageType", type);
	    
		 System.out.println("등록전성공===== ");
		    
	    int result = chatService.saveChatMessage(paramMap);
	    
	    System.out.println("등록성공???? === " + result);
	    String resultVal ="fale";
	    // WebSocket을 통해 실시간 메시지 전송
        if (result > 0) {
        	resultVal ="success";
            // 클라이언트에 전송할 메시지 데이터를 준비합니다.
            HashMap<String, Object> messageData = new HashMap<>();
            messageData.put("chatId", chatId);
            messageData.put("author", authorMap);
            messageData.put("createdAt", createdAt);
            messageData.put("text", text);
            messageData.put("type", type);
            messageData.put("metadata", metadata);

            // WebSocket 주제로 메시지 전송
            messagingTemplate.convertAndSend("/topic/chat/" + chatId, messageData);
        }
        
        System.out.println("설마 리턴안가??? === " + resultVal);
	    return resultVal;
	}
	
}