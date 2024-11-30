package com.wit.inspaction.chat.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.chat.model.AuthorDTO;
import com.wit.inspaction.chat.model.ChatDTO;

@Repository
public class ChatMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.chat.mapper.ChatMapper.";
	
	/**
	 * 채팅내용 조회 
	 * @return <ChatDTO>
	 */
	public List<ChatDTO> selectChatList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectChatList", paramMap);
	}
	
	/**
	 * 채팅내용 조회 
	 * @return <AuthorDTO>
	 */
	public List<AuthorDTO> selectAuthorsByIds(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectAuthorsByIds", paramMap);
	}
	
	/**
	 * 채팅글 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertChatMessage(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertChatMessage", paramMap);
	}
}