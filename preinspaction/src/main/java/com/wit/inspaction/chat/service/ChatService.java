package com.wit.inspaction.chat.service;

import java.util.HashMap;
import java.util.List;

import com.wit.inspaction.chat.model.AuthorDTO;
import com.wit.inspaction.chat.model.ChatDTO;

/**
 * 사전점검 서비스
 */
public interface ChatService {

	/**
	 * 채팅내용 조회 
	 * @return List<ChatDTO>
	 */
	public List<ChatDTO> getChatList(HashMap<String, Object> paramMap);
	/**
	 * 채팅내용 판매차 첫조회 
	 * @return List<ChatDTO>
	 */
	public List<ChatDTO> getSllerChatList(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅정보 조회 
	 * @return ChatDTO
	 */
	public ChatDTO getChatInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅답변 조회 
	 * @return List<ChatDTO>
	 */
	public List<ChatDTO> getAnswerMessages(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅생성
	 * @return ChatDTO
	 */
	public String getRequestChatInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅생성
	 * @return String
	 */
	public int getCreateChatNo(HashMap<String, Object> paramMap);
	

	/**
	 * 채팅내용 조회 
	 * @return List<AuthorDTO>
	 */
	public List<AuthorDTO> getAuthorsByIds(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅글 저장
	 * @param param
	 * @return int
	 */
	public int saveChatMessage(HashMap<String, Object> paramMap);
	
	/**
	 * 신청 상태 수정
	 * @param param
	 * @return int
	 */
	public int updateRequestStatus(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅글 수정
	 * @param param
	 * @return int
	 */
	public int updateChatMessage(HashMap<String, Object> paramMap);
	
	/**
	 * 채팅글 수정
	 * @param param
	 * @return int
	 */
	public int updateReqChatInfo(HashMap<String, Object> paramMap);
	
}
