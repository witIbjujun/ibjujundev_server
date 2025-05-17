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

import com.wit.inspaction.common.FcmService;
import com.wit.inspaction.preinspaction.PreinspactionController;
import com.wit.inspaction.user.model.UserDTO;
import com.wit.inspaction.user.service.UserService;


@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private FcmService fcmService;
	
	/**
	 * 서비스 카테고리 
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getCategoryList")
    public List<UserDTO> getCategoryList(@RequestBody HashMap<String, Object> param) {
    	
		logger.info("CompanyServiceImpl 호출");
		
		String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
		String type = param.get("type") == null || "".equals(param.get("type")) 
                ? "A" 
                : (String) param.get("type");
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("categoryId", categoryId);
		paramMap.put("type", type);
		logger.info("카테고리 type ::: " + type);
		
		List<UserDTO> categoryList = userService.getCategoryList(paramMap);
    	
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
	 * 회사 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getCategoryInfo")
	public List<UserDTO> getCategoryInfo(@RequestBody HashMap<String, Object> param) {
		logger.info("getCategoryInfo 호출");
		
		// 파라미터
		String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
		
		logger.info("categoryId :: " + categoryId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("categoryId", categoryId);
		
		List<UserDTO> companyList = userService.getCategoryList(paramMap);
    	
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
	 * 아파트_평형 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getAptPyoungList")
	public  List<UserDTO> getAptPyoungList(@RequestBody HashMap<String, Object> param) {
		logger.info("getAptPyoungList 호출");
		
		String aptNo = param.get("aptNo") == null ? "" : (String) param.get("aptNo");
		
		HashMap<String, Object> apmMap = new HashMap<String, Object>();
		apmMap.put("aptNo", aptNo);
		  logger.info("아파트 aptNo ::: " + aptNo);
		List<UserDTO> pyoungList = userService.getAptPyoungList(apmMap);
		
		return pyoungList;
	}
	
	/**
	 * 공구목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getGonguList")
	public List<UserDTO> getGonguList(@RequestBody HashMap<String, Object> param) {
		logger.info("getGonguList 호출");
		
		// 파라미터
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
		
		logger.info("reqUser :: " + reqUser);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		
		List<UserDTO> noticeList = userService.getGonguList(paramMap);
		
		logger.info("공구목록 ::: " + noticeList.size());
		
		return noticeList;
	}
	
	/**
	 * 공동구매 목록
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
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		logger.info("kakaoId :: " + kakaoId);
		logger.info("clerkNo :: " + clerkNo);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("kakaoId", kakaoId);
		paramMap.put("clerkNo", clerkNo);
		
		 int cnt = 0;
		 
	    if (!kakaoId.isEmpty() && clerkNo.isEmpty()) {
	        logger.info("▶️ kakaoId 기반 사용자 확인");
	        cnt = userService.userCheckKakaoCount(paramMap);
	    } else if (kakaoId.isEmpty() && !clerkNo.isEmpty()) {
	        logger.info("▶️ clerkNo 기반 사용자 확인");
	        cnt = userService.userCheckCount(paramMap);
	    } else {
	        logger.info("❗ kakaoId와 clerkNo가 모두 없거나 모두 존재 → 기본값 0 반환");
	    }
		
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
		String aptNo = param.get("aptNo") == null ? "" : (String) param.get("aptNo");
		String pyoung = param.get("pyoung") == null ? "" : (String) param.get("pyoung");
		String token = param.get("token") == null ? "" : (String) param.get("token");
		String loginGubun = param.get("loginGubun") == null ? "" : (String) param.get("loginGubun");
		
		logger.info("kakaoId :: " + kakaoId);
		logger.info("nickName :: " + nickName);
		logger.info("profileImageUrl :: " + profileImageUrl);
		logger.info("email :: " + email);
		logger.info("clerkNo :: " + clerkNo);
		logger.info("role :: " + role);
		logger.info("aptNo :: " + aptNo);
		logger.info("pyoung :: " + pyoung);
		logger.info("token :: " + token);
		logger.info("loginGubun :: " + loginGubun);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("kakaoId", kakaoId);
		paramMap.put("nickName", nickName);
		paramMap.put("profileImageUrl", profileImageUrl);
		paramMap.put("email", email);
		paramMap.put("clerkNo", clerkNo);
		logger.info("paramMap에 저장된 clerkNo :: " + paramMap.get("clerkNo"));
		paramMap.put("role", role);
		paramMap.put("aptNo", aptNo);
		paramMap.put("pyoung", pyoung);
		paramMap.put("token", token);
		UserDTO userInfo = null;
		int cnt  = 0;
		
		if("S".equals(loginGubun)) {
			cnt = userService.userCheckKakaoCount(paramMap);
			
		}else {
			cnt = userService.userCheckCount(paramMap);
			
		}
		 logger.info("요기 들어갔나?? "+cnt);
		
   	if(cnt > 0 ) {
			logger.info("222222222222222222 들어갔나?? "+cnt);
			logger.info("clerkNo=== :: " + (String)paramMap.get("clerkNo"));
			
			HashMap<String, Object> searchMap = new HashMap<String, Object>();
			
			if (paramMap.get("clerkNo") != null && !((String)paramMap.get("clerkNo")).isEmpty()) {
				
				logger.info("333333 들어갔나?? "+(String)paramMap.get("clerkNo"));
				searchMap.put("clerkNo", (String)paramMap.get("clerkNo"));
			}else {
				logger.info("444444444444444 들어갔나?? "+clerkNo);
				searchMap.put("clerkNo", clerkNo);
			}
			searchMap.put("kakaoId", kakaoId);
			
			logger.info("들어가기전 clerkNo=== :: " + (String)paramMap.get("clerkNo"));
			logger.info("들어가기전 kakaoId=== :: " + (String)paramMap.get("kakaoId"));
			
			userInfo = userService.getUserInfo(searchMap);
			logger.info("가져왔냐?????clerkNo :: " + userInfo.getClerkNo());
			
			int tokenUpcnt = userService.updateTokenOnServer(paramMap);
//			int updateUser = userService.updateUserInfo(paramMap);
//			logger.info("updateUser :: " + updateUser);
			
			HashMap<String, Object> apmMap = new HashMap<String, Object>();
			logger.info("clerkNo :: " + userInfo.getClerkNo());
			apmMap.put("clerkNo", userInfo.getClerkNo());
			apmMap.put("gubun", "A");
			List<Map<String, String>> aptList = userService.getMyAptList(apmMap);
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
		}
		  
		
		return userInfo;
	}
	/**
	 * 내정보 조회 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getCreateUser")
	public UserDTO getCreateUser(@RequestBody HashMap<String, Object> param) {
		logger.info("getCreateUser 호출");
		
		// 파라미터
		String kakaoId = param.get("kakaoId") == null ? "" : (String) param.get("kakaoId");
		String nickName = param.get("nickName") == null ? "" : (String) param.get("nickName");
		String profileImageUrl = param.get("profileImageUrl") == null ? "" : (String) param.get("profileImageUrl");
		String email = param.get("email") == null ? "" : (String) param.get("email");
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		String role = param.get("role") == null ? "user" : (String) param.get("role");
		String aptNo = param.get("aptNo") == null ? "" : (String) param.get("aptNo");
		String pyoung = param.get("pyoung") == null ? "" : (String) param.get("pyoung");
		String token = param.get("token") == null ? "" : (String) param.get("token");
		String loginSnsType = param.get("loginSnsType") == null ? "" : (String) param.get("loginSnsType");
		String agreeGbn = param.get("agreeGbn") == null ? "" : (String) param.get("agreeGbn");
		
		logger.info("kakaoId :: " + kakaoId);
		logger.info("nickName :: " + nickName);
		logger.info("profileImageUrl :: " + profileImageUrl);
		logger.info("email :: " + email);
		logger.info("clerkNo :: " + clerkNo);
		logger.info("role :: " + role);
		logger.info("aptNo :: " + aptNo);
		logger.info("pyoung :: " + pyoung);
		logger.info("token :: " + token);
		logger.info("loginSnsType :: " + loginSnsType);
		logger.info("agreeGbn :: " + agreeGbn);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("kakaoId", kakaoId);
		paramMap.put("nickName", nickName);
		paramMap.put("profileImageUrl", profileImageUrl);
		paramMap.put("email", email);
		paramMap.put("clerkNo", clerkNo);
		paramMap.put("role", role);
		paramMap.put("aptNo", aptNo);
		paramMap.put("pyoung", pyoung);
		paramMap.put("token", token);
		paramMap.put("loginSnsType", loginSnsType);
		paramMap.put("agreeGbn", agreeGbn);
		
			//계정생성
		int prsnInCnt = userService.insertUserInfo(paramMap);
		logger.info("prsnInCnt :: " + prsnInCnt);
			
		String clerkNewNo = (String) paramMap.get("clerkNo");
			
		logger.info("clerkNewNo :: " + clerkNewNo);
		  paramMap.put("clerkNo", clerkNewNo);
		  UserDTO userInfo = userService.getUserInfo(paramMap);
		logger.info("가져왔냐?????clerkNo :: " + userInfo.getClerkNo());
		
		
		HashMap<String, Object> apmMap = new HashMap<String, Object>();
		logger.info("clerkNo :: " + userInfo.getClerkNo());
		apmMap.put("clerkNo", userInfo.getClerkNo());
		apmMap.put("gubun", "A");
		List<Map<String, String>> aptList = userService.getMyAptList(apmMap);
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
		 for (UserDTO user : reqList) {
		        logger.info("imageFilePath :: " + user.getImageFilePath());
		    }
		
		
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
	    String expectedDate = param.get("expectedDate") == null ? "" : (String) param.get("expectedDate");
	    
	    String reqState = "10";
	    logger.info("aptNo:: " + aptNo);
	    logger.info("categoryId 11111:: " + categoryId);
	    logger.info("reqGubun :: " + reqGubun);
	    logger.info("reqUser :: " + reqUser);
	    logger.info("reqContents :: " + reqContents);
	    logger.info("expectedDate :: " + expectedDate.replace(".", ""));

	    // companyIds 배열 추출
	     
	    
	  		
	    HashMap<String, Object> paramMap = new HashMap<>();
	    paramMap.put("categoryId", categoryId);
	    paramMap.put("reqGubun", reqGubun);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
	    paramMap.put("aptNo", aptNo);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
	    paramMap.put("expectedDate", expectedDate.replace(".", ""));  // 선택된 회사 ID 배열 추가
	    paramMap.put("gubun", "S");  // 선택된 회사 ID 배열 추가
	    paramMap.put("title", "입주전");  // 선택된 회사 ID 배열 추가
	    paramMap.put("body", "견적요청이 왔습니다!!!");  // 선택된 회사 ID 배열 추가
		
	    int result = userService.saveRequestInfo(paramMap);
	    
	    List<String> companyIds = userService.selectCompanyIdList(paramMap);
		
	    paramMap.put("companyIds", companyIds);  // 선택된 회사 ID 배열 추가
	    paramMap.put("userIds", companyIds);  // 선택된 회사 ID 배열 추가
	    
	    int token  = fcmService.sendAppMessage(paramMap);
	    
	    logger.info("메세지 갔나??? :: " + token);
	    
	    
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
	    String expectedDate = param.get("expectedDate") == null ? "" : (String) param.get("expectedDate");
	    String type = param.get("type") == null ? "" : (String) param.get("type");
	    
	    
	    String reqState = "10";
	    logger.info("reqGubun :: " + reqGubun);
	    logger.info("reqUser :: " + reqUser);
	    logger.info("aptNo11111 :: " + aptNo);
	    logger.info("reqContents :: " + reqContents);
	    logger.info("expectedDate :: " + expectedDate);
	    logger.info("type :: " + type);

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
	    paramMap.put("type", type);  // 선택된 회사 ID 배열 추가
	    paramMap.put("expectedDate", expectedDate.replace(".", ""));  // 선택된 회사 ID 배열 추가
	    paramMap.put("gubun", "S");  // 선택된 회사 ID 배열 추가
	    paramMap.put("title", "입주전");  // 선택된 회사 ID 배열 추가
	    paramMap.put("body", "견적요청이 왔습니다!!!");  // 선택된 회사 ID 배열 추가
	    
	    int result = userService.saveTotalRequestInfo(paramMap);
//	    int token  = fcmService.sendAppMessage(paramMap);
	    
//	    logger.info("메세지 갔나??? :: " + token);
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