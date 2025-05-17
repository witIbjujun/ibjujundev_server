package com.wit.inspaction.chat.model;

public class ChatDTO {
    
	private int createdAt;			// 점검ID
	private String roomId;				// 점검ID
	private String chatId;				// 점검ID
	private String status;				// 점검ID
	private String type;				// 점검ID
	private String text;				// 점검ID
	private String chatgubun;				// 점검ID
	private String imageUrl;				// 점검ID
	private String storeName;				// 점검ID
	private String authorId; // 작성자 ID
	private AuthorDTO author; // 새로운 필드 추가
	private String time; // 새로운 필드 추가
	private String keywordCode; // 새로운 필드 추가
	private String keywordText; // 새로운 필드 추가
	private String orderSeq; // 새로운 필드 추가
	private String target; // 새로운 필드 추가
	private String msgCode; // 새로운 필드 추가
	private String anwCode; // 새로운 필드 추가
	private String messageId; // 새로운 필드 추가
	private String targetView; // 새로운 필드 추가
	
	private String categoryNm; // 새로운 필드 추가
	private String categoryId; // 새로운 필드 추가
	private String estimateAmount; // 새로운 필드 추가
	private String reqUser; // 새로운 필드 추가
	private String reqName; // 새로운 필드 추가
	private String estimateDate; // 새로운 필드 추가
	private String estimateProcDate; // 새로운 필드 추가
	private String reqState; // 새로운 필드 추가
	private String nextReqState; // 다음실행 코드 
	private String reqBtenNm; // 다음실행 버튼명
	
	public String getNextReqState() {
		return nextReqState;
	}
	public void setNextReqState(String nextReqState) {
		this.nextReqState = nextReqState;
	}
	public String getReqBtenNm() {
		return reqBtenNm;
	}
	public void setReqBtenNm(String reqBtenNm) {
		this.reqBtenNm = reqBtenNm;
	}
	public String getCategoryNm() {
		return categoryNm;
	}
	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getEstimateAmount() {
		return estimateAmount;
	}
	public void setEstimateAmount(String estimateAmount) {
		this.estimateAmount = estimateAmount;
	}
	public String getReqUser() {
		return reqUser;
	}
	public void setReqUser(String reqUser) {
		this.reqUser = reqUser;
	}
	public String getReqName() {
		return reqName;
	}
	public void setReqName(String reqName) {
		this.reqName = reqName;
	}
	public String getEstimateDate() {
		return estimateDate;
	}
	public void setEstimateDate(String estimateDate) {
		this.estimateDate = estimateDate;
	}
	public String getEstimateProcDate() {
		return estimateProcDate;
	}
	public void setEstimateProcDate(String estimateProcDate) {
		this.estimateProcDate = estimateProcDate;
	}
	public String getReqState() {
		return reqState;
	}
	public void setReqState(String reqState) {
		this.reqState = reqState;
	}
	public String getChatId() {
		return chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getTargetView() {
		return targetView;
	}
	public void setTargetView(String targetView) {
		this.targetView = targetView;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getAnwCode() {
		return anwCode;
	}
	public void setAnwCode(String anwCode) {
		this.anwCode = anwCode;
	}
	public String getKeywordCode() {
		return keywordCode;
	}
	public void setKeywordCode(String keywordCode) {
		this.keywordCode = keywordCode;
	}
	public String getKeywordText() {
		return keywordText;
	}
	public void setKeywordText(String keywordText) {
		this.keywordText = keywordText;
	}
	public String getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getChatgubun() {
		return chatgubun;
	}
	public void setChatgubun(String chatgubun) {
		this.chatgubun = chatgubun;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
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
    
    
}