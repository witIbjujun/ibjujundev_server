package com.wit.inspaction.seller.model;

/**
 * 캐시충전 금액 설정
 */
public class CashRechargeSetDTO {

	private String cashRechargeNo; // 캐시 충전금액 설정 번호
	private String cashGbn; 	   // 캐시 충전 구분 01 : 캐시충전, 02 : 자동충전
	private String endDate; 	   // 종료일
	private String cash;    	   // 결재금액
	private String bonusRatio; 	   // 보너스 포인트 비율
	private String bonusCash;  	   // 보너스 캐시
	private String totalCash;      // 충전 캐시
	private String recomYn;        // 추천 여부
	private String popularYn;      // 인기 여부
	private String creDt;          // 등록일
	private String creUser;        // 등록자
	private String updDt;          // 수정일
	private String updUser;        // 수정자

	/**
	 * @return the cashRechargeNo
	 */
	public String getCashRechargeNo() {
		return cashRechargeNo;
	}
	/**
	 * @param cashRechargeNo the cashRechargeNo to set
	 */
	public void setCashRechargeNo(String cashRechargeNo) {
		this.cashRechargeNo = cashRechargeNo;
	}
	/**
	 * @return the cashGbn
	 */
	public String getCashGbn() {
		return cashGbn;
	}
	/**
	 * @param cashGbn the cashGbn to set
	 */
	public void setCashGbn(String cashGbn) {
		this.cashGbn = cashGbn;
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
	 * @return the cash
	 */
	public String getCash() {
		return cash;
	}
	/**
	 * @param cash the cash to set
	 */
	public void setCash(String cash) {
		this.cash = cash;
	}
	/**
	 * @return the bonusRatio
	 */
	public String getBonusRatio() {
		return bonusRatio;
	}
	/**
	 * @param bonusRatio the bonusRatio to set
	 */
	public void setBonusRatio(String bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	/**
	 * @return the bonusCash
	 */
	public String getBonusCash() {
		return bonusCash;
	}
	/**
	 * @param bonusCash the bonusCash to set
	 */
	public void setBonusCash(String bonusCash) {
		this.bonusCash = bonusCash;
	}
	/**
	 * @return the totalCash
	 */
	public String getTotalCash() {
		return totalCash;
	}
	/**
	 * @param totalCash the totalCash to set
	 */
	public void setTotalCash(String totalCash) {
		this.totalCash = totalCash;
	}
	/**
	 * @return the recomYn
	 */
	public String getRecomYn() {
		return recomYn;
	}
	/**
	 * @param recomYn the recomYn to set
	 */
	public void setRecomYn(String recomYn) {
		this.recomYn = recomYn;
	}
	/**
	 * @return the popularYn
	 */
	public String getPopularYn() {
		return popularYn;
	}
	/**
	 * @param popularYn the popularYn to set
	 */
	public void setPopularYn(String popularYn) {
		this.popularYn = popularYn;
	}
	/**
	 * @return the creDt
	 */
	public String getCreDt() {
		return creDt;
	}
	/**
	 * @param creDt the creDt to set
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @return the updDt
	 */
	public String getUpdDt() {
		return updDt;
	}
	/**
	 * @param updDt the updDt to set
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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


}