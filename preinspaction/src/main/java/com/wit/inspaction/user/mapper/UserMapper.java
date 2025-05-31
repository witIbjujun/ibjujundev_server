package com.wit.inspaction.user.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.user.model.UserDTO;

@Repository
public class UserMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.user.mapper.UserMapper.";
	
	/**
	 * 사전점검 항목 리스트 조회
	 * @return <UserDTO>
	 */
	public List<UserDTO> selectCategoryList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectCategoryList", paramMap);
	}
	
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectCompanyList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectCompanyList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<String> selectCompanyIdList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectCompanyIdList", paramMap);
	}
	
	/**
	 * 공구
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<String> selectGongGuCompanyIdList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectGongGuCompanyIdList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectNoticeList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectNoticeList", paramMap);
	}
	
	/**
	 * 공구목록
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectGonguList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectGonguList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectAptPyoungList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectAptPyoungList", paramMap);
	}
	
	/**
	 * 토큰 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectTokenList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectTokenList", paramMap);
	}
	
	
	/**
	 * 토큰 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectReqTokenList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectReqTokenList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<String>
	 */
	public List<Map<String, String>> selectAptList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectAptList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<String>
	 */
	public List<Map<String, String>> selectMyAptList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectMyAptList", paramMap);
	}
	
	/**
	 * 
	 * @param paramMap
	 * @return
	 */
	public UserDTO selectUserInfo(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "selectUserInfo", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectRequestDetailList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectRequestDetailList", paramMap);
	}
	/**
	 * 견적목록
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectRequesAsistList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectRequesAsistList", paramMap);
	}
	
    
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertTotalRequestInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertTotalRequestInfo", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int updateDetailRequestState(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateDetailRequestState", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int updateRequestState(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateRequestState", paramMap);
	}
	
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int updateUserInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateUserInfo", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int updateTokenOnServer(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateTokenOnServer", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int userCheckCount(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "userCheckCount", paramMap);
	}
	
	/**
	 * 공구 카운트
	 * @param paramMap
	 * @return int
	 */
	public int selectCountGonguReqCount(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "selectCountGonguReqCount", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int userCheckKakaoCount(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "userCheckKakaoCount", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertUserInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertUserInfo", paramMap);
	}
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertHistoryRequest(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertHistoryRequest", paramMap);
	}
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int updateReqCount(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateReqCount", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertRequestInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertRequestInfo", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return String
	 */
	public String generateReqNo(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "generateReqNo", paramMap);
	}
}