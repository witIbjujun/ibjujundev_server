package com.wit.inspaction.preinspaction.model;

public class PreinspactionDTO {
    
	private String inspId;					// 점검ID 
	private String inspDetlId;				// 점검 상세 ID
    private String inspSeq;					// 점검순번
    private String inspNm;					// 점검명
    private String inspComt;				// 점검 상세
    private String uppInspId;				// 상위 점검ID
    private String inspDetlAllCnt;			// 점검 상세 전체 건수
    private String inspDetlChoiceCnt;	// 점검 상세 건수
    private String inspDetlNoCnt;		// 점검 안한 건수
    
    private String checkYn;					// 하자 여부
    private String checkCnt;				// 하자 숫자
    private String inspImg;					// 점검이미지
    private String checkDate;				// 하자 일자
    private String reprDate;				// 수리 일자
    private String checkComt;				// 하자 설명
    private String checkImg1;				// 하자 이미지 1
    private String checkImg2;				// 하자 이미지 2
    
    private String inspIdLv1;				// 점검ID (레벨1)
    private String inspNmLv1;				// 점검명 (레벨1)
    private String inspIdLv2;				// 점검ID (레벨2)
    private String inspNmLv2;				// 점검명 (레벨2)
    private String inspIdLv3;				// 점검ID (레벨3)
    private String inspNmLv3;				// 점검명 (레벨3)
    
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
	 * @return the inspDetlId
	 */
	public String getInspDetlId() {
		return inspDetlId;
	}
	/**
	 * @param inspDetlId the inspDetlId to set
	 */
	public void setInspDetlId(String inspDetlId) {
		this.inspDetlId = inspDetlId;
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
	 * @return the inspIdLv1
	 */
	public String getInspIdLv1() {
		return inspIdLv1;
	}
	/**
	 * @param inspIdLv1 the inspIdLv1 to set
	 */
	public void setInspIdLv1(String inspIdLv1) {
		this.inspIdLv1 = inspIdLv1;
	}
	/**
	 * @return the inspNmLv1
	 */
	public String getInspNmLv1() {
		return inspNmLv1;
	}
	/**
	 * @param inspNmLv1 the inspNmLv1 to set
	 */
	public void setInspNmLv1(String inspNmLv1) {
		this.inspNmLv1 = inspNmLv1;
	}
	/**
	 * @return the inspIdLv2
	 */
	public String getInspIdLv2() {
		return inspIdLv2;
	}
	/**
	 * @param inspIdLv2 the inspIdLv2 to set
	 */
	public void setInspIdLv2(String inspIdLv2) {
		this.inspIdLv2 = inspIdLv2;
	}
	/**
	 * @return the inspNmLv2
	 */
	public String getInspNmLv2() {
		return inspNmLv2;
	}
	/**
	 * @param inspNmLv2 the inspNmLv2 to set
	 */
	public void setInspNmLv2(String inspNmLv2) {
		this.inspNmLv2 = inspNmLv2;
	}
	/**
	 * @return the inspIdLv3
	 */
	public String getInspIdLv3() {
		return inspIdLv3;
	}
	/**
	 * @param inspIdLv3 the inspIdLv3 to set
	 */
	public void setInspIdLv3(String inspIdLv3) {
		this.inspIdLv3 = inspIdLv3;
	}
	/**
	 * @return the inspNmLv3
	 */
	public String getInspNmLv3() {
		return inspNmLv3;
	}
	/**
	 * @param inspNmLv3 the inspNmLv3 to set
	 */
	public void setInspNmLv3(String inspNmLv3) {
		this.inspNmLv3 = inspNmLv3;
	}
	
}