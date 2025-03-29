package com.wit.inspaction.schedule.model;

/**
 * 스케쥴 정보 DTO
 * @author 조성훈
 * @since 2025.03.29
 * @category Schedule
 */
public class ScheduleInfoDTO {

	private String sllrNo;			// 판매자 번호
	private String reqNo;			// 신청번호	(실제 신청번호 or 순번)
	private String reqGbn;			// 스케줄 구분 (JD : 작업, MY : 일반)
	private String startDate;		// 시작일자 (YYYYMMDD)
	private String startYm;			// 시작시간 (HHMI)
	private String endDate;		// 종료일자 (YYYYMMDD)
	private String endYm;			// 종료시간 (HHMI)
	private String cldrTitle;			// 스케줄 제목
	private String cldrTxt;			// 스케줄 내용
	private String regUser;			// 등록자
	private String regDate;			// 등록 일자
	private String udtUser;			// 수장자
	private String udtDate;			// 수정 일자
	
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
	 * @return the reqNo
	 */
	public String getReqNo() {
		return reqNo;
	}
	/**
	 * @param reqNo the reqNo to set
	 */
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}
	/**
	 * @return the reqGbn
	 */
	public String getReqGbn() {
		return reqGbn;
	}
	/**
	 * @param reqGbn the reqGbn to set
	 */
	public void setReqGbn(String reqGbn) {
		this.reqGbn = reqGbn;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the startYm
	 */
	public String getStartYm() {
		return startYm;
	}
	/**
	 * @param startYm the startYm to set
	 */
	public void setStartYm(String startYm) {
		this.startYm = startYm;
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
	 * @return the endYm
	 */
	public String getEndYm() {
		return endYm;
	}
	/**
	 * @param endYm the endYm to set
	 */
	public void setEndYm(String endYm) {
		this.endYm = endYm;
	}
	/**
	 * @return the cldrTitle
	 */
	public String getCldrTitle() {
		return cldrTitle;
	}
	/**
	 * @param cldrTitle the cldrTitle to set
	 */
	public void setCldrTitle(String cldrTitle) {
		this.cldrTitle = cldrTitle;
	}
	/**
	 * @return the cldrTxt
	 */
	public String getCldrTxt() {
		return cldrTxt;
	}
	/**
	 * @param cldrTxt the cldrTxt to set
	 */
	public void setCldrTxt(String cldrTxt) {
		this.cldrTxt = cldrTxt;
	}
	/**
	 * @return the regUser
	 */
	public String getRegUser() {
		return regUser;
	}
	/**
	 * @param regUser the regUser to set
	 */
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	/**
	 * @return the regDate
	 */
	public String getRegDate() {
		return regDate;
	}
	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	/**
	 * @return the udtUser
	 */
	public String getUdtUser() {
		return udtUser;
	}
	/**
	 * @param udtUser the udtUser to set
	 */
	public void setUdtUser(String udtUser) {
		this.udtUser = udtUser;
	}
	/**
	 * @return the udtDate
	 */
	public String getUdtDate() {
		return udtDate;
	}
	/**
	 * @param udtDate the udtDate to set
	 */
	public void setUdtDate(String udtDate) {
		this.udtDate = udtDate;
	}
	
}
