package com.wit.inspaction.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;
import com.wit.inspaction.user.model.UserDTO;
import com.wit.inspaction.user.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 서비스 카테고리 
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getCategoryList")
    public List<UserDTO> getCategoryList() {
    	
		System.out.println("CompanyServiceImpl 호출");
		
		List<UserDTO> categoryList = userService.getCategoryList();
    	
		System.out.println("카테고리 리스트 ::: " + categoryList.size());
		
        return categoryList;
    }
	
	
	
	 @RequestMapping("/wit/test")
	 public class TestController {

	     public String showTestPage() {
	    	 System.out.println("온다온다." );
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
		System.out.println("getCompanyList 호출");
		
		// 파라미터
		String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
		
		System.out.println("categoryId :: " + categoryId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("categoryId", categoryId);
		
		List<UserDTO> companyList = userService.getCompanyList(paramMap);
    	
		System.out.println("회사 상세 리스트 ::: " + companyList.size());
		
        return companyList;
    }
	
	/**
	 * 회사 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getNoticeList")
	public List<UserDTO> getNoticeList(@RequestBody HashMap<String, Object> param) {
		System.out.println("getNoticeList 호출");
		
		// 파라미터
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
		
		System.out.println("reqUser :: " + reqUser);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		
		List<UserDTO> noticeList = userService.getNoticeList(paramMap);
		
		System.out.println("회사 상세 리스트 ::: " + noticeList.size());
		
		return noticeList;
	}
	
	
	/**
	 * 내정보 조회 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getUserInfo")
	public UserDTO getUserInfo(@RequestBody HashMap<String, Object> param) {
		System.out.println("getUserInfo 호출");
		
		// 파라미터
		String kakaoId = param.get("kakaoId") == null ? "" : (String) param.get("kakaoId");
		
		System.out.println("kakaoId :: " + kakaoId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("kakaoId", kakaoId);
		
		UserDTO userInfo = userService.getUserInfo(paramMap);
		
		HashMap<String, Object> apmMap = new HashMap<String, Object>();
		System.out.println("clerkNo :: " + userInfo.getClerkNo());
		apmMap.put("clerkNo", userInfo.getClerkNo());
		
		List<Map<String, String>> aptList = userService.getAptList(apmMap);
		 System.out.println("아파트 이름 ::: " + aptList.size());
		List<String> aptNoList = new ArrayList<>();
        List<String> aptNameList = new ArrayList<>();
        for (Map<String, String> apt : aptList) {
            aptNoList.add(apt.get("aptNo"));
            aptNameList.add(apt.get("aptName"));
            
            
            System.out.println("아파트 이름 ::: " + apt.get("aptName"));
            
        }

        userInfo.setAptNo(aptNoList);
        userInfo.setAptName(aptNameList);
        
		
		System.out.println("닉네임 ::: " + userInfo.getNickName());
		
		return userInfo;
	}
	
	/**
	 * 회사 목록
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getRequesDetailtList")
	public List<UserDTO> getRequestList(@RequestBody HashMap<String, Object> param) {
		System.out.println("getRequesDetailtList 호출");
		
    	String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
    	String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
		String reqNo = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		
		System.out.println("categoryId :: " + categoryId);
		System.out.println("reqUser :: " + reqUser);
		System.out.println("reqNo :: " + reqNo);
		System.out.println("reqUser :: " + reqUser);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		paramMap.put("categoryId", categoryId);
		paramMap.put("reqNo", reqNo);
		
		List<UserDTO> reqList = userService.getRequesDetailtList(paramMap);
		
		System.out.println("신청리스트 ::: " + reqList.size());
		
		return reqList;
	}
	
	
	/**
	 * 견적목록 조회 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/getRequestAsisList")
	public List<UserDTO> getRequestAsisList(@RequestBody HashMap<String, Object> param) {
		System.out.println("getRequestAsisList 호출");
		
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
	
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("reqUser", reqUser);
		
		List<UserDTO> reqList = userService.getRequestAsisList(paramMap);
		
		System.out.println("신청리스트 ::: " + reqList.size());
		
		return reqList;
	}
	
	/**
	 * 견적요청(단건)
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/saveRequestInfo")
	public int saveRequestInfo(@RequestBody HashMap<String, Object> param) {
		System.out.println("saveRequestInfo 호출");
		
		// 파라미터 추출
	    String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
	    String categoryId = param.get("categoryId") == null ? "" : (String) param.get("categoryId");
	    String reqGubun = param.get("reqGubun") == null ? "" : (String) param.get("reqGubun");
	    
	    String aptNo = param.get("aptNo") == null ? "" : (String) param.get("aptNo");
	    
	    String reqState = "01";
	    String reqContents = "요청드립니다.";
	    System.out.println("aptNo:: " + aptNo);
	    System.out.println("categoryId 11111:: " + categoryId);
	    System.out.println("reqGubun :: " + reqGubun);
	    System.out.println("reqUser :: " + reqUser);

	    // companyIds 배열 추출
	    List<String> companyIds = param.get("companyIds") != null ? (List<String>) param.get("companyIds") : new ArrayList<>();
	    System.out.println("선택된 companyIds :: " + companyIds);
		
	    HashMap<String, Object> paramMap = new HashMap<>();
	    paramMap.put("categoryId", categoryId);
	    paramMap.put("companyIds", companyIds);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqGubun", reqGubun);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
	    paramMap.put("aptNo", aptNo);  // 선택된 회사 ID 배열 추가
		
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
		System.out.println("saveTotalRequestInfo 호출");
		
		// 파라미터 추출
	    String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
	    String reqGubun = param.get("reqGubun") == null ? "" : (String) param.get("reqGubun");
	    String reqState = "01";
	    String reqContents = "요청드립니다.";
	    System.out.println("reqGubun :: " + reqGubun);
	    System.out.println("reqUser :: " + reqUser);

	    // companyIds 배열 추출
	    List<String> categoryIds = param.get("categoryIds") != null ? (List<String>) param.get("categoryIds") : new ArrayList<>();
	    System.out.println("선택된 categoryIds :: " + categoryIds);
		
	    HashMap<String, Object> paramMap = new HashMap<>();
	    paramMap.put("categoryIds", categoryIds);
	    paramMap.put("reqGubun", reqGubun);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
	    paramMap.put("reqContents", reqContents);  // 선택된 회사 ID 배열 추가
		
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
		System.out.println("requestStateUpdate 호출");
		
		// 파라미터 추출
		String reqNo = param.get("reqNo") == null ? "" : (String) param.get("reqNo");
		String seq = param.get("seq") == null ? "" : (String) param.get("seq");
		String reqUser = param.get("reqUser") == null ? "" : (String) param.get("reqUser");
		String reqState = param.get("reqState") == null ? "" : (String) param.get("reqState");
		System.out.println("reqNo :: " + reqNo);
		System.out.println("seq :: " + seq);
		System.out.println("reqState :: " + reqState);
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("reqNo", reqNo);
		paramMap.put("seq", seq);  // 선택된 회사 ID 배열 추가
		paramMap.put("reqUser", reqUser);  // 선택된 회사 ID 배열 추가
		paramMap.put("reqState", reqState);  // 선택된 회사 ID 배열 추가
		
		int result = userService.updateRequestState(paramMap);
		System.out.println("resultresultresult :: " + result);
		return result;
	}
	
	
	/**
	 * 로그인시 계정생성 및 계정정보 가져오기 
	 * @param param
	 * @return List<UserDTO>
	 */
	@RequestMapping("/wit/updateMyInfo")
	public int updateMyInfo(@RequestBody HashMap<String, Object> param) {
		System.out.println("updateMyInfo 호출");
		
		// 파라미터 추출
		String clerkNo = param.get("clerkNo") == null ? "" : (String) param.get("clerkNo");
		String nickName = param.get("nickName") == null ? "" : (String) param.get("nickName");
		String mainAptNo = param.get("mainAptNo") == null ? "" : (String) param.get("mainAptNo");
		System.out.println("clerkNo" + clerkNo);
		System.out.println("nickName" + nickName);
		System.out.println("mainAptNo" + mainAptNo);
		
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("clerkNo", clerkNo);
		paramMap.put("nickName", nickName);
		paramMap.put("mainAptNo", mainAptNo);
		
		int result = userService.updateUserInfo(paramMap);
		
		System.out.println("updateMyInfo :: " + result);
		return result;
	}
	
	
}