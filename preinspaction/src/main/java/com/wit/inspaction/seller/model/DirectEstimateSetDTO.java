package com.wit.inspaction.seller.model;

public class DirectEstimateSetDTO {

	private String esdrNo;				// 바로견적 번호
	private String endDate;				// END_DATE
	private String sllrNo;				// 판매자 번호
    private String categoryId;			// 품목코드
    private String categoryNm;			// 품목명
    private String esdrSendCntCd;		// 바로견적 발송 횟수 코드
    private String esdrSendCnt;			// 바로견적 발송 횟수
    private String area;				// 서비스 지역
    private String content;				// 바로견적 설명
    private String exStartTime;			// 발송 예외 설정 시작 시간
    private String exEndTime;			// 발송 예외 설정 종료 시간
    private String creUser;				// 등록자
    private String creDate;				// 등록일
    private String updUser;				// 수정자
    private String updDate;				// 수정일
    private String todaySendCnt;        // 금일발송된 바로 견적 건수
    private String todaySendCash;        // 금일 사용 캐시
	/**
	 * @return the esdrNo
	 */
	public String getEsdrNo() {
		return esdrNo;
	}
	/**
	 * @param esdrNo the esdrNo to set
	 */
	public void setEsdrNo(String esdrNo) {
		this.esdrNo = esdrNo;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
	 * @return the esdrSendCntCd
	 */
	public String getEsdrSendCntCd() {
		return esdrSendCntCd;
	}
	/**
	 * @param esdrSendCntCd the esdrSendCntCd to set
	 */
	public void setEsdrSendCntCd(String esdrSendCntCd) {
		this.esdrSendCntCd = esdrSendCntCd;
	}
	/**
	 * @return the esdrSendCnt
	 */
	public String getEsdrSendCnt() {
		return esdrSendCnt;
	}
	/**
	 * @param esdrSendCnt the esdrSendCnt to set
	 */
	public void setEsdrSendCnt(String esdrSendCnt) {
		this.esdrSendCnt = esdrSendCnt;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the exStartTime
	 */
	public String getExStartTime() {
		return exStartTime;
	}
	/**
	 * @param exStartTime the exStartTime to set
	 */
	public void setExStartTime(String exStartTime) {
		this.exStartTime = exStartTime;
	}
	/**
	 * @return the exEndTime
	 */
	public String getExEndTime() {
		return exEndTime;
	}
	/**
	 * @param exEndtime the exEndTime to set
	 */
	public void setExEndTime(String exEndTime) {
		this.exEndTime = exEndTime;
	}
	/**
	 * @return the creUser
	 */
	public String getCreUser() {
		return creUser;
	}
	/**
	 * @param creUser the creUser to set
	 */
	public void setCreUser(String creUser) {
		this.creUser = creUser;
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
	/**
	 * @return the updUser
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * @param updUser the updUser to set
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * @return the updDate
	 */
	public String getUpdDate() {
		return updDate;
	}
	/**
	 * @param updDate the updDate to set
	 */
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
	/**
	 * @return the todaySendCnt
	 */
	public String getTodaySendCnt() {
		return todaySendCnt;
	}
	/**
	 * @param todaySendCnt the todaySendCnt to set
	 */
	public void setTodaySendCnt(String todaySendCnt) {
		this.todaySendCnt = todaySendCnt;
	}
	/**
	 * @return the todaySendCash
	 */
	public String getTodaySendCash() {
		return todaySendCash;
	}
	/**
	 * @param todaySendCash the todaySendCash to set
	 */
	public void setTodaySendCash(String todaySendCash) {
		this.todaySendCash = todaySendCash;
	}


}