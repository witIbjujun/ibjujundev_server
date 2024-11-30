package com.wit.inspaction.chat.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.chat.mapper.ChatMapper;
import com.wit.inspaction.chat.model.AuthorDTO;
import com.wit.inspaction.chat.model.ChatDTO;

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
	public List<AuthorDTO> getAuthorsByIds(HashMap<String, Object> paramMap) {
		
		System.out.println("채티팅 getAuthorsByIds 호출");
		
		List<AuthorDTO> list = chatMapper.selectAuthorsByIds(paramMap);
		
		return list;
	}
	
	/**
	 * 채팅글 저장
	 */
	@Override
	public int saveChatMessage(HashMap<String, Object> paramMap) {
		return chatMapper.insertChatMessage(paramMap);
	}

}
