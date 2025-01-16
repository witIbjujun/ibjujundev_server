package com.wit.inspaction.preinspaction.model;

public class PreinspactionDTO {
    
	private String inspId;					// 점검ID 
    private String inspSeq;					// 점검순번
    private String inspNm;					// 점검명
    private String inspComt;				// 점검 상세
    private String uppInspId;				// 상위 점검ID
    private String inspDetlAllCnt;			// 점검 상세 전체 건수
    private String inspDetlChoiceCnt;		// 점검 상세 건수
    private String inspDetlNoCnt;			// 점검 안한 건수
    private String checkYn;
    private String checkCnt;
    private String inspImg;					// 점검이미지
    private String checkDate;				// 하자 일자
    private String reprDate;				// 수리 일자
    private String checkComt;				// 하자 설명
    private String checkImg1;				// 하자 이미지 1
    private String checkImg2;				// 하자 이미지 2
    private String checkImg3;				// 하자 이미지 3
    
	/**
	 * @return the inspId
	 */
	public String getInspId() {
		return inspId;
	}
	/**
	 * @param inspId the inspId to set
	 */
	public void setInspId(String inspId) {
		this.inspId = inspId;
	}
	/**
	 * @return the inspSeq
	 */
	public String getInspSeq() {
		return inspSeq;
	}
	/**
	 * @param inspSeq the inspSeq to set
	 */
	public void setInspSeq(String inspSeq) {
		this.inspSeq = inspSeq;
	}
	/**
	 * @return the inspNm
	 */
	public String getInspNm() {
		return inspNm;
	}
	/**
	 * @param inspNm the inspNm to set
	 */
	public void setInspNm(String inspNm) {
		this.inspNm = inspNm;
	}
	/**
	 * @return the inspComt
	 */
	public String getInspComt() {
		return inspComt;
	}
	/**
	 * @param inspComt the inspComt to set
	 */
	public void setInspComt(String inspComt) {
		this.inspComt = inspComt;
	}
	/**
	 * @return the uppInspId
	 */
	public String getUppInspId() {
		return uppInspId;
	}
	/**
	 * @param uppInspId the uppInspId to set
	 */
	public void setUppInspId(String uppInspId) {
		this.uppInspId = uppInspId;
	}
	/**
	 * @return the inspDetlAllCnt
	 */
	public String getInspDetlAllCnt() {
		return inspDetlAllCnt;
	}
	/**
	 * @param inspDetlAllCnt the inspDetlAllCnt to set
	 */
	public void setInspDetlAllCnt(String inspDetlAllCnt) {
		this.inspDetlAllCnt = inspDetlAllCnt;
	}
	/**
	 * @return the inspDetlChoiceCnt
	 */
	public String getInspDetlChoiceCnt() {
		return inspDetlChoiceCnt;
	}
	/**
	 * @param inspDetlChoiceCnt the inspDetlChoiceCnt to set
	 */
	public void setInspDetlChoiceCnt(String inspDetlChoiceCnt) {
		this.inspDetlChoiceCnt = inspDetlChoiceCnt;
	}
	/**
	 * @return the inspDetlNoCnt
	 */
	public String getInspDetlNoCnt() {
		return inspDetlNoCnt;
	}
	/**
	 * @param inspDetlNoCnt the inspDetlNoCnt to set
	 */
	public void setInspDetlNoCnt(String inspDetlNoCnt) {
		this.inspDetlNoCnt = inspDetlNoCnt;
	}
	/**
	 * @return the checkYn
	 */
	public String getCheckYn() {
		return checkYn;
	}
	/**
	 * @param checkYn the checkYn to set
	 */
	public void setCheckYn(String checkYn) {
		this.checkYn = checkYn;
	}
	/**
	 * @return the checkCnt
	 */
	public String getCheckCnt() {
		return checkCnt;
	}
	/**
	 * @param checkCnt the checkCnt to set
	 */
	public void setCheckCnt(String checkCnt) {
		this.checkCnt = checkCnt;
	}
	/**
	 * @return the inspImg
	 */
	public String getInspImg() {
		return inspImg;
	}
	/**
	 * @param inspImg the inspImg to set
	 */
	public void setInspImg(String inspImg) {
		this.inspImg = inspImg;
	}
	/**
	 * @return the checkDate
	 */
	public String getCheckDate() {
		return checkDate;
	}
	/**
	 * @param checkDate the checkDate to set
	 */
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	/**
	 * @return the reprDate
	 */
	public String getReprDate() {
		return reprDate;
	}
	/**
	 * @param reprDate the reprDate to set
	 */
	public void setReprDate(String reprDate) {
		this.reprDate = reprDate;
	}
	/**
	 * @return the checkComt
	 */
	public String getCheckComt() {
		return checkComt;
	}
	/**
	 * @param checkComt the checkComt to set
	 */
	public void setCheckComt(String checkComt) {
		this.checkComt = checkComt;
	}
	/**
	 * @return the checkImg1
	 */
	public String getCheckImg1() {
		return checkImg1;
	}
	/**
	 * @param checkImg1 the checkImg1 to set
	 */
	public void setCheckImg1(String checkImg1) {
		this.checkImg1 = checkImg1;
	}
	/**
	 * @return the checkImg2
	 */
	public String getCheckImg2() {
		return checkImg2;
	}
	/**
	 * @param checkImg2 the checkImg2 to set
	 */
	public void setCheckImg2(String checkImg2) {
		this.checkImg2 = checkImg2;
	}
	/**
	 * @return the checkImg3
	 */
	public String getCheckImg3() {
		return checkImg3;
	}
	/**
	 * @param checkImg3 the checkImg3 to set
	 */
	public void setCheckImg3(String checkImg3) {
		this.checkImg3 = checkImg3;
	}
	
}