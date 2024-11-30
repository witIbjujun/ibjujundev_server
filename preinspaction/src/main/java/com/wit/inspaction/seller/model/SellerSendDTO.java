package com.wit.inspaction.seller.model;

public class SellerSendDTO {

	private String sllrNo;
	private String estNo;
	private String aptName;
	private String content;					// 점검ID
    private String itemName;					// 점검순번
    private String itemImage;
    private String customerContent;					// 점검명
    private String itemPrice1;				// 상위 점검ID
    private String itemPrice2;			// 점검 상세 전체 건수

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
	 * @return the customerContent
	 */
	public String getCustomerContent() {
		return customerContent;
	}
	/**
	 * @param customerContent the customerContent to set
	 */
	public void setCustomerContent(String customerContent) {
		this.customerContent = customerContent;
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
	 * @return the itemPrice2
	 */
	public String getItemPrice2() {
		return itemPrice2;
	}
	/**
	 * @param itemPrice2 the itemPrice2 to set
	 */
	public void setItemPrice2(String itemPrice2) {
		this.itemPrice2 = itemPrice2;
	}


}