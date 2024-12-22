package com.wit.inspaction.user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wit.inspaction.user.model.UserDTO;

/**
 * 사전점검 서비스
 */
public interface UserService {

	/**
	 * 사전점검 항목 리스트 조회
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getCategoryList();
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getCompanyList(HashMap<String, Object> paramMap);
	
	/**
	 * 신청이력조회 
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getRequesDetailtList(HashMap<String, Object> paramMap);
	
	/**
	 * 견적목록
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getRequestAsisList(HashMap<String, Object> paramMap);
	
	/**
	 * 신청이력조회 
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getNoticeList(HashMap<String, Object> paramMap);
	
	/**
	 * 내정보 
	 * @param paramMap
	 * @return
	 */
	public UserDTO getUserInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 유저 등록 체크 
	 * @param param
	 * @return int
	 */
	public int userCheckCount(HashMap<String, Object> paramMap);
	
	/**
	 * 유저 등록 체크 
	 * @param param
	 * @return int
	 */
	public int insertUserInfo(HashMap<String, Object> paramMap);
	
	
	/**
	 * 내정보 
	 * @param paramMap
	 * @return
	 */
	public List<Map<String, String>> getAptList(HashMap<String, Object> paramMap);
	
	/**
	 * 내정보 
	 * @param paramMap
	 * @return
	 */
	public List<Map<String, String>> getMyAptList(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 항목 저장
	 * @param param
	 * @return int
	 */
	public int saveRequestInfo(HashMap<String, Object> paramMap);

	/**
	 * 사전점검 항목 저장 토탈
	 * @param paramMap
	 * @return
	 */
	public int saveTotalRequestInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 항목 저장 토탈
	 * @param paramMap
	 * @return
	 */
	public int updateRequestState(HashMap<String, Object> paramMap);
	
	/**
	 * 업체에서 견적보내기
	 * @param paramMap
	 * @return
	 */
	public int updateDetailRequestState(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 항목 저장 토탈
	 * @param paramMap
	 * @return
	 */
	public int updateUserInfo(HashMap<String, Object> paramMap);

	
}
