package com.wit.inspaction.seller.model;

public class EstimateRequestDTO {

	private String estNo;					// 견적번호
	private String itemName;				// 품목명
	private String estDt;					// 견적발송일
    private String aptName;					// 아파트명
    private String itemImage;				// 이미지
    private String stat;				    // 견적상태
    private String content;					// 업체 견적 발송 설명
    private String prsnName;				// 요청자명
    private String autoYn;					// 바로견적 여부

	/**
	 * @return the estNo
	 */
	public String getEstNo() {
		return estNo;
	}
	/**
	 * @param estNo the estNo to set
	 */
	public void setEstNo(String estNo) {
		this.estNo = estNo;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the estDt
	 */
	public String getEstDt() {
		return estDt;
	}
	/**
	 * @param estDt the estDt to set
	 */
	public void setEstDt(String estDt) {
		this.estDt = estDt;
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
	 * @return the itemImage
	 */
	public String getItemImage() {
		return itemImage;
	}
	/**
	 * @param itemImage the itemImage to set
	 */
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
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
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the prsnName
	 */
	public String getPrsnName() {
		return prsnName;
	}
	/**
	 * @param prsnName the prsnName to set
	 */
	public void setPrsnName(String prsnName) {
		this.prsnName = prsnName;
	}
	/**
	 * @return the autoYn
	 */
	public String getAutoYn() {
		return autoYn;
	}
	/**
	 * @param autoYn the autoYn to set
	 */
	public void setAutoYn(String autoYn) {
		this.autoYn = autoYn;
	}




}