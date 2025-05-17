package com.wit.inspaction.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.board.service.BoardService;
import com.wit.inspaction.chat.model.AuthorDTO;
import com.wit.inspaction.chat.model.ChatDTO;
import com.wit.inspaction.chat.service.ChatService;
import com.wit.inspaction.user.UserController;
import com.wit.inspaction.user.model.UserDTO;


@RestController
public class ChatController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatController.class);
	
	
	@Autowired
	private ChatService chatService;
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private SimpMessagingTemplate messagingTemplate;
	
	/**
	 * 채팅내용 조회 
	 * @return
	 */
	@RequestMapping("/wit/getChatList")
    public List<ChatDTO> getChatList(@RequestBody HashMap<String, Object> param) {
		System.out.println("getChatList 호출");
		
		String reqNo   = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		String target  = param.get("target") == null ? "" : (String) param.get("target");
		String seq     = param.get("seq") == null ? "" : (String) param.get("seq");
		
		logger.info("카테고리 reqNo ::: " + reqNo);
		logger.info("카테고리 clerkNo ::: " + clerkNo);
		logger.info("카테고리 target ::: " + target);
		logger.info("카테고리 seq ::: " + seq);
		
		String  searchChatId = chatService.getRequestChatInfo(param);
		
		
		System.out.println("들어왔나건이 searchChatId=="+searchChatId);
		
		if (searchChatId == null) {
		    // chatId가 null이거나 빈 문자열일 경우 처리
			// 1 chat 생성
			 chatService.getCreateChatNo(param);
			// 2 reuqest110와 맵핑
			String newChatd = (String) param.get("newChatd");
			param.put("newChatd", newChatd);
			
			logger.info("카테고리 newChatd ::: " + newChatd);
			
			chatService.updateReqChatInfo(param);
			// 3 chat 기본데이터 등록
			HashMap<String, Object> systemMessage = new HashMap<>();
            systemMessage.put("chatId", newChatd);
            systemMessage.put("clerkNo", "system");
            systemMessage.put("messageContent", "");
            systemMessage.put("messageStatus", "seen");
            systemMessage.put("messageType", "link");
            systemMessage.put("chatgubun", "system");
            systemMessage.put("msgCode", "MSG_001");
            
            logger.info("파라미터 chatId ::: " + systemMessage.get("chatId"));
            
            chatService.saveChatMessage(systemMessage); // system 메시지 저장
		} else {
		    // chatId가 존재할 경우 처리
			param.put("chatId", searchChatId);
			logger.info("카테고리 chatId ::: " + searchChatId);
		}
		//메시지 쿼리 
		List<ChatDTO> chatList = chatService.getChatList(param);
		
		System.out.println("들어왔나건이 몇개고=="+chatList.size());
		for (ChatDTO dto : chatList) {
		   System.out.println("들어왔나??????");
		    System.out.println(dto);
		}
    	
		
        return chatList;
    }
	/**
	 * 채팅정보 조회 
	 * @return
	 */
	@RequestMapping("/wit/getChatInfo")
	public ChatDTO getChatInfo(@RequestBody HashMap<String, Object> param) {
		System.out.println("getChatInfo 호출");
		
		String reqNo   = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String seq     = param.get("seq") == null ? "" : (String) param.get("seq");
		String target     = param.get("target") == null ? "" : (String) param.get("target");
		ChatDTO chatInfo = null;
		logger.info("카테고리 reqNo ::: " + reqNo);
		logger.info("카테고리 seq ::: " + seq);
		logger.info("카테고리 target ::: " + target);
		
		chatInfo = chatService.getChatInfo(param);
		
		
		return chatInfo;
	}
	
	
	/**
	 * 채팅정보 조회 
	 * @return
	 */
	@RequestMapping("/wit/updateProgressStatus")
	public int updateProgressStatus(@RequestBody HashMap<String, Object> param) {
		System.out.println("updateProgressStatus 호출");
		
		String reqNo   = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String seq     = param.get("seq") == null ? "" : (String) param.get("seq");
		String reqState     = param.get("reqState") == null ? "" : (String) param.get("reqState");
		logger.info("채팅 신청 상태 reqNo ::: " + reqNo);
		logger.info("채팅 신청 상태 seq ::: " + seq);
		logger.info("채팅 신청 상태 reqState ::: " + reqState);
		
	    int result = chatService.updateRequestStatus(param);
		
		return result;
	}
	
	/**
	 * 채팅내용 조회 
	 * @return
	 */
	@RequestMapping("/wit/saveChatMessage")
	public int saveChatMessage(@RequestBody HashMap<String, Object> param) {
		
		System.out.println("saveChatMessage 호출");
		
		String reqNo = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String seq = param.get("seq") == null ? "" : (String) param.get("seq");
		String chatId = param.get("chatId") == null ? "" : (String) param.get("chatId");
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		String anwCode = param.get("anwCode") == null ? "" : (String) param.get("anwCode");
		String systemGubun = param.get("systemGubun") == null ? "" : (String) param.get("systemGubun");
		String inputGubun = param.get("inputGubun") == null ? "" : (String) param.get("inputGubun");
		String messageId = param.get("messageId") == null ? "" : (String) param.get("messageId");
		String msgCode = param.get("msgCode") == null ? "" : (String) param.get("msgCode");
	    String text = (String) param.get("text");
	    String type = (String) param.get("type");
		
	    System.out.println("chatId === " + (String) param.get("chatId"));
	    System.out.println("clerkNo === " + (String) param.get("clerkNo"));
	    System.out.println("text === " + (String) param.get("text"));
	    System.out.println("type === " + (String) param.get("type"));
	    System.out.println("systemGubun === " + systemGubun);
	    System.out.println("messageId === " + messageId);
	    System.out.println("anwCode === " + (String) param.get("anwCode"));
	    System.out.println("inputGubun === " + inputGubun);
	    
	    HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("chatId", chatId);
		paramMap.put("clerkNo", clerkNo);
		paramMap.put("messageContent", text);
		paramMap.put("messageStatus", "sent");
		paramMap.put("messageType", type);
		paramMap.put("anwCode", anwCode);
		paramMap.put("systemGubun", systemGubun);
		paramMap.put("messageId", messageId);
		paramMap.put("chatGubun", "end");
	    
		 System.out.println("등록전성공===== ");
		 
		 
		    
	    int result = chatService.saveChatMessage(paramMap);
	    String NewMessageId = (String) paramMap.get("message_id"); // 💡 자동 채워짐
	    
	    if (result > 0) {
	    	 System.out.println("파일들어온다!!!!===== ");
			// 파일 리스트
			List<HashMap<String, Object>> fileList = (List<HashMap<String, Object>>) param.get("fileInfo");
			
			if (fileList != null && !fileList.isEmpty()) {
		
				// 파일 저장
				for (HashMap<String, Object> fileInfo : fileList) {
					fileInfo.put("bizCd", "C001");
	                fileInfo.put("bizKey", NewMessageId);
	                fileInfo.put("fileType", "M1");
	                fileInfo.put("creUser", clerkNo);
	                fileInfo.put("updUser", clerkNo);
	                
	                // 🔍 fileInfo 내부 전체 출력
	    	        for (Map.Entry<String, Object> entry : fileInfo.entrySet()) {
	    	            System.out.println("fileInfo[" + entry.getKey() + "] = " + entry.getValue());
	    	        }

					
					int fileResult = boardService.saveFileInfo(fileInfo);
					
					System.out.println("파일 등록 ::: " + fileResult);
				}
			}
			
		}
	    
	    /**
	     * 사용자 입력시 신청 상태값 업데이트 
	     */
	    System.out.println("inputGubun===== "+inputGubun);
	    System.out.println("inputGubun===== "+inputGubun);
	    System.out.println("inputGubun===== "+inputGubun);
	    
	    if("MSG_005".equals(msgCode) ) {  /*잔업진행*/
			HashMap<String, Object> updateParamMap = new HashMap<String, Object>();
			updateParamMap.put("reqNo", reqNo);
			updateParamMap.put("seq", seq);
			updateParamMap.put("upState", "50");  /*작업진행*/
			
			  System.out.println("들어온건가???===== ");
	    	
			 System.out.println("reqNo===== "+updateParamMap.get("reqNo"));
			 System.out.println("seq===== "+updateParamMap.get("seq"));
			 System.out.println("reqState===== "+updateParamMap.get("upState"));
	    	 int aaa = chatService.updateRequestStatus(updateParamMap);
	    	 System.out.println("성공?===== "+aaa);
	    }
	    
	    // system 선택시 ansvwer 수정
	    if("system".equals(systemGubun)) {
	    	 System.out.println("수정가나===== "+(String) paramMap.get("chatGubun"));
	    	chatService.updateChatMessage(paramMap);
	    }
	    
	 // 🎯 추가: answers 값이 있으면 system 메시지 자동 저장
	    if (anwCode != null && !anwCode.isEmpty()) {
        	HashMap<String, Object> systemMessage = new HashMap<>();
            systemMessage.put("chatId", chatId);
            systemMessage.put("clerkNo", "system");
            systemMessage.put("messageContent", "");
            systemMessage.put("messageStatus", "seen");
            systemMessage.put("messageType", "link");
            systemMessage.put("chatgubun", "system");
            systemMessage.put("msgCode", anwCode);

            chatService.saveChatMessage(systemMessage); // system 메시지 저장
	    }
	    
	    System.out.println("등록성공???? === " + result);
	    return result;
	}
	
}