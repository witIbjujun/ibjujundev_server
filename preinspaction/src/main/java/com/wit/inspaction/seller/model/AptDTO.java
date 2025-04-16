package com.wit.inspaction.seller.model;

public class AptDTO {
	private String aptNo;             // 아파트번호
	private String aptName;           // 아파트명
	private int sllrNo;				  // 판매자번호
	private String endDate;           // 종료일자
	private String sscrStDate;        // 구독개시일
	private String splSize;	          // 분양규모
	private String moveinScjDate;     // 입주일   
	private String stat;              // 상태 
	
	/**
	 * @return the aptNo
	 */
	public String getAptNo() {
		return aptNo;
	}
	/**
	 * @param aptNo the aptNo to set
	 */
	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}
	/**
	 * @return the aptName
	 */
	public String getAptName() {
		return aptName;
	}
	/**
	 * @param aptName the aptName to set
	 */
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	/**
	 * @return the sllrNo
	 */
	public int getSllrNo() {
		return sllrNo;
	}
	/**
	 * @param sllrNo the sllrNo to set
	 */
	public void setSllrNo(int sllrNo) {
		this.sllrNo = sllrNo;
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
	 * @return the sscrStDate
	 */
	public String getSscrStDate() {
		return sscrStDate;
	}
	/**
	 * @param sscrStDate the sscrStDate to set
	 */
	public void setSscrStDate(String sscrStDate) {
		this.sscrStDate = sscrStDate;
	}
	/**
	 * @return the splSize
	 */
	public String getSplSize() {
		return splSize;
	}
	/**
	 * @param splSize the splSize to set
	 */
	public void setSplSize(String splSize) {
		this.splSize = splSize;
	}
	/**
	 * @return the moveinScjDate
	 */
	public String getMoveinScjDate() {
		return moveinScjDate;
	}
	/**
	 * @param moveinScjDate the moveinScjDate to set
	 */
	public void setMoveinScjDate(String moveinScjDate) {
		this.moveinScjDate = moveinScjDate;
	}
	/**
	 * @return the stat
	 */
	public String getStat() {
		return stat;
	}
	/**
	 * @param stat the stat to set
	 */
	public void setStat(String stat) {
		this.stat = stat;
	}

	
}

