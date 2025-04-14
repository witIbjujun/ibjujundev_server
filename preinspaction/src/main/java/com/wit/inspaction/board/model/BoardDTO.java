package com.wit.inspaction.board.model;

public class BoardDTO {

	private int bordNo;				// 게시판 번호
	private String bordName;				// 게시판 이름
	private int bordSeq;				// 게시판 순번
	private String delYn;				// 삭제여부
	private String bordType;			// 게시판 타입
	private String bordTitle;			// 게시판 제목
	private String bordSubTitle;		// 게시판 소제목
	private String bordContent;		// 게시판 내용
	private int bordRdCnt;				// 게시판 조회수
	private int bordGdCnt;				// 게시판 좋아요수
	private int commentCnt;			// 댓글 수
	private String imagePath;			// 이미지 경로
	private String creUser;				// 작성자
	private String creUserNm;			// 작성자명
	private String creDate;				// 작성일자
	private String creDateTxt;			// 작성일 문구
	private String updUser;			// 수정자
	private String updDate;			// 수정일자
	

	public String getBordName() {
		return bordName;
	}
	public void setBordName(String bordName) {
		this.bordName = bordName;
	}
	/**
	 * @return the bordNo
	 */
	public int getBordNo() {
		return bordNo;
	}
	/**
	 * @param bordNo the bordNo to set
	 */
	public void setBordNo(int bordNo) {
		this.bordNo = bordNo;
	}
	/**
	 * @return the bordSeq
	 */
	public int getBordSeq() {
		return bordSeq;
	}
	/**
	 * @param bordSeq the bordSeq to set
	 */
	public void setBordSeq(int bordSeq) {
		this.bordSeq = bordSeq;
	}
	/**
	 * @return the delYn
	 */
	public String getDelYn() {
		return delYn;
	}
	/**
	 * @param delYn the delYn to set
	 */
	public void setDelYn(String delYn) {
		this.delYn = delYn;
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
	 * @return the bordTitle
	 */
	public String getBordTitle() {
		return bordTitle;
	}
	/**
	 * @param bordTitle the bordTitle to set
	 */
	public void setBordTitle(String bordTitle) {
		this.bordTitle = bordTitle;
	}
	/**
	 * @return the bordSubTitle
	 */
	public String getBordSubTitle() {
		return bordSubTitle;
	}
	/**
	 * @param bordSubTitle the bordSubTitle to set
	 */
	public void setBordSubTitle(String bordSubTitle) {
		this.bordSubTitle = bordSubTitle;
	}
	/**
	 * @return the bordContent
	 */
	public String getBordContent() {
		return bordContent;
	}
	/**
	 * @param bordContent the bordContent to set
	 */
	public void setBordContent(String bordContent) {
		this.bordContent = bordContent;
	}
	/**
	 * @return the bordRdCnt
	 */
	public int getBordRdCnt() {
		return bordRdCnt;
	}
	/**
	 * @param bordRdCnt the bordRdCnt to set
	 */
	public void setBordRdCnt(int bordRdCnt) {
		this.bordRdCnt = bordRdCnt;
	}
	/**
	 * @return the bordGdCnt
	 */
	public int getBordGdCnt() {
		return bordGdCnt;
	}
	/**
	 * @param bordGdCnt the bordGdCnt to set
	 */
	public void setBordGdCnt(int bordGdCnt) {
		this.bordGdCnt = bordGdCnt;
	}
	/**
	 * @return the commentCnt
	 */
	public int getCommentCnt() {
		return commentCnt;
	}
	/**
	 * @param commentCnt the commentCnt to set
	 */
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
	 * @return the creUserNm
	 */
	public String getCreUserNm() {
		return creUserNm;
	}
	/**
	 * @param creUserNm the creUserNm to set
	 */
	public void setCreUserNm(String creUserNm) {
		this.creUserNm = creUserNm;
	}
	/**
	 * @return the creDate
	 */
	public String getCreDate() {
		return creDate;
	}
	/**
	 * @param creDate the creDate to set
	 */
	public void setCreDate(String creDate) {
		this.creDate = creDate;
	}
	/**
	 * @return the creDateTxt
	 */
	public String getCreDateTxt() {
		return creDateTxt;
	}
	/**
	 * @param creDateTxt the creDateTxt to set
	 */
	public void setCreDateTxt(String creDateTxt) {
		this.creDateTxt = creDateTxt;
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
	/**
	 * @return the updDate
	 */
	public String getUpdDate() {
		return updDate;
	}
	/**
	 * @param updDate the updDate to set
	 */
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
	
}
