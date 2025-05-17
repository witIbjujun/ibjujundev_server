package com.wit.inspaction.chat.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.chat.mapper.ChatMapper;
import com.wit.inspaction.chat.model.AuthorDTO;
import com.wit.inspaction.chat.model.ChatDTO;
import com.wit.inspaction.user.model.UserDTO;

@Service
public class ChatServiceImpl implements ChatService{
	
	@Autowired
	private ChatMapper chatMapper;
	
	
	/**
	 * 채팅내용 조회 
	 */
	@Override
	public List<ChatDTO> getChatList(HashMap<String, Object> paramMap) {
		
		System.out.println("채티팅 selectChatList 호출");
		
		List<ChatDTO> list = chatMapper.selectChatList(paramMap);
		
		return list;
	}
	
	/**
	 * 채팅내용 조회 
	 */
	@Override
	public ChatDTO getChatInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("채티팅 selectChatInfo 호출");
		
		ChatDTO chatInfo = chatMapper.selectChatInfo(paramMap);
		
		return chatInfo;
	}
	
	/**
	 * 채팅내용 조회 
	 */
	@Override
	public List<ChatDTO> getAnswerMessages(HashMap<String, Object> paramMap) {
		
		System.out.println("채티팅 selectAnswerMessages 호출");
		
		List<ChatDTO> list = chatMapper.selectAnswerMessages(paramMap);
		
		return list;
	}
	
	@Override
	public String getRequestChatInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("채티팅 getRequestChatInfo 호출");
		
		String userInfo = chatMapper.selectRequestChatInfo(paramMap);
		
		return userInfo;
	}
	
	/**
	 * 채팅내용 조회 
	 */
	@Override
	public List<AuthorDTO> getAuthorsByIds(HashMap<String, Object> paramMap) {
		
		System.out.println("채티팅 getAuthorsByIds 호출");
		
		List<AuthorDTO> list = chatMapper.selectAuthorsByIds(paramMap);
		
		return list;
	}
	
	@Override
	public int getCreateChatNo(HashMap<String, Object> paramMap) {
		
		int chatNo = chatMapper.insertChatMain(paramMap);
		
		return chatNo;
	}
	
	/**
	 * 채팅글 저장
	 */
	@Override
	public int saveChatMessage(HashMap<String, Object> paramMap) {
		
		return chatMapper.insertChatMessage(paramMap);
	}
	
	/**
	 * 상태 수정
	 */
	@Override
	public int updateRequestStatus(HashMap<String, Object> paramMap) {
		
		return chatMapper.updateRequestStatus(paramMap);
	}
	
	/**
	 * 채팅글 저장
	 */
	@Override
	public int updateChatMessage(HashMap<String, Object> paramMap) {
		
		return chatMapper.updateChatMessage(paramMap);
	}
	
	/**
	 * 채팅글 저장
	 */
	@Override
	public int updateReqChatInfo(HashMap<String, Object> paramMap) {
		
		return chatMapper.updateReqChatInfo(paramMap);
	}

}
