package com.wit.inspaction.seller.model;

public class SellerDTO {

	private int sllrNo;					// 업체번호
	private String storeName;           // 업체명
	private String endDate;             // endDate
	private String serviceArea;         // 지역
	private String serviceAreaNm;       // 지역명
	private String serviceItem;	        // 품목코드
	private String categoryNm;          // 품목명 
	private String itemPrice1;          // 가격1
	private String sllrContent;         // 판매자 설명
	private String sllrImage;           // 이미지
    private String name;                // 성명
    private String ceoName;             // CEO명
    private String email;               // 이메일
    private String storeCode;           // 사업자번호
    private String storeImage;          // 사업자 인증 이미지
    private String hp;                  // 전화번호  
    private String zipCode;             // 우편번호
    private String address1;            // 주소
    private String address2;            // 상세주소
    private String reqCnt;              // 요청받은 건수
    private String ingCnt;              // 진행중 건수
    private String rate;                // 별점 
    private String clerkNo;             // 입주전 가입자 번호 
    private String bordNo;              // 게시판번호
    private String bordType;            // 게시판타입 C1 : 업체후기
    private String openDate;            // 개업일자
    private String asGbn;               // AS 구분
    private String asGbnNm;             // AS 구분명
    private String bizCertification;    // 사업자인증 상태
    private String bizCertificationNm;  // 사업자인증 상태명
    private String bizCertificationDate;    // 사업자인증 요청일
    private String bizCertificationImage; // 사업자등록증 이미지
    private String categoryContent; // 품목설명
    private String categoryImage; // 품목이미지
    private String rateFlag; // 품목이미지
    private String certificationYn; // 본인인증여부
    private String certificationNm; // 본인인증여부 명
    private String regiLevel; // 등록단계
    private String gpCnt;     // 공동구매 요청받은 건수
    private String gongguCnt; // 공동구매 진행 아파트 건수
    private String bizCertificationDateOri;
    
    /**
	 * @return the hpCertification
	 */
	public String getHpCertification() {
		return hpCertification;
	}
	/**
	 * @param hpCertification the hpCertification to set
	 */
	public void setHpCertification(String hpCertification) {
		this.hpCertification = hpCertification;
	}
	/**
	 * @return the hpCertificationDate
	 */
	public String getHpCertificationDate() {
		return hpCertificationDate;
	}
	/**
	 * @param hpCertificationDate the hpCertificationDate to set
	 */
	public void setHpCertificationDate(String hpCertificationDate) {
		this.hpCertificationDate = hpCertificationDate;
	}
	private String hpCertification;    	// 핸드폰 본인인증여부
    private String hpCertificationDate; // 핸드폰 본인인증 요청일
    
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
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
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
	 * @return the serviceArea
	 */
	public String getServiceArea() {
		return serviceArea;
	}
	/**
	 * @param serviceArea the serviceArea to set
	 */
	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}
	/**
	 * @return the serviceAreaNm
	 */
	public String getServiceAreaNm() {
		return serviceAreaNm;
	}
	/**
	 * @param serviceAreaNm the serviceAreaNm to set
	 */
	public void setServiceAreaNm(String serviceAreaNm) {
		this.serviceAreaNm = serviceAreaNm;
	}
	/**
	 * @return the serviceItem
	 */
	public String getServiceItem() {
		return serviceItem;
	}
	/**
	 * @param serviceItem the serviceItem to set
	 */
	public void setServiceItem(String serviceItem) {
		this.serviceItem = serviceItem;
	}
	/**
	 * @return the categoryNm
	 */
	public String getCategoryNm() {
		return categoryNm;
	}
	/**
	 * @param categoryNm the categoryNm to set
	 */
	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
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
	 * @return the sllrContent
	 */
	public String getSllrContent() {
		return sllrContent;
	}
	/**
	 * @param sllrContent the sllrContent to set
	 */
	public void setSllrContent(String sllrContent) {
		this.sllrContent = sllrContent;
	}
	/**
	 * @return the sllrImage
	 */
	public String getSllrImage() {
		return sllrImage;
	}
	/**
	 * @param sllrImage the sllrImage to set
	 */
	public void setSllrImage(String sllrImage) {
		this.sllrImage = sllrImage;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ceoName
	 */
	public String getCeoName() {
		return ceoName;
	}
	/**
	 * @param ceoName the ceoName to set
	 */
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the storeCode
	 */
	public String getStoreCode() {
		return storeCode;
	}
	/**
	 * @param storeCode the storeCode to set
	 */
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	/**
	 * @return the storeImage
	 */
	public String getStoreImage() {
		return storeImage;
	}
	/**
	 * @param storeImage the storeImage to set
	 */
	public void setStoreImage(String storeImage) {
		this.storeImage = storeImage;
	}
	/**
	 * @return the hp
	 */
	public String getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(String hp) {
		this.hp = hp;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the reqCnt
	 */
	public String getReqCnt() {
		return reqCnt;
	}
	/**
	 * @param reqCnt the reqCnt to set
	 */
	public void setReqCnt(String reqCnt) {
		this.reqCnt = reqCnt;
	}
	/**
	 * @return the ingCnt
	 */
	public String getIngCnt() {
		return ingCnt;
	}
	/**
	 * @param ingCnt the ingCnt to set
	 */
	public void setIngCnt(String ingCnt) {
		this.ingCnt = ingCnt;
	}
	/**
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * @return the clerkNo
	 */
	public String getClerkNo() {
		return clerkNo;
	}
	/**
	 * @param clerkNo the clerkNo to set
	 */
	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}
	/**
	 * @return the bordNo
	 */
	public String getBordNo() {
		return bordNo;
	}
	/**
	 * @param bordNo the bordNo to set
	 */
	public void setBordNo(String bordNo) {
		this.bordNo = bordNo;
	}
	/**
	 * @return the bordType
	 */
	public String getBordType() {
		return bordType;
	}
	/**
	 * @param bordType the bordType to set
	 */
	public void setBordType(String bordType) {
		this.bordType = bordType;
	}
	/**
	 * @return the openDate
	 */
	public String getOpenDate() {
		return openDate;
	}
	/**
	 * @param openDate the openDate to set
	 */
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	/**
	 * @return the asGbn
	 */
	public String getAsGbn() {
		return asGbn;
	}
	/**
	 * @param asGbn the asGbn to set
	 */
	public void setAsGbn(String asGbn) {
		this.asGbn = asGbn;
	}
	/**
	 * @return the asGbnNm
	 */
	public String getAsGbnNm() {
		return asGbnNm;
	}
	/**
	 * @param asGbnNm the asGbnNm to set
	 */
	public void setAsGbnNm(String asGbnNm) {
		this.asGbnNm = asGbnNm;
	}
	/**
	 * @return the bizCertification
	 */
	public String getBizCertification() {
		return bizCertification;
	}
	/**
	 * @param bizCertification the bizCertification to set
	 */
	public void setBizCertification(String bizCertification) {
		this.bizCertification = bizCertification;
	}
	/**
	 * @return the bizCertificationNm
	 */
	public String getBizCertificationNm() {
		return bizCertificationNm;
	}
	/**
	 * @param bizCertificationNm the bizCertificationNm to set
	 */
	public void setBizCertificationNm(String bizCertificationNm) {
		this.bizCertificationNm = bizCertificationNm;
	}
	/**
	 * @return the bizCertificationDate
	 */
	public String getBizCertificationDate() {
		return bizCertificationDate;
	}
	/**
	 * @param bizCertificationDate the bizCertificationDate to set
	 */
	public void setBizCertificationDate(String bizCertificationDate) {
		this.bizCertificationDate = bizCertificationDate;
	}
	/**
	 * @return the categoryContent
	 */
	public String getCategoryContent() {
		return categoryContent;
	}
	/**
	 * @param categoryContent the categoryContent to set
	 */
	public void setCategoryContent(String categoryContent) {
		this.categoryContent = categoryContent;
	}
	/**
	 * @return the categoryImage
	 */
	public String getCategoryImage() {
		return categoryImage;
	}
	/**
	 * @param categoryImage the categoryImage to set
	 */
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	/**
	 * @return the rateFlag
	 */
	public String getRateFlag() {
		return rateFlag;
	}
	/**
	 * @param rateFlag the rateFlag to set
	 */
	public void setRateFlag(String rateFlag) {
		this.rateFlag = rateFlag;
	}
	/**
	 * @return the certificationYn
	 */
	public String getCertificationYn() {
		return certificationYn;
	}
	/**
	 * @param certificationYn the certificationYn to set
	 */
	public void setCertificationYn(String certificationYn) {
		this.certificationYn = certificationYn;
	}
	/**
	 * @return the regiLevel
	 */
	public String getRegiLevel() {
		return regiLevel;
	}
	/**
	 * @param regiLevel the regiLevel to set
	 */
	public void setRegiLevel(String regiLevel) {
		this.regiLevel = regiLevel;
	}
	/**
	 * @return the gpCnt
	 */
	public String getGpCnt() {
		return gpCnt;
	}
	/**
	 * @param gpCnt the gpCnt to set
	 */
	public void setGpCnt(String gpCnt) {
		this.gpCnt = gpCnt;
	}
	/**
	 * @return the certificationNm
	 */
	public String getCertificationNm() {
		return certificationNm;
	}
	/**
	 * @param certificationNm the certificationNm to set
	 */
	public void setCertificationNm(String certificationNm) {
		this.certificationNm = certificationNm;
	}
	/**
	 * @return the gongguCnt
	 */
	public String getGongguCnt() {
		return gongguCnt;
	}
	/**
	 * @param gongguCnt the gongguCnt to set
	 */
	public void setGongguCnt(String gongguCnt) {
		this.gongguCnt = gongguCnt;
	}
	/**
	 * @return the bizCertificationImage
	 */
	public String getBizCertificationImage() {
		return bizCertificationImage;
	}
	/**
	 * @param bizCertificationImage the bizCertificationImage to set
	 */
	public void setBizCertificationImage(String bizCertificationImage) {
		this.bizCertificationImage = bizCertificationImage;
	}
	/**
	 * @return the bizCertificationDateOri
	 */
	public String getBizCertificationDateOri() {
		return bizCertificationDateOri;
	}
	/**
	 * @param bizCertificationDateOri the bizCertificationDateOri to set
	 */
	public void setBizCertificationDateOri(String bizCertificationDateOri) {
		this.bizCertificationDateOri = bizCertificationDateOri;
	}

}