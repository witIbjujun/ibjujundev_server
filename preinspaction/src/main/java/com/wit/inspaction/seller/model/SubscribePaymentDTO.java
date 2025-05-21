package com.wit.inspaction.seller.model;

public class SubscribePaymentDTO {
	private String sllrNo;       // 판매자 번호
	private String storeName;    // 판매자 명
	private String amount;       // 결재금액
	private String aptNo;    	 // 공동구매시작일
	private String aptName;      // 공동구매 종료일
	private String payMethod;    // 진행상태: 공동구매 진행중 / 조기마감 / 매진
	private String impUid;     	 // 포트원ID
	private String merchantUid;  // 주문 번호
	private String status;       // 결재상태
	private String failReason;   // 실패사유
	private String receiptUrl;   // 영수증 URL
	private String creDate;      // 등록일시
	
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
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the aptNo
	 */
	public String getAptNo() {
		return aptNo;
	}
	/**
	 * @param aptNo the aptNo to set
	 */
	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
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
	 * @return the payMethod
	 */
	public String getPayMethod() {
		return payMethod;
	}
	/**
	 * @param payMethod the payMethod to set
	 */
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	/**
	 * @return the impUid
	 */
	public String getImpUid() {
		return impUid;
	}
	/**
	 * @param impUid the impUid to set
	 */
	public void setImpUid(String impUid) {
		this.impUid = impUid;
	}
	/**
	 * @return the merchantUid
	 */
	public String getMerchantUid() {
		return merchantUid;
	}
	/**
	 * @param merchantUid the merchantUid to set
	 */
	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the failReason
	 */
	public String getFailReason() {
		return failReason;
	}
	/**
	 * @param failReason the failReason to set
	 */
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	/**
	 * @return the receiptUrl
	 */
	public String getReceiptUrl() {
		return receiptUrl;
	}
	/**
	 * @param receiptUrl the receiptUrl to set
	 */
	public void setReceiptUrl(String receiptUrl) {
		this.receiptUrl = receiptUrl;
	}
	/**
	 * @return the creDate
	 */
	public String getCreDate() {
		return creDate;
	}
	/**
	 * @param creDate the creDate to set
	 */
	public void setCreDate(String creDate) {
		this.creDate = creDate;
	}

}

