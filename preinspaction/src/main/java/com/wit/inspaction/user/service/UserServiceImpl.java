package com.wit.inspaction.user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.preinspaction.mapper.PreinspactionMapper;
import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;
import com.wit.inspaction.user.mapper.UserMapper;
import com.wit.inspaction.user.model.UserDTO;

/**
 * 사전점검 서비스 상세
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 사전점검 리스트 조회
	 */
	@Override
	public List<UserDTO> getCategoryList() {
		
		System.out.println("UserServiceImpl getCategoryList 호출");
		
		List<UserDTO> list = userMapper.selectCategoryList();
		
		return list;
	}

	@Override
	public List<UserDTO> getCompanyList(HashMap<String, Object> paramMap) {
		
		System.out.println("UserServiceImpl getCompanyList 호출");

		List<UserDTO> list = userMapper.selectCompanyList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getNoticeList(HashMap<String, Object> paramMap) {
		
		System.out.println("UserServiceImpl getNoticeList 호출");
		
		List<UserDTO> list = userMapper.selectNoticeList(paramMap);
		
		return list;
	}
	
	@Override
	public UserDTO getUserInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("UserServiceImpl getUserInfo 호출");
		
		UserDTO userInfo = userMapper.selectUserInfo(paramMap);
		
		return userInfo;
	}
	
	@Override
	public List<Map<String, String>> getAptList(HashMap<String, Object> paramMap) {
		
		System.out.println("UserServiceImpl getAptList 호출");
		
		List<Map<String, String>> aptList = userMapper.selectAptList(paramMap);
		
		return aptList;
	}
	
	
	@Override
	public List<UserDTO> getRequesDetailtList(HashMap<String, Object> paramMap) {
		
		System.out.println("UserServiceImpl getRequesDetailtList 호출");
		
		List<UserDTO> list = userMapper.selectRequestDetailList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getRequestAsisList(HashMap<String, Object> paramMap) {
		
		System.out.println("UserServiceImpl getRequestAsisList 호출");
		
		List<UserDTO> list = userMapper.selectRequesAsistList(paramMap);
		
		return list;
	}

	@Override
	public int saveRequestInfo(HashMap<String, Object> paramMap) {
		
		List<String> companyIds = (List<String>) paramMap.get("companyIds");

	    int insertCount = 0;
	    int loopCount = 0;  // 루프 카운터 변수

	    for (String companyId : companyIds) {
	    	System.out.println("companyId==="+companyId);
	        paramMap.put("companyId", companyId);
	        paramMap.put("seq",  loopCount++);
	        insertCount += userMapper.insertRequestInfo(paramMap);
	        paramMap.put("reqNo",  paramMap.get("reqNo"));
	    	System.out.println("===================================");
	    	System.out.println("reqNo==="+paramMap.get("reqNo"));
	    	System.out.println("===================================");
	        insertCount += userMapper.insertHistoryRequest(paramMap);
	    }
	    // 총 삽입된 건수 반환
	    return insertCount;
	}
	
	@Override
	public int updateRequestState(HashMap<String, Object> paramMap) {
		
		return userMapper.updateRequestState(paramMap);
	}
	@Override
	public int updateDetailRequestState(HashMap<String, Object> paramMap) {
		
		return userMapper.updateDetailRequestState(paramMap);
	}
	
	@Override
	public int updateUserInfo(HashMap<String, Object> paramMap) {
		
		return userMapper.updateUserInfo(paramMap);
	}
	
	@Override
	public int saveTotalRequestInfo(HashMap<String, Object> paramMap) {
		
		List<String> categoryIds = (List<String>) paramMap.get("categoryIds");
		
		int insertCount = 0;
	
		String reqNo = userMapper.generateReqNo(paramMap);  // 생성된 req_no 값을 얻기 위한 함수 호출
		
		int loopCount = 0;  // 루프 카운터 변수
		for (String categoryId : categoryIds) {
			System.out.println("reqNo==="+reqNo);
			System.out.println("seq==="+loopCount++);
			System.out.println("categoryId==="+categoryId);
			System.out.println("aptNo1212121212==="+paramMap.get("aptNo"));
			
			paramMap.put("categoryId", categoryId);
			
			List<UserDTO> companyList = userMapper.selectCompanyList(paramMap);
			 for (UserDTO company : companyList) {
				 HashMap<String, Object> insertMap = new HashMap<>();
				 insertMap.put("reqNo", reqNo);
				 insertMap.put("companyId", company.getCompanyId());
				 insertMap.put("categoryId", categoryId);
				 insertMap.put("reqGubun", paramMap.get("reqGubun"));
				 insertMap.put("reqUser", paramMap.get("reqUser"));
				 insertMap.put("reqState", paramMap.get("reqState"));
				 insertMap.put("reqContents", paramMap.get("reqContents"));
				 insertMap.put("aptNo",  paramMap.get("aptNo"));
				 insertMap.put("seq",  loopCount++);
			     insertCount += userMapper.insertTotalRequestInfo(insertMap);
			     insertMap.put("reqNo",  insertMap.get("reqNo"));
		        insertCount += userMapper.insertHistoryRequest(insertMap);
			     
			    }
		}
		// 총 삽입된 건수 반환
		return insertCount;
	}
	

}
