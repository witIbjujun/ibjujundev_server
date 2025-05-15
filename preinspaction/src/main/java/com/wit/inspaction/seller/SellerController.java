package com.wit.inspaction.seller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.board.service.BoardServiceImpl;
import com.wit.inspaction.preinspaction.PreinspactionController;
import com.wit.inspaction.seller.model.AptDTO;
import com.wit.inspaction.seller.model.CashDTO;
import com.wit.inspaction.seller.model.CashHistoryDTO;
import com.wit.inspaction.seller.model.CashRechargeSetDTO;
import com.wit.inspaction.seller.model.CodeDTO;
import com.wit.inspaction.seller.model.DirectEstimateSetDTO;
import com.wit.inspaction.seller.model.EstimateCntDTO;
import com.wit.inspaction.seller.model.EstimateRequestDTO;
import com.wit.inspaction.seller.model.GpInfoDTO;
import com.wit.inspaction.seller.model.SellerDTO;
import com.wit.inspaction.seller.model.SellerSendDTO;
import com.wit.inspaction.seller.service.SellerService;
import com.wit.inspaction.user.service.UserService;

@RestController
public class SellerController {
	
	// logger
	private static final Logger logger = LoggerFactory.getLogger(PreinspactionController.class);

	@Autowired
	private SellerService sellerService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BoardServiceImpl boardServiceImpl;

	/**
	 * 견적리스트 조회
	 * @return List<EstimateRequestDTO>
	 */
	@PostMapping("/wit/getEstimateRequestList")
    public List<EstimateRequestDTO> getEstimateRequestList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getEstimateRequestList 호출");

		System.out.println("param stat :" + param.get("stat"));
		System.out.println("param sllrNo :" + param.get("sllrNo"));

		List<EstimateRequestDTO> estimateRequestList = sellerService.getEstimateRequestList(param);

		System.out.println("견적리스트 조회 ::: " + estimateRequestList.size());

        return estimateRequestList;
    }

	/**
	 * 바로 견적 발송 리스트 조회
	 * @return List<EstimateRequestDTO>
	 */
	@PostMapping("/wit/getAutoEstimateList")
    public List<EstimateRequestDTO> getAutoEstimateList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getAutoEstimateList 호출");

		List<EstimateRequestDTO> autoEstimateList = sellerService.getAutoEstimateList(param);

		System.out.println("바로 견적 발송 리스트 조회 ::: " + autoEstimateList.size());

        return autoEstimateList;
    }

	/**
	 * 견적발송 용 데이터 조회
	 * @return SellerSendDTO
	 */
	@PostMapping("/wit/getEstimateRequestInfoForSend")
    public SellerSendDTO getEstimateRequestInfoForSend(@RequestBody HashMap<String, Object> param) {

		System.out.println("getEstimateRequestInfoForSend 호출");

		SellerSendDTO sellerSendDTO = sellerService.getEstimateRequestInfoForSend(param);

		System.out.println("견적발송 용 데이터 조회 ::: " + sellerSendDTO.getAptName());

        return sellerSendDTO;
    }

	/**
	 * 견적발송 정보 저장
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/saveEstimateInfo")
    public int saveEstimateInfo(@RequestBody HashMap<String, Object> param) {

		System.out.println("saveEstimateInfo 호출");

		String aptName = (String) param.get("aptName");
		String content = (String) param.get("content");
		String itemPrice1 = (String) param.get("itemPrice1");
		String itemPrice2 = (String) param.get("itemPrice2");

		System.out.println(aptName + " ::: " + content + " ::: " + itemPrice1 + " ::: " + itemPrice2);

		int result = sellerService.saveEstimateInfo(param);

        return result;
    }

	/**
	 * 견적발송 정보 수정
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/updateEstimateInfo")
    public int  updateEstimateInfo(@RequestBody HashMap<String, Object> param) throws Exception {

		System.out.println("updateEstimateInfo 호출");

		String reqNo = (String) param.get("estNo");
		String estNo = (String) param.get("estNo");
		String seq = (String) param.get("seq");
		String estimateContents = (String) param.get("estimateContent");
		String estimateAmount = (String) param.get("itemPrice1");
		String reqState = (String) param.get("stat");
		String reqUser = (String) param.get("sllrClerkNo");
		String sllrNo = (String) param.get("sllrNo");
		
		HashMap<String, Object> updateMap = new HashMap<String, Object>();
		updateMap.put("reqState", reqState);
		updateMap.put("estimateAmount", estimateAmount);
		updateMap.put("estimateContents", estimateContents);
		updateMap.put("reqUser", reqUser);
		updateMap.put("reqNo", reqNo);
		updateMap.put("seq", seq);
		
		int result = userService.updateRequestState(updateMap);
		   result += userService.updateDetailRequestState(updateMap);
		
		logger.info(":::::::::::::::::::::::::::::::::::::::");
		logger.info("견적 발송 상태 update 호출 : " + result);
		logger.info("견적 발송 상태 update 호출 reqState : " + reqState);
		logger.info(":::::::::::::::::::::::::::::::::::::::");
		
		// CashDTO cashDTO = sellerService.getCashInfo(param);

		// String cashNo = cashDTO.getCashNo();

		// param.put("cashNo", cashNo);

		// stat 02 : 진행대기일 경우 (견적을 발송) 정의된 cash 만큼 캐시 차감해야함
		if("02".equals(reqState)) {
			// result = sellerService.insertCashHistoryInfo(param);

			// 캐시 정보 수정
			// result = sellerService.updateCashInfo(param);
			
			if (result > 0) {
				
				// 파일 Json
				// String fileJson = (String) param.get("fileInfo") == null ? "" : (String) param.get("fileInfo");
				
				Object fileInfoObj = param.get("fileInfo");
			    String fileJson;

			    if (fileInfoObj instanceof String) {
			        fileJson = (String) fileInfoObj;
			    } else if (fileInfoObj instanceof List) {
			        ObjectMapper objectMapper = new ObjectMapper();
			        fileJson = objectMapper.writeValueAsString(fileInfoObj); // List를 JSON 문자열로 변환
			    } else {
			        fileJson = ""; // 다른 타입일 경우 빈 문자열
			    }

				// JSON 문자열을 List<HashMap<String, Object>>로 변환
				
				if(!fileJson.isEmpty()) {
					ObjectMapper objectMapper = new ObjectMapper();
					List<HashMap<String, Object>> fileList = objectMapper.readValue(fileJson, new TypeReference<List<HashMap<String, Object>>>(){});
					
					// 파일 저장
					for (int i = 0; i < fileList.size(); i++) {
						
						HashMap<String, Object> fileInfo = fileList.get(i);
						fileInfo.put("bizCd", "RQ01");
						fileInfo.put("bizKey", reqNo + "^" + seq);
						fileInfo.put("fileType", "01");
						fileInfo.put("creUser", "테스트");
						
						int fileResult = boardServiceImpl.saveFileInfo(fileInfo);
						
						System.out.println("파일 등록 ::: " + fileResult);
					}
				}
				
			}
		}

        return result;
    }

	/**
	 * 사업자 프로필 저장
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/saveSellerProfile")
    public int saveSellerProfile(@RequestBody HashMap<String, Object> param) {

		System.out.println("saveSellerProfile 호출");

		String storeName = (String) param.get("storeName");

		System.out.println("storeName : " + storeName);

		int sllrNo = sellerService.saveSellerProfile(param);
		
		param.put("sllrNo", sllrNo);
		
		int result = sellerService.updateSellerBordInfo(param);

        return sllrNo;
    }

	/**
	 * 사업자 정보 조회
	 * @param param
	 * @return SellerDTO
	 */
	@PostMapping("/wit/getSellerInfo")
    public SellerDTO getSellerInfo(@RequestBody HashMap<String, Object> param) {

		System.out.println("getSellerInfo 호출");

		SellerDTO sellerDTO = sellerService.getSellerInfo(param);

        return sellerDTO;
    }
	
	/**
	 * 사업자 목록 조회
	 * @return List<EstimateRequestDTO>
	 */
	@PostMapping("/wit/getSellerList")
    public List<SellerDTO> getSellerList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getSellerList 호출");

		List<SellerDTO> sellerList = sellerService.getSellerList(param);

        return sellerList;
    }

	/**
	 * 사업자 정보 수정
	 * @param param
	 * @return int
	 * @throws JsonProcessingException 
	 * @throws JsonMappingException 
	 */
	@PostMapping("/wit/updateSellerInfo")
    public int updateSellerInfo(@RequestBody HashMap<String, Object> param) throws Exception {

		System.out.println("updateSellerInfo 호출");

		int result = sellerService.updateSellerInfo(param);
		
		if (result > 0) {
			
			// 파일 Json
			List<HashMap<String, Object>> fileList = (List<HashMap<String, Object>>) param.get("fileInfo");

				if (fileList != null && !fileList.isEmpty()) {
				
				// 파일 저장
				for (HashMap<String, Object> fileInfo : fileList) {
					fileInfo.put("bizCd", "SR01");
	                fileInfo.put("bizKey", param.get("sllrNo"));
					fileInfo.put("fileType", "01");
					fileInfo.put("creUser", "테스트");
					
					int fileResult = boardServiceImpl.saveFileInfo(fileInfo);
					
					System.out.println("파일 등록 ::: " + fileResult);
				}
			}
			
		}

        return result;
    }

	/**
	 * 캐시 정보 조회
	 * @param param
	 * @return CashDTO
	 */
	@PostMapping("/wit/getCashInfo")
    public CashDTO getCashInfo(@RequestBody HashMap<String, Object> param) {

		System.out.println("getCashInfo 호출");

		CashDTO cashDTO = sellerService.getCashInfo(param);

        return cashDTO;
    }

	/**
	 * 캐시 정보 등록
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/insertCashInfo")
	public int insertCashInfo(HashMap<String, Object> param) {
		System.out.println("insertCashInfo 호출");

		int result = sellerService.insertCashInfo(param);

        return result;
	}

	/**
	 * 캐시 이력 등록
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/insertCashHistoryInfo")
	public int insertCashHistoryInfo(HashMap<String, Object> param) {
		System.out.println("insertCashHistoryInfo 호출");

		int result = sellerService.insertCashHistoryInfo(param);

        return result;
	}

	/**
	 * 캐시 정보 수정
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/updateCashInfo")
    public int updateCashInfo(@RequestBody HashMap<String, Object> param) {
		
		// 01 : 캐쉬 저장, 03 : 포인트 저장
		String cashGbn = (String) param.get("cashGbn") == null ? "01" : (String) param.get("cashGbn") ;
		
		System.out.println("updateCashInfo 호출 ::: " + param);

		// 캐시 이력 등록
		int result = sellerService.insertCashHistoryInfo(param);

		// 포인트 저장
		if ("03".equals(cashGbn)) {
			// 캐시 정보 수정
			result = sellerService.updateBonusCashInfo(param);
		} else {
			// 캐시 정보 수정
			result = sellerService.updateCashInfo(param);
		}
		
        return result;
    }

	/**
	 * 캐시 이력 목록 조회
	 * @return List<CashHistoryDTO>
	 */
	@PostMapping("/wit/getCashHistoryList")
    public List<CashHistoryDTO> getCashHistoryList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getCashHistoryList 호출");

		System.out.println("sllrNo : " + param.get("sllrNo"));

		List<CashHistoryDTO> cashHistoryList = sellerService.getCashHistoryList(param);

		System.out.println("캐시 이력 목록 조회 ::: " + cashHistoryList.size());

        return cashHistoryList;
    }

	/**
	 * 캐시 충전금액 설정 목록 조회
	 * @return List<CashRechargeSetDTO>
	 */
	@PostMapping("/wit/getCashRechargeList")
    public List<CashRechargeSetDTO> getCashRechargeList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getCashRechargeList 호출");

		List<CashRechargeSetDTO> cashRechargeList = sellerService.getCashRechargeList(param);

		System.out.println("캐시 충전금액 설정 목록 조회 ::: " + cashRechargeList.size());

        return cashRechargeList;
    }

	/**
	 * 바로견적 설정 목록 조회
	 * @return List<DirectEstimateDTO>
	 */
	@PostMapping("/wit/getDirectEstimateSetList")
    public List<DirectEstimateSetDTO> getDirectEstimateSetList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getDirectEstimateSetList 호출");

		List<DirectEstimateSetDTO> directEstimateSetList = sellerService.getDirectEstimateSetList(param);

		System.out.println("바로견적 설정 목록 조회 ::: " + directEstimateSetList.size());

        return directEstimateSetList;
    }

	/**
	 * 바로견적 설정 정보 조회
	 * @return DirectEstimateDTO
	 */
	@PostMapping("/wit/getDirectEstimateSetInfo")
    public DirectEstimateSetDTO getDirectEstimateSetInfo(@RequestBody HashMap<String, Object> param) {

		System.out.println("getDirectEstimateSetInfo 호출");

		DirectEstimateSetDTO directEstimateSetInfo = sellerService.getDirectEstimateSetInfo(param);

		System.out.println("바로견적 설정 목록 조회 ::: " + directEstimateSetInfo);

        return directEstimateSetInfo;
    }

	/**
	 * 바로견적 설정 정보 등록
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/insertDirectEstimateSetInfo")
	public int insertDirectEstimateInfo(@RequestBody HashMap<String, Object> param) {
		System.out.println("insertDirectEstimateSetInfo 호출");

		int result = sellerService.insertDirectEstimateSetInfo(param);

        return result;
	}

	/**
	 * 바로견적 설정 정보 수정
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/updateDirectEstimateSetInfo")
    public int updateDirectEstimateInfo(@RequestBody HashMap<String, Object> param) {

		System.out.println("updateDirectEstimateSetInfo 호출");

		// 캐시 정보 수정
		int result = sellerService.updateDirectEstimateSetInfo(param);

        return result;
    }

	/**
	 * 공통코드 목록 조회
	 * @return List<CodeDTO>
	 */
	@PostMapping("/wit/getCodeList")
    public List<CodeDTO> getCodeList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getCodeList 호출");

		List<CodeDTO> codeList = sellerService.getCodeList(param);

		System.out.println("공통코드 목록 조회 ::: " + codeList.size());

        return codeList;
    }
	
	/**
	 * 사업자 인증 상태 수정
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/updateBizCertification")
    public int updateBizCertification(@RequestBody HashMap<String, Object> param) {

		System.out.println("updateBizCertification 호출");

		int result = sellerService.updateBizCertification(param);

        return result;
    }

	/**
	 * 판매자 이미지 목록 조회
	 * @return List<BoardDTO>
	 */
	@PostMapping("/wit/getSellerDetailImageList")
    public List<BoardDTO> getSellerDetailImageList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getSellerDetailImageList 호출");

		List<BoardDTO> sellerDetailImageList = sellerService.getSellerDetailImageList(param);

		System.out.println("판매자 이미지 목록 조회 ::: " + sellerDetailImageList.size());

        return sellerDetailImageList;
    }
	
	/**
	 * 포인트 관리 목록
	 * @return List<CashDTO>
	 */
	@PostMapping("/wit/getPointInfoList")
    public List<CashDTO> getPointInfoList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getPointInfoList 호출");

		List<CashDTO> getPointInfoList = sellerService.getPointInfoList(param);

        return getPointInfoList;
    }
	
	/**
	 * 포인트 관리 상세 목록
	 * @return List<CashHistoryDTO>
	 */
	@PostMapping("/wit/getPointInfoDetailList")
    public List<CashHistoryDTO> getPointInfoDetailList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getPointInfoDetailList 호출");

		List<CashHistoryDTO> getPointInfoDetailList = sellerService.getPointInfoDetailList(param);

        return getPointInfoDetailList;
    }
	
	/**
	 * 포인트 관리 상세 목록
	 * @return List<CashHistoryDTO>
	 */
	@PostMapping("/wit/saveSellerBizImage")
    public int saveSellerBizImage(@RequestBody HashMap<String, Object> param) throws Exception {

			int fileResult = 0;
			
			// 파일 Json
			List<HashMap<String, Object>> fileList = (List<HashMap<String, Object>>) param.get("fileInfo");

			System.out.println("게시판 fileInfo ::: " + param.get("fileInfo"));
			
			if (fileList != null && !fileList.isEmpty()) {
				
				// 파일 저장
				for (HashMap<String, Object> fileInfo : fileList) {
					fileInfo.put("bizCd", "SR02");
	                fileInfo.put("bizKey", param.get("sllrNo"));
					fileInfo.put("fileType", "01");
					fileInfo.put("creUser", "테스트");;
					
					fileResult = boardServiceImpl.saveFileInfo(fileInfo);
					
					System.out.println("파일 등록 ::: " + fileResult);
				}
			}

        return fileResult;
    }
	
	/**
	 * 업체별 견적 카운트 조회
	 * @return List<EstimateCntDTO>
	 */
	@PostMapping("/wit/getEstimateCntList")
    public List<EstimateCntDTO> getEstimateCntList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getPointInfoDetailList 호출");

		List<EstimateCntDTO> getEstimateCntList = sellerService.getEstimateCntList(param);

        return getEstimateCntList;
    }
	
	/**
	 * 업체별 구독 아파트 조회
	 * @return List<AptDTO>
	 */
	@PostMapping("/wit/getSubscribeAptList")
    public List<AptDTO> getSubscribeAptList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getSubscribeAptList 호출");

		List<AptDTO> getSubscribeAptList = sellerService.getSubscribeAptList(param);

        return getSubscribeAptList;
    }
	
	/**
	 * 업체별 구독 아파트 등록
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/insertSubscribeApt")
	public int insertSubscribeApt(@RequestBody HashMap<String, Object> param) {
		System.out.println("insertSubscribeApt 호출");

		int result = sellerService.insertSubscribeApt(param);

        return result;
	}
	
	/**
	 * 업체별 구독 아파트 수정
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/updateSubscribeApt")
	public int updateSubscribeApt(@RequestBody HashMap<String, Object> param) {
		System.out.println("updateSubscribeApt 호출");

		int result = sellerService.updateSubscribeApt(param);

        return result;
	}
	
	/**
	 * 사업자 본인인증 수정
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/updateCertificationYn")
	public int updateCertificationYn(@RequestBody HashMap<String, Object> param) {
		System.out.println("updateCertificationYn 호출");

		int result = sellerService.updateCertificationYn(param);

        return result;
	}
	
	/**
	 * 공동구매 목록 조회
	 * @return List<GpInfoDTO>
	 */
	@PostMapping("/wit/getGPList")
    public List<GpInfoDTO> getGPList(@RequestBody HashMap<String, Object> param) {

		System.out.println("getGPList 호출");

		List<GpInfoDTO> getGPList = sellerService.getGPList(param);

        return getGPList;
    }
}