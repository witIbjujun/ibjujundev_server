package com.wit.inspaction.question.model;

/**
 * 질문 옵션 정보 DTO
 * @author 조성훈
 * @since 2024.10.26
 * @category Question
 */
public class OptionInfoDTO {

	private String qustCd;				// 질문코드
    private String opCd;					// 옵션코드
    private String opSeq;				// 옵션순번
    private String endDate;			// 종료일자
    private String lowQustCd;			// 하위질문코드
    private String opTitle;				// 옵션 타이틀
    private String opSubTitle;			// 옵션 서브 타이틀
    private String opContents;		// 옵션 내용
    
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
	 * @return the opCd
	 */
	public String getOpCd() {
		return opCd;
	}
	/**
	 * @param opCd the opCd to set
	 */
	public void setOpCd(String opCd) {
		this.opCd = opCd;
	}
	/**
	 * @return the opSeq
	 */
	public String getOpSeq() {
		return opSeq;
	}
	/**
	 * @param opSeq the opSeq to set
	 */
	public void setOpSeq(String opSeq) {
		this.opSeq = opSeq;
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
	 * @return the lowQustCd
	 */
	public String getLowQustCd() {
		return lowQustCd;
	}
	/**
	 * @param lowQustCd the lowQustCd to set
	 */
	public void setLowQustCd(String lowQustCd) {
		this.lowQustCd = lowQustCd;
	}
	/**
	 * @return the opTitle
	 */
	public String getOpTitle() {
		return opTitle;
	}
	/**
	 * @param opTitle the opTitle to set
	 */
	public void setOpTitle(String opTitle) {
		this.opTitle = opTitle;
	}
	/**
	 * @return the opSubTitle
	 */
	public String getOpSubTitle() {
		return opSubTitle;
	}
	/**
	 * @param opSubTitle the opSubTitle to set
	 */
	public void setOpSubTitle(String opSubTitle) {
		this.opSubTitle = opSubTitle;
	}
	/**
	 * @return the opContents
	 */
	public String getOpContents() {
		return opContents;
	}
	/**
	 * @param opContents the opContents to set
	 */
	public void setOpContents(String opContents) {
		this.opContents = opContents;
	}
    
}
