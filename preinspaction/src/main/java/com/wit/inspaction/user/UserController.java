package com.wit.inspaction.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.preinspaction.PreinspactionController;
import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;
import com.wit.inspaction.user.model.UserDTO;
import com.wit.inspaction.user.service.UserService;


@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	private UserService userService;
	
	/**
	 * 서비스 카테고리 
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getCategoryList")
    public List<UserDTO> getCategoryList() {
    	
		logger.info("CompanyServiceImpl 호출");
		
		List<UserDTO> categoryList = userService.getCategoryList();
    	
		logger.info("카테고리 리스트 ::: " + categoryList.size());
		
        return categoryList;
    }
	
	
	
	 @RequestMapping("/wit/test")
	 public class TestController {

	     public String showTestPage() {
	    	 logger.info("온다온다." );
	         return "test"; // "test.jsp"를 렌더링
	     }
	 }
	
	/**
	 * 회사 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getCompanyList")
	public List<UserDTO> getCompanyList(@RequestBody HashMap<String, Object> param) {
		logger.info("getCompanyList 호출");
		
		// 파라미터
		String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
		
		logger.info("categoryId :: " + categoryId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("categoryId", categoryId);
		
		List<UserDTO> companyList = userService.getCompanyList(paramMap);
    	
		logger.info("회사 상세 리스트 ::: " + companyList.size());
		
        return companyList;
    }
	
	/**
	 * 아파트 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getAptList")
	public UserDTO getAptList(@RequestBody HashMap<String, Object> param) {
		logger.info("getAptList 호출");
		
		HashMap<String, Object> apmMap = new HashMap<String, Object>();
		apmMap.put("gubun", "N");
		
		List<Map<String, String>> aptList = userService.getAptList(apmMap);
		
		UserDTO userInfo = new UserDTO();

		 logger.info("아파트 이름 ::: " + aptList.size());
		 List<String> aptNoList = new ArrayList<>();
         List<String> aptNameList = new ArrayList<>();
       for (Map<String, String> apt : aptList) {
           aptNoList.add(apt.get("aptNo"));
           aptNameList.add(apt.get("aptName"));
           logger.info("아파트 이름 ::: " + apt.get("aptName"));
           
       }
       userInfo.setAptNo(aptNoList);
       userInfo.setAptName(aptNameList);

		
		return userInfo;
	}
	
	/**
	 * 회사 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getNoticeList")
	public List<UserDTO> getNoticeList(@RequestBody HashMap<String, Object> param) {
		logger.info("getNoticeList 호출");
		
		// 파라미터
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
		
		logger.info("reqUser :: " + reqUser);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		
		List<UserDTO> noticeList = userService.getNoticeList(paramMap);
		
		logger.info("회사 상세 리스트 ::: " + noticeList.size());
		
		return noticeList;
	}
	
	
	/**
	 * 사용자 정보조회
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getChckUserInfo")
	public int getChckUserInfo(@RequestBody HashMap<String, Object> param) {
		logger.info("getChckUserInfo 호출");
		
		// 파라미터
		String kakaoId = param.get("kakaoId") == null ? "" : (String) param.get("kakaoId");
		logger.info("kakaoId :: " + kakaoId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("kakaoId", kakaoId);
		
		int cnt = userService.userCheckCount(paramMap);
		
		logger.info("사용자 ::: " + cnt);
		
		return cnt;
	}
	
	
	
	/**
	 * 내정보 조회 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getUserInfo")
	public UserDTO getUserInfo(@RequestBody HashMap<String, Object> param) {
		logger.info("getUserInfo 호출");
		
		// 파라미터
		String kakaoId = param.get("kakaoId") == null ? "" : (String) param.get("kakaoId");
		String nickName = param.get("nickName") == null ? "" : (String) param.get("nickName");
		String profileImageUrl = param.get("profileImageUrl") == null ? "" : (String) param.get("profileImageUrl");
		String email = param.get("email") == null ? "" : (String) param.get("email");
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		String role = param.get("role") == null ? "user" : (String) param.get("role");
		logger.info("kakaoId :: " + kakaoId);
		logger.info("nickName :: " + nickName);
		logger.info("profileImageUrl :: " + profileImageUrl);
		logger.info("email :: " + email);
		logger.info("clerkNo :: " + clerkNo);
		logger.info("role :: " + role);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("kakaoId", kakaoId);
		paramMap.put("nickName", nickName);
		paramMap.put("profileImageUrl", profileImageUrl);
		paramMap.put("email", email);
		paramMap.put("clerkNo", clerkNo);
		paramMap.put("role", role);
		
		int cnt = userService.userCheckCount(paramMap);
		
		if(cnt == 0 ) {
			//계정생성
			
	      int userCnt = userService.insertUserInfo(paramMap);
		}
		  
		UserDTO userInfo = userService.getUserInfo(paramMap);
		
		HashMap<String, Object> apmMap = new HashMap<String, Object>();
		logger.info("clerkNo :: " + userInfo.getClerkNo());
		apmMap.put("clerkNo", userInfo.getClerkNo());
		apmMap.put("gubun", "A");
		List<Map<String, String>> aptList = userService.getAptList(apmMap);
		 logger.info("아파트 이름 ::: " + aptList.size());
		List<String> aptNoList = new ArrayList<>();
        List<String> aptNameList = new ArrayList<>();
        for (Map<String, String> apt : aptList) {
            aptNoList.add(apt.get("aptNo"));
            aptNameList.add(apt.get("aptName"));
            
            
            logger.info("아파트 이름 ::: " + apt.get("aptName"));
            
        }

        userInfo.setAptNo(aptNoList);
        userInfo.setAptName(aptNameList);
        
		
		logger.info("닉네임 ::: " + userInfo.getNickName());
		
		return userInfo;
	}
	
	/**
	 * 회사 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getRequesDetailtList")
	public List<UserDTO> getRequestList(@RequestBody HashMap<String, Object> param) {
		logger.info("getRequesDetailtList 호출");
		
    	String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
    	String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
		String reqNo = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		
		logger.info("categoryId :: " + categoryId);
		logger.info("reqUser :: " + reqUser);
		logger.info("reqNo :: " + reqNo);
		logger.info("reqUser :: " + reqUser);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		paramMap.put("categoryId", categoryId);
		paramMap.put("reqNo", reqNo);
		
		List<UserDTO> reqList = userService.getRequesDetailtList(paramMap);
		
		logger.info("신청리스트 ::: " + reqList.size());
		
		return reqList;
	}
	
	
	/**
	 * 견적목록 조회 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getRequestAsisList")
	public List<UserDTO> getRequestAsisList(@RequestBody HashMap<String, Object> param) {
		logger.info("getRequestAsisList 호출");
		
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
	
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		
		List<UserDTO> reqList = userService.getRequestAsisList(paramMap);
		
		logger.info("신청리스트 ::: " + reqList.size());
		
		return reqList;
	}
	
	/**
	 * 견적요청(단건)
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/saveRequestInfo")
	public int saveRequestInfo(@RequestBody HashMap<String, Object> param) {
		logger.info("saveRequestInfo 호출");
		
		// 파라미터 추출
	    String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
	    String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
	    String reqGubun = param.get("reqGubun") == null ? "" : (String) param.get("reqGubun");
	    String aptNo = param.get("aptNo") == null ? "1" : (String) param.get("aptNo").toString();
	    String reqContents = param.get("reqContents") == null ? "" : (String) param.get("reqContents");
	    
	    String reqState = "01";
	    logger.info("aptNo:: " + aptNo);
	    logger.info("categoryId 11111:: " + categoryId);
	    logger.info("reqGubun :: " + reqGubun);
	    logger.info("reqUser :: " + reqUser);
	    logger.info("reqContents :: " + reqContents);

	    // companyIds 배열 추출
	    List<String> companyIds = param.get("companyIds") != null ? (List<String>) param.get("companyIds") : new ArrayList<>();
	    logger.info("선택된 companyIds :: " + companyIds);
		
	    HashMap<String, Object> paramMap = new HashMap<>();
	    paramMap.put("categoryId", categoryId);
	    paramMap.put("companyIds", companyIds);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqGubun", reqGubun);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
	    paramMap.put("aptNo", aptNo);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
		
	    int result = userService.saveRequestInfo(paramMap);
		
        return result;
    }
	
	
	/**
	 * 견적요청(통합)
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/saveTotalRequestInfo")
	public int saveTotalRequestInfo(@RequestBody HashMap<String, Object> param) {
		logger.info("saveTotalRequestInfo 호출");
		
		// 파라미터 추출
	    String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
	    String reqGubun = param.get("reqGubun") == null ? "" : (String) param.get("reqGubun");
	    String aptNo = param.get("aptNo") != null ? param.get("aptNo").toString() : "";
	    String reqContents = param.get("reqContents") == null ? "" : (String) param.get("reqContents");
	    String reqState = "01";
	    logger.info("reqGubun :: " + reqGubun);
	    logger.info("reqUser :: " + reqUser);
	    logger.info("aptNo11111 :: " + aptNo);
	    logger.info("reqContents :: " + reqContents);

	    // companyIds 배열 추출
	    List<String> categoryIds = param.get("categoryIds") != null ? (List<String>) param.get("categoryIds") : new ArrayList<>();
	    logger.info("선택된 categoryIds :: " + categoryIds);
		
	    HashMap<String, Object> paramMap = new HashMap<>();
	    paramMap.put("categoryIds", categoryIds);
	    paramMap.put("reqGubun", reqGubun);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
	    paramMap.put("aptNo", aptNo);  // 선택된 회사 ID 배열 추가
		
	    int result = userService.saveTotalRequestInfo(paramMap);
		
        return result;
    }
	
	/**
	 * 작업요청
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/updateRequestState")
	public int updateRequestState(@RequestBody HashMap<String, Object> param) {
		logger.info("requestStateUpdate 호출");
		
		// 파라미터 추출
		String reqNo = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String seq = param.get("seq") == null ? "" : (String) param.get("seq");
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
		String reqState = param.get("reqState") == null ? "" : (String) param.get("reqState");
		logger.info("reqNo :: " + reqNo);
		logger.info("seq :: " + seq);
		logger.info("reqState :: " + reqState);
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("reqNo", reqNo);
		paramMap.put("seq", seq);  // 선택된 회사 ID 배열 추가
		paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
		paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
		
		int result = userService.updateRequestState(paramMap);
		logger.info("resultresultresult :: " + result);
		return result;
	}
	
	
	/**
	 * 작업요청
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/updateDetailRequestState")
	public int updateDetailRequestState(@RequestBody HashMap<String, Object> param) {
		logger.info("requestStateUpdate 호출");
		
		// 파라미터 추출
		String reqNo = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String seq = param.get("seq") == null ? "" : (String) param.get("seq");
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
		String reqState = param.get("reqState") == null ? "" : (String) param.get("reqState");
		String estimateAmount = param.get("estimateAmount") == null ? "" : (String) param.get("estimateAmount");
		String estimateContents = param.get("estimateContents") == null ? "" : (String) param.get("estimateContents");
		logger.info("reqNo :: " + reqNo);
		logger.info("seq :: " + seq);
		logger.info("reqState :: " + reqState);
		logger.info("estimateAmount :: " + estimateAmount);
		logger.info("estimateContents :: " + estimateContents);
		logger.info("PreinspactionServiceImpl 호출");
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("reqNo", reqNo);
		paramMap.put("seq", seq);  // 선택된 회사 ID 배열 추가
		paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
		paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
		paramMap.put("estimateAmount", estimateAmount);  // 선택된 회사 ID 배열 추가
		paramMap.put("estimateContents", estimateContents);  // 선택된 회사 ID 배열 추가
		
		int result = userService.updateRequestState(paramMap);
		 result += userService.updateDetailRequestState(paramMap);
		logger.info("resultresultresult :: " + result);
		return result;
	}
	
	
	/**
	 * 로그인시 계정생성 및 계정정보 가져오기 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/updateMyInfo")
	public int updateMyInfo(@RequestBody HashMap<String, Object> param) {
		logger.info("updateMyInfo 호출");
		
		// 파라미터 추출
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		String nickName = param.get("nickName") == null ? "" : (String) param.get("nickName");
		String mainAptNo = param.get("mainAptNo") == null ? "" : (String) param.get("mainAptNo");
		logger.info("clerkNo" + clerkNo);
		logger.info("nickName" + nickName);
		logger.info("mainAptNo" + mainAptNo);
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("clerkNo", clerkNo);
		paramMap.put("nickName", nickName);
		paramMap.put("mainAptNo", mainAptNo);
		
		int result = userService.updateUserInfo(paramMap);
		
		logger.info("updateMyInfo :: " + result);
		return result;
	}
	
	
}