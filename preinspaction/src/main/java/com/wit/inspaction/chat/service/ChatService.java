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
	
	
}
