package com.wit.inspaction.user.model;

import java.util.List;
import java.util.Map;

public class UserDTO {
    
	private String categoryId;				// 점검ID
    private String categoryNm;				// 점검순번
    private String detail;					// 점검명
    private String imagePath;				// 점검명
    private String gpStartDate;				// 공동구매시작일
    private String gpEndDate;				// 공동구매 종료일
    private String gpStat;				    // 공동구매 진행상태
    private String limitCount;				// 공동구매 종료일
    private String reqCount;				// 요청수량
    private String saleRate;				// 할인율%
    private String saleAmt;				    // 할인된 금액
    private String clickCount;				// 점검명
    private String companyCnt;				// 점검명
    private String companyId;				// 점검명
    private String rate;					// 점검명
    private String companyNm;				// 점검명
    private String reqNo;				// 점검명
    private String formatReqNo;				// 점검명
    private String reqState;				// 점검명
    private String reqStateNm;				// 점검명
    private String reqDateInfo;				// 점검명
    private String reqDate;				// 점검명
    private String reqContents;				// 점검명
    private String seq;				// 점검명
    private String timeAgo;				// 점검명
    private String estimateAmount;				// 점검명
    private String estimateContents;				// 점검명
    private String reqGubun;				// 점검명
    private String email;				// 점검명
    private String clerkNo;
    private String kakaoId;
    private String role;
    private String nickName;
    private String name;
    private String mainAptNo;               // 메인아파트 번호
    private String mainAptNm;               // 메인아파트 이름
    private String mainAptPyoung;               // 메인아파트 이름
    private String updownGubun;               // 메인아파트 이름
    private String type;               // 메인아파트 이름
    private String token;               // 메인아파트 이름
    private String price;               // 메인아파트 이름
    private String imageFilePath;               // 업체 이미지 파일path
    private String estimateDate;               // 업체 이미지 파일path
    private String finishCount;               // 업체 이미지 파일path
    private List<String> aptNo;               // 아파트 번호 리스트
    private List<String> aptName;             // 아파트 이름 리스트

    
	public String getGpStartDate() {
		return gpStartDate;
	}
	public void setGpStartDate(String gpStartDate) {
		this.gpStartDate = gpStartDate;
	}
	public String getGpEndDate() {
		return gpEndDate;
	}
	public void setGpEndDate(String gpEndDate) {
		this.gpEndDate = gpEndDate;
	}
	public String getGpStat() {
		return gpStat;
	}
	public void setGpStat(String gpStat) {
		this.gpStat = gpStat;
	}
	public String getLimitCount() {
		return limitCount;
	}
	public void setLimitCount(String limitCount) {
		this.limitCount = limitCount;
	}
	public String getReqCount() {
		return reqCount;
	}
	public void setReqCount(String reqCount) {
		this.reqCount = reqCount;
	}
	public String getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(String saleRate) {
		this.saleRate = saleRate;
	}
	public String getSaleAmt() {
		return saleAmt;
	}
	public void setSaleAmt(String saleAmt) {
		this.saleAmt = saleAmt;
	}
	public String getFinishCount() {
		return finishCount;
	}
	public void setFinishCount(String finishCount) {
		this.finishCount = finishCount;
	}
	public String getEstimateDate() {
		return estimateDate;
	}
	public void setEstimateDate(String estimateDate) {
		this.estimateDate = estimateDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReqGubun() {
		return reqGubun;
	}
	public void setReqGubun(String reqGubun) {
		this.reqGubun = reqGubun;
	}
	public String getFormatReqNo() {
		return formatReqNo;
	}
	public void setFormatReqNo(String formatReqNo) {
		this.formatReqNo = formatReqNo;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUpdownGubun() {
		return updownGubun;
	}
	public void setUpdownGubun(String updownGubun) {
		this.updownGubun = updownGubun;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMainAptPyoung() {
		return mainAptPyoung;
	}
	public void setMainAptPyoung(String mainAptPyoung) {
		this.mainAptPyoung = mainAptPyoung;
	}
	public String getMainAptNm() {
		return mainAptNm;
	}
	public void setMainAptNm(String mainAptNm) {
		this.mainAptNm = mainAptNm;
	}
	public String getMainAptNo() {
		return mainAptNo;
	}
	public void setMainAptNo(String mainAptNo) {
		this.mainAptNo = mainAptNo;
	}
	public List<String> getAptNo() {
		return aptNo;
	}
	public void setAptNo(List<String> aptNo) {
		this.aptNo = aptNo;
	}
	public List<String> getAptName() {
		return aptName;
	}
	public void setAptName(List<String> aptName) {
		this.aptName = aptName;
	}
	public String getClerkNo() {
		return clerkNo;
	}
	public void setClerkNo(String clerkNo) {
		this.clerkNo = clerkNo;
	}
	public String getKakaoId() {
		return kakaoId;
	}
	public void setKakaoId(String kakaoId) {
		this.kakaoId = kakaoId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEstimateContents() {
		return estimateContents;
	}
	public void setEstimateContents(String estimateContents) {
		this.estimateContents = estimateContents;
	}
	public String getEstimateAmount() {
		return estimateAmount;
	}
	public void setEstimateAmount(String estimateAmount) {
		this.estimateAmount = estimateAmount;
	}
	public String getTimeAgo() {
		return timeAgo;
	}
	public void setTimeAgo(String timeAgo) {
		this.timeAgo = timeAgo;
	}
	public String getReqStateNm() {
		return reqStateNm;
	}
	public void setReqStateNm(String reqStateNm) {
		this.reqStateNm = reqStateNm;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getReqNo() {
		return reqNo;
	}
	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}
	public String getReqState() {
		return reqState;
	}
	public void setReqState(String reqState) {
		this.reqState = reqState;
	}
	public String getReqDateInfo() {
		return reqDateInfo;
	}
	public void setReqDateInfo(String reqDateInfo) {
		this.reqDateInfo = reqDateInfo;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqContents() {
		return reqContents;
	}
	public void setReqContents(String reqContents) {
		this.reqContents = reqContents;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getCompanyNm() {
		return companyNm;
	}
	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}
	public String getCompanyCnt() {
		return companyCnt;
	}
	public void setCompanyCnt(String companyCnt) {
		this.companyCnt = companyCnt;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryNm() {
		return categoryNm;
	}
	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getClickCount() {
		return clickCount;
	}
	public void setClickCount(String clickCount) {
		this.clickCount = clickCount;
	}
    
    
}