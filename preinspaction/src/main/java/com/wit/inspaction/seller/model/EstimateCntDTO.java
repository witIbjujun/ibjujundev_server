package com.wit.inspaction.seller.model;

/**
 * 관리자 - 업체 진행 건수 확인
 */
public class EstimateCntDTO {

	private String sllrNo;				// 업체코드
	private String storeName;			// 업체명
	private String waitCnt;				// 진행대기 건수
	private String goingCnt;			// 진행중 건수
	private String cencelCnt;			// 진행취소 건수
	private String storeImage;			// 업체 이미지
	
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
	 * @return the waitCnt
	 */
	public String getWaitCnt() {
		return waitCnt;
	}
	/**
	 * @param waitCnt the waitCnt to set
	 */
	public void setWaitCnt(String waitCnt) {
		this.waitCnt = waitCnt;
	}
	/**
	 * @return the goingCnt
	 */
	public String getGoingCnt() {
		return goingCnt;
	}
	/**
	 * @param goingCnt the goingCnt to set
	 */
	public void setGoingCnt(String goingCnt) {
		this.goingCnt = goingCnt;
	}
	/**
	 * @return the cencelCnt
	 */
	public String getCencelCnt() {
		return cencelCnt;
	}
	/**
	 * @param cencelCnt the cencelCnt to set
	 */
	public void setCencelCnt(String cencelCnt) {
		this.cencelCnt = cencelCnt;
	}
	/**
	 * @return the storeImage
	 */
	public String getStoreImage() {
		return storeImage;
	}
	/**
	 * @param storeImage the storeImage to set
	 */
	public void setStoreImage(String storeImage) {
		this.storeImage = storeImage;
	}
	
}
