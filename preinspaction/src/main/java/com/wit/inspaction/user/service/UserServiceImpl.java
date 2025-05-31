package com.wit.inspaction.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.preinspaction.mapper.PreinspactionMapper;
import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.user.UserController;
import com.wit.inspaction.user.mapper.UserMapper;
import com.wit.inspaction.user.model.UserDTO;

/**
 * 사전점검 서비스 상세
 */
@Service
public class UserServiceImpl implements UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 사전점검 리스트 조회
	 */
	@Override
	public List<UserDTO> getCategoryList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getCategoryList 호출");
		
		List<UserDTO> list = userMapper.selectCategoryList(paramMap);
		
		return list;
	}

	@Override
	public List<UserDTO> getCompanyList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getCompanyList 호출");

		List<UserDTO> list = userMapper.selectCompanyList(paramMap);
		
		return list;
	}
	
	@Override
	public List<String> selectCompanyIdList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl selectCompanyIdList 호출");
		
		List<String> list = userMapper.selectCompanyIdList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getNoticeList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getNoticeList 호출");
		
		List<UserDTO> list = userMapper.selectNoticeList(paramMap);
		
		return list;
	}
	@Override
	public List<UserDTO> getGonguList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl selectGonguList 호출");
		
		List<UserDTO> list = userMapper.selectGonguList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getAptPyoungList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getAptPyoungList 호출");
		
		List<UserDTO> list = userMapper.selectAptPyoungList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getTokenList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getTokenList 호출");
		
		List<UserDTO> list = userMapper.selectTokenList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getReqTokenList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getReqTokenList 호출");
		
		List<UserDTO> list = userMapper.selectReqTokenList(paramMap);
		
		return list;
	}
	
	@Override
	public UserDTO getUserInfo(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getUserInfo 호출");
		
		UserDTO userInfo = userMapper.selectUserInfo(paramMap);
		
		return userInfo;
	}
	
	@Override
	public List<Map<String, String>> getAptList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getAptList 호출");
		
		List<Map<String, String>> aptList = userMapper.selectAptList(paramMap);
		
		return aptList;
	}
	
	@Override
	public List<Map<String, String>> getMyAptList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getMyAptList 호출");
		
		List<Map<String, String>> aptList = userMapper.selectMyAptList(paramMap);
		
		return aptList;
	}
	
	
	@Override
	public List<UserDTO> getRequesDetailtList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getRequesDetailtList 호출");
		
		List<UserDTO> list = userMapper.selectRequestDetailList(paramMap);
		
		return list;
	}
	
	@Override
	public List<UserDTO> getRequestAsisList(HashMap<String, Object> paramMap) {
		
		logger.info("UserServiceImpl getRequestAsisList 호출");
		
		List<UserDTO> list = userMapper.selectRequesAsistList(paramMap);
		
		return list;
	}

	@Override
	public int saveRequestInfo(HashMap<String, Object> paramMap) {

	    int insertCount = 0;
	    int loopCount = 0;  // 루프 카운터 변수
	    
	    String reqNo = userMapper.generateReqNo(paramMap);  // 생성된 req_no 값을 얻기 위한 함수 호출
	    
	    /*공구*/
        String reqGubun =(String)paramMap.get("reqGubun");
        List<String> companyIds = new ArrayList<>();
        HashMap<String, Object> insertMap = new HashMap<>();
        
        if("G".equals(reqGubun)) {
        	 /**
        	  *공구 회사 조회 
        	  */
        	logger.info("=========공구카운트 한다===========");
        	 companyIds = userMapper.selectGongGuCompanyIdList(paramMap);
        	 
       	    HashMap<String, Object> gonguMap = new HashMap<>();
        	gonguMap.put("categoryId", paramMap.get("categoryId"));
        	gonguMap.put("aptNo", paramMap.get("aptNo"));
        	
            int remainingCount  = userMapper.selectCountGonguReqCount(paramMap);
            
            logger.info("=========건수가 몇인디?? remainingCount==="+remainingCount+"========");
            if (remainingCount <= 0) {
            	/*❌ 최대 수량에 도달하여 신청할 수 없습니다.*/
                return 999;
            }
            // 🔹 2. 수량 증가
            insertCount += userMapper.updateReqCount(gonguMap);
            
            
            insertMap.put("companyId", companyIds.get(0));
            logger.info("=========공구하나?==="+insertMap.get("companyId")+"========");
            insertMap.put("estimateAmount", paramMap.get("saleAmt"));
            insertMap.put("estimateContents", "공구바로견적");
            insertMap.put("reqState", "20");
            
        }else {
        	 companyIds = userMapper.selectCompanyIdList(paramMap);
    	     insertMap.put("reqState", "10");
        }

    	
    	 insertMap.put("categoryId", paramMap.get("categoryId"));
    	 insertMap.put("reqNo", reqNo);
		 insertMap.put("reqGubun", paramMap.get("reqGubun"));
		 insertMap.put("reqContents", paramMap.get("reqContents"));
		 insertMap.put("aptNo",    paramMap.get("aptNo"));
		 insertMap.put("reqUser",  paramMap.get("reqUser"));
		 insertMap.put("expectedDate", paramMap.get("expectedDate"));
		 
         insertCount += userMapper.insertTotalRequestInfo(insertMap);
         
      
	         
         for (String companyId : companyIds) {
	    	logger.info("===================================");
	    	logger.info("reqNo===insertTotalRequestInfo "+insertMap.get("reqNo"));
	    	logger.info("reqNo===expectedDate "+insertMap.get("expectedDate"));
	    	logger.info("seq===companyId==== "+companyId);
	    	logger.info("===================================");
	    	logger.info("===================================");
	    	logger.info("===================================");
	    	
	    	insertMap.put("seq",  loopCount++);
	    	insertMap.put("companyId", companyId);

	        insertCount += userMapper.insertHistoryRequest(insertMap);
	    }
	    // 총 삽입된 건수 반환
	    return insertCount;
	}
	@Override
	public int userCheckCount(HashMap<String, Object> paramMap) {
		
		 int userCount = userMapper.userCheckCount(paramMap);
		
		return userCount;
	}
	@Override
	public int userCheckKakaoCount(HashMap<String, Object> paramMap) {
		
		int userCount = userMapper.userCheckKakaoCount(paramMap);
		
		return userCount;
	}
	
	@Override
	public int insertUserInfo(HashMap<String, Object> paramMap) {
		
		
		 int userCount = userMapper.insertUserInfo(paramMap);
		
		// 총 삽입된 건수 반환
		return userCount;
	}
	
	@Override
	public int updateRequestState(HashMap<String, Object> paramMap) {
		logger.info("===updateRequestState=======");
		logger.info("reqNo==="+paramMap.get("reqNo"));
		logger.info("seq==="+paramMap.get("seq"));
		logger.info("endReason-===="+paramMap.get("endReason"));
		
		return userMapper.updateRequestState(paramMap);
	}
	@Override
	public int updateDetailRequestState(HashMap<String, Object> paramMap) {
		
		
		logger.info("===updateDetailRequestState=======");
		logger.info("reqNo==="+paramMap.get("reqNo"));
		logger.info("seq==="+paramMap.get("seq"));
		logger.info("reqState-===="+paramMap.get("reqState"));
		
		return userMapper.updateDetailRequestState(paramMap);
	}
	
	@Override
	public int updateUserInfo(HashMap<String, Object> paramMap) {
		
		return userMapper.updateUserInfo(paramMap);
	}
	
	@Override
	public int updateTokenOnServer(HashMap<String, Object> paramMap) {
		
		return userMapper.updateTokenOnServer(paramMap);
	}
	
	@Override
	public int saveTotalRequestInfo(HashMap<String, Object> paramMap) {
		
		List<String> categoryIds = (List<String>) paramMap.get("categoryIds");
		
		int insertCount = 0;
	
		String reqNo = userMapper.generateReqNo(paramMap);  // 생성된 req_no 값을 얻기 위한 함수 호출
		
		int loopCount = 0;  // 루프 카운터 변수
		for (String categoryId : categoryIds) {
			logger.info("reqNo==="+reqNo);
			logger.info("seq==="+loopCount++);
			logger.info("categoryId==="+categoryId);
			logger.info("aptNo1212121212==="+paramMap.get("aptNo"));
			
			paramMap.put("categoryId", categoryId);
			
			List<UserDTO> companyList = userMapper.selectCompanyList(paramMap);
			
			 HashMap<String, Object> insertMap = new HashMap<>();
			 insertMap.put("reqNo", reqNo);
			 insertMap.put("categoryId", categoryId);
			 insertMap.put("reqGubun", paramMap.get("reqGubun"));
			 insertMap.put("reqUser", paramMap.get("reqUser"));
			 insertMap.put("reqState",     paramMap.get("reqState"));
			 insertMap.put("reqContents",   paramMap.get("reqContents"));
			 insertMap.put("aptNo",         paramMap.get("aptNo"));
			 insertMap.put("expectedDate",  paramMap.get("expectedDate"));
			 insertMap.put("type",  paramMap.get("type"));
			
			 insertCount += userMapper.insertTotalRequestInfo(insertMap);
				
			 for (UserDTO company : companyList) {
				 insertMap.put("companyId", company.getCompanyId());
				 insertMap.put("seq",  loopCount++);
			     insertMap.put("reqNo",  insertMap.get("reqNo"));
		         insertCount += userMapper.insertHistoryRequest(insertMap);
			     
			    }
		}
		// 총 삽입된 건수 반환
		return insertCount;
	}
	

}
