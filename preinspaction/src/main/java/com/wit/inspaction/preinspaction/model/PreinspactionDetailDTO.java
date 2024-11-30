package com.wit.inspaction.preinspaction.model;

public class PreinspactionDetailDTO {
    
	private String inspId;					// 점검 ID
    private String inspDetlId;				// 점검 상세 ID
    private String inspDetlNm;			// 점검 상세 명
    private String checkYn;				// 선택여부
    
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
	 * @return the inspDetlNm
	 */
	public String getInspDetlNm() {
		return inspDetlNm;
	}
	/**
	 * @param inspDetlNm the inspDetlNm to set
	 */
	public void setInspDetlNm(String inspDetlNm) {
		this.inspDetlNm = inspDetlNm;
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
    
}