package com.wit.inspaction.seller.model;

public class SellerSendDTO {

	private String sllrNo;
	private String estNo;
	private String aptName;
	private String content;					// 점검ID
    private String itemName;					// 점검순번
    private String itemImage;
    private String reqContents;					// 점검명
    private String itemPrice1;				// 상위 점검ID
    private String estimateContents;
	/**
	 * @return the sllrNo
	 */
	public String getSllrNo() {
		return sllrNo;
	}
	/**
	 * @param sllrNo the sllrNo to set
	 */
	public void setSllrNo(String sllrNo) {
		this.sllrNo = sllrNo;
	}
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
	 * @return the reqContents
	 */
	public String getReqContents() {
		return reqContents;
	}
	/**
	 * @param reqContents the reqContents to set
	 */
	public void setReqContents(String reqContents) {
		this.reqContents = reqContents;
	}
	/**
	 * @return the itemPrice1
	 */
	public String getItemPrice1() {
		return itemPrice1;
	}
	/**
	 * @param itemPrice1 the itemPrice1 to set
	 */
	public void setItemPrice1(String itemPrice1) {
		this.itemPrice1 = itemPrice1;
	}
	/**
	 * @return the estimateContents
	 */
	public String getEstimateContents() {
		return estimateContents;
	}
	/**
	 * @param estimateContents the estimateContents to set
	 */
	public void setEstimateContents(String estimateContents) {
		this.estimateContents = estimateContents;
	}

}