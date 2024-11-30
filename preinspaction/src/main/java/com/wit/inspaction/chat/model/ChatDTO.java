package com.wit.inspaction.chat.model;

import java.util.List;
import java.util.Map;

public class ChatDTO {
    
	private int createdAt;			// 점검ID
	private String roomId;				// 점검ID
	private String status;				// 점검ID
	private String type;				// 점검ID
	private String text;				// 점검ID
	private String id;				// 점검ID
	
	private String authorId; // 작성자 ID
	
	private AuthorDTO author; // 새로운 필드 추가
	
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	public int getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}
	public AuthorDTO getAuthor() {
		return author;
	}
	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
    
}