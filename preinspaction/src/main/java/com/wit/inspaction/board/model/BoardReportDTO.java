package com.wit.inspaction.board.model;

public class BoardReportDTO {

	private String bordNo;					// 게시판 번호
	private String bordType;				// 게시판 타입
	private String bordTypeNm;			// 게시판 타입명
	private String bordTitle;				// 게시판 제목
	private String creUserNm;				// 게시판 작성자명
	private String profileImg;				// 작성자 이미지 경로
	private String creDateTxt;				// 게시판 작성일자
	private String reportCnt;				// 게시판 신고건수
	private String reportReason;			// 신고 사유
	private String reportContent;			// 신고 내용
	
	/**
	 * @return the bordNo
	 */
	public String getBordNo() {
		return bordNo;
	}
	/**
	 * @param bordNo the bordNo to set
	 */
	public void setBordNo(String bordNo) {
		this.bordNo = bordNo;
	}
	/**
	 * @return the bordType
	 */
	public String getBordType() {
		return bordType;
	}
	/**
	 * @param bordType the bordType to set
	 */
	public void setBordType(String bordType) {
		this.bordType = bordType;
	}
	/**
	 * @return the bordTypeNm
	 */
	public String getBordTypeNm() {
		return bordTypeNm;
	}
	/**
	 * @param bordTypeNm the bordTypeNm to set
	 */
	public void setBordTypeNm(String bordTypeNm) {
		this.bordTypeNm = bordTypeNm;
	}
	/**
	 * @return the bordTitle
	 */
	public String getBordTitle() {
		return bordTitle;
	}
	/**
	 * @param bordTitle the bordTitle to set
	 */
	public void setBordTitle(String bordTitle) {
		this.bordTitle = bordTitle;
	}
	/**
	 * @return the creUserNm
	 */
	public String getCreUserNm() {
		return creUserNm;
	}
	/**
	 * @param creUserNm the creUserNm to set
	 */
	public void setCreUserNm(String creUserNm) {
		this.creUserNm = creUserNm;
	}
	/**
	 * @return the profileImg
	 */
	public String getProfileImg() {
		return profileImg;
	}
	/**
	 * @param profileImg the profileImg to set
	 */
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	/**
	 * @return the creDateTxt
	 */
	public String getCreDateTxt() {
		return creDateTxt;
	}
	/**
	 * @param creDateTxt the creDateTxt to set
	 */
	public void setCreDateTxt(String creDateTxt) {
		this.creDateTxt = creDateTxt;
	}
	/**
	 * @return the reportCnt
	 */
	public String getReportCnt() {
		return reportCnt;
	}
	/**
	 * @param reportCnt the reportCnt to set
	 */
	public void setReportCnt(String reportCnt) {
		this.reportCnt = reportCnt;
	}
	/**
	 * @return the reportReason
	 */
	public String getReportReason() {
		return reportReason;
	}
	/**
	 * @param reportReason the reportReason to set
	 */
	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}
	/**
	 * @return the reportContent
	 */
	public String getReportContent() {
		return reportContent;
	}
	/**
	 * @param reportContent the reportContent to set
	 */
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	
}
