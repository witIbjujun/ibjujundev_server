package com.wit.inspaction.preinspaction.model;

public class PreinspactionDTO {
    
	private String inspId;					// 점검ID 
    private String inspSeq;					// 점검순번
    private String inspNm;					// 점검명
    private String uppInspId;				// 상위 점검ID
    private String inspDetlAllCnt;			// 점검 상세 전체 건수
    private String inspDetlChoiceCnt;		// 점검 상세 건수
    private String inspDetlNoCnt;			// 점검 안한 건수
    private String checkYn;
    private String checkCnt;
    
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
	
}