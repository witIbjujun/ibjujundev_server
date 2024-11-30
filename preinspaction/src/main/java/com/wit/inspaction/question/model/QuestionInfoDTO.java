package com.wit.inspaction.question.model;

/**
 * 질문 정보 DTO
 * @author 조성훈
 * @since 2024.10.26
 * @category Question
 */
public class QuestionInfoDTO {

    private String qustCd;				// 질문코드
    private String endDate;			// 종료일자
    private String qustOpCd;			// 질문옵션코드
    private String qustTitle;			// 질문 타이틀
    private String qustSubTitle;		// 질문 서브 타이틀
    private String qustType;			// 질문 타입
    private String rem;					// 설명
    
	/**
	 * @return the qustCd
	 */
	public String getQustCd() {
		return qustCd;
	}
	/**
	 * @param qustCd the qustCd to set
	 */
	public void setQustCd(String qustCd) {
		this.qustCd = qustCd;
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
	 * @return the qustOpCd
	 */
	public String getQustOpCd() {
		return qustOpCd;
	}
	/**
	 * @param qustOpCd the qustOpCd to set
	 */
	public void setQustOpCd(String qustOpCd) {
		this.qustOpCd = qustOpCd;
	}
	/**
	 * @return the qustTitle
	 */
	public String getQustTitle() {
		return qustTitle;
	}
	/**
	 * @param qustTitle the qustTitle to set
	 */
	public void setQustTitle(String qustTitle) {
		this.qustTitle = qustTitle;
	}
	/**
	 * @return the qustSubTitle
	 */
	public String getQustSubTitle() {
		return qustSubTitle;
	}
	/**
	 * @param qustSubTitle the qustSubTitle to set
	 */
	public void setQustSubTitle(String qustSubTitle) {
		this.qustSubTitle = qustSubTitle;
	}
	/**
	 * @return the qustType
	 */
	public String getQustType() {
		return qustType;
	}
	/**
	 * @param qustType the qustType to set
	 */
	public void setQustType(String qustType) {
		this.qustType = qustType;
	}
	/**
	 * @return the rem
	 */
	public String getRem() {
		return rem;
	}
	/**
	 * @param rem the rem to set
	 */
	public void setRem(String rem) {
		this.rem = rem;
	}
    
}
