package com.wit.inspaction.seller.model;

public class SellerSendDTO {

	private String sllrNo;
	private String estNo;
	private String seq;
	private String aptName;
	private String itemImage;
	private String estDt;
	private String reqContents;
	private String companyId;					// 점검ID
    private String categoryId;					// 점검순번
    private String itemName;					// 점검명
    private String reqState;				// 상위 점검ID
    private String stat;
    private String estimateContent;
    private String reqUser;
    private String prsnName;
    private String categoryNm;
    private String itemPrice1;
    private String sllrClerkNo;
    private String estimateDate;			// 최초 작업희망일
    private String estimateProcDate;		// 최종 작업확정일
    private String chatId;		// 채팅방 ID
    private String prsnImageUrl;            // 사용자 이미지 URL 
    private String reqType;                 // 견적 타입
    
	/**
	 * @return the chatId
	 */
	public String getChatId() {
		return chatId;
	}
	/**
	 * @param chatId the chatId to set
	 */
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	/**
	 * @return the sllrNo
	 */
	public String getSllrNo() {
		return sllrNo;
	}
	/**
	 * @param sllrNo the sllrNo to set
	 */
	public void setSllrNo(String sllrNo) {
		this.sllrNo = sllrNo;
	}
	/**
	 * @return the estNo
	 */
	public String getEstNo() {
		return estNo;
	}
	/**
	 * @param estNo the estNo to set
	 */
	public void setEstNo(String estNo) {
		this.estNo = estNo;
	}
	/**
	 * @return the seq
	 */
	public String getSeq() {
		return seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(String seq) {
		this.seq = seq;
	}
	/**
	 * @return the aptName
	 */
	public String getAptName() {
		return aptName;
	}
	/**
	 * @param aptName the aptName to set
	 */
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	/**
	 * @return the itemImage
	 */
	public String getItemImage() {
		return itemImage;
	}
	/**
	 * @param itemImage the itemImage to set
	 */
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	/**
	 * @return the estDt
	 */
	public String getEstDt() {
		return estDt;
	}
	/**
	 * @param estDt the estDt to set
	 */
	public void setEstDt(String estDt) {
		this.estDt = estDt;
	}
	/**
	 * @return the reqContents
	 */
	public String getReqContents() {
		return reqContents;
	}
	/**
	 * @param reqContents the reqContents to set
	 */
	public void setReqContents(String reqContents) {
		this.reqContents = reqContents;
	}
	/**
	 * @return the companyId
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the reqState
	 */
	public String getReqState() {
		return reqState;
	}
	/**
	 * @param reqState the reqState to set
	 */
	public void setReqState(String reqState) {
		this.reqState = reqState;
	}
	/**
	 * @return the stat
	 */
	public String getStat() {
		return stat;
	}
	/**
	 * @param stat the stat to set
	 */
	public void setStat(String stat) {
		this.stat = stat;
	}
	/**
	 * @return the estimateContent
	 */
	public String getEstimateContent() {
		return estimateContent;
	}
	/**
	 * @param estimateContent the estimateContent to set
	 */
	public void setEstimateContent(String estimateContent) {
		this.estimateContent = estimateContent;
	}
	/**
	 * @return the reqUser
	 */
	public String getReqUser() {
		return reqUser;
	}
	/**
	 * @param reqUser the reqUser to set
	 */
	public void setReqUser(String reqUser) {
		this.reqUser = reqUser;
	}
	/**
	 * @return the prsnName
	 */
	public String getPrsnName() {
		return prsnName;
	}
	/**
	 * @param prsnName the prsnName to set
	 */
	public void setPrsnName(String prsnName) {
		this.prsnName = prsnName;
	}
	/**
	 * @return the categoryNm
	 */
	public String getCategoryNm() {
		return categoryNm;
	}
	/**
	 * @param categoryNm the categoryNm to set
	 */
	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
	}
	/**
	 * @return the itemPrice1
	 */
	public String getItemPrice1() {
		return itemPrice1;
	}
	/**
	 * @param itemPrice1 the itemPrice1 to set
	 */
	public void setItemPrice1(String itemPrice1) {
		this.itemPrice1 = itemPrice1;
	}
	/**
	 * @return the sllrClerkNo
	 */
	public String getSllrClerkNo() {
		return sllrClerkNo;
	}
	/**
	 * @param sllrClerkNo the sllrClerkNo to set
	 */
	public void setSllrClerkNo(String sllrClerkNo) {
		this.sllrClerkNo = sllrClerkNo;
	}
	/**
	 * @return the estimateDate
	 */
	public String getEstimateDate() {
		return estimateDate;
	}
	/**
	 * @param estimateDate the estimateDate to set
	 */
	public void setEstimateDate(String estimateDate) {
		this.estimateDate = estimateDate;
	}
	/**
	 * @return the estimateProcDate
	 */
	public String getEstimateProcDate() {
		return estimateProcDate;
	}
	/**
	 * @param estimateProcDate the estimateProcDate to set
	 */
	public void setEstimateProcDate(String estimateProcDate) {
		this.estimateProcDate = estimateProcDate;
	}
	/**
	 * @return the prsnImageUrl
	 */
	public String getPrsnImageUrl() {
		return prsnImageUrl;
	}
	/**
	 * @param prsnImageUrl the prsnImageUrl to set
	 */
	public void setPrsnImageUrl(String prsnImageUrl) {
		this.prsnImageUrl = prsnImageUrl;
	}
	
	/**
	 * @return the reqType
	 */
	public String getReqType() {
		return reqType;
	}
	/**
	 * @param reqType the reqType to set
	 */
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
}