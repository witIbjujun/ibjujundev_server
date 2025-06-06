package com.wit.inspaction.seller.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wit.inspaction.board.model.BoardDTO;
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
import com.wit.inspaction.seller.model.SubscribePaymentDTO;

/**
 * 사전점검 서비스
 */
@Service
public interface SellerService {

	/**
	 * 견적리스트 조회
	 * @return List<EstimateRequestDTO>
	 */
	public List<EstimateRequestDTO> getEstimateRequestList(HashMap<String, Object> paramMap);

	/**
	 * 견적발송 용 데이터 조회
	 * @return SellerSendDTO
	 */
	public SellerSendDTO getEstimateRequestInfoForSend(HashMap<String, Object> paramMap);

	/**
	 * 견적발송 정보 저장
	 * @param param
	 * @return int
	 */
	public int saveEstimateInfo(HashMap<String, Object> paramMap);

	/**
	 * 판매자 프로필 저장
	 * @param param
	 * @return int
	 */
	public int saveSellerProfile(HashMap<String, Object> paramMap);

	/**
	 * 판매자 정보 조회
	 * @return SellerDTO
	 */
	public SellerDTO getSellerInfo(HashMap<String, Object> param);

	/**
	 * 견적발송 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateEstimateInfo(HashMap<String, Object> param);

	/**
	 * 캐시 정보 조회
	 * @param param
	 * @return
	 */
	public CashDTO getCashInfo(HashMap<String, Object> param);

	/**
	 * 캐시 정보 등록
	 * @param param
	 * @return
	 */
	public int insertCashInfo(HashMap<String, Object> param);

	/**
	 * 캐시 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateCashInfo(HashMap<String, Object> param);
	
	/**
	 * 보너스 캐시 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateBonusCashInfo(HashMap<String, Object> param);

	/**
	 * 판매자 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateSellerInfo(HashMap<String, Object> param);

	/**
	 * 캐시 이력 목록
	 * @param param
	 * @return List
	 */
	public List<CashHistoryDTO> getCashHistoryList(HashMap<String, Object> param);

	/**
	 * 캐시 이력 등록
	 * @param param
	 * @return int
	 */
	public int insertCashHistoryInfo(HashMap<String, Object> param);

	/**
	 * 캐시 충전금액 설정 목록 조회
	 * @param param
	 * @return List
	 */
	public List<CashRechargeSetDTO> getCashRechargeList(HashMap<String, Object> param);

	/**
	 * 바로 견적 발송 리스트 조회
	 * @param param
	 * @return List
	 */
	public List<EstimateRequestDTO> getAutoEstimateList(HashMap<String, Object> param);

	/**
	 * 바로견적 설정 목록 조회
	 * @param param
	 * @return List
	 */
	public List<DirectEstimateSetDTO> getDirectEstimateSetList(HashMap<String, Object> param);

	/**
	 * 바로견적 설정 정보 조회
	 * @param param
	 * @return
	 */
	public DirectEstimateSetDTO getDirectEstimateSetInfo(HashMap<String, Object> param);

	/**
	 * 바로견적 설정 정보 등록
	 * @param param
	 * @return int
	 */
	public int insertDirectEstimateSetInfo(HashMap<String, Object> param);

	/**
	 * 바로견적 설정 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateDirectEstimateSetInfo(HashMap<String, Object> param);

	/**
	 * 공통코드 목록 조회
	 * @param param
	 * @return
	 */
	public List<CodeDTO> getCodeList(HashMap<String, Object> param);
	
	/**
	 * 판매자 게시판 정보 수정
	 * @param param
	 * @return
	 */
	public int updateSellerBordInfo(HashMap<String, Object> param);
	
	/**
	 * 사업자 인증 상태 수정
	 * @param param
	 * @return
	 */
	public int updateBizCertification(HashMap<String, Object> param);
	
	/**
	 * 사업자 목록 조회
	 * @param param
	 * @return
	 */
	public List<SellerDTO> getSellerList(HashMap<String, Object> param);
	
	/**
	 * 판매자 이미지 목록 조회
	 * @param param
	 * @return
	 */
	public List<BoardDTO> getSellerDetailImageList(HashMap<String, Object> param);
	
	/**
	 * 포인트 관리 목록
	 * @param param
	 * @return List<CashDTO>
	 */
	public List<CashDTO> getPointInfoList(HashMap<String, Object> param);
	
	/**
	 * 포인트 관리 상세 목록
	 * @param param
	 * @return List<CashHistoryDTO>
	 */
	public List<CashHistoryDTO> getPointInfoDetailList(HashMap<String, Object> param);
	
	/**
	 * 업체별 견적 카운트 조회
	 * @param param
	 * @return List<EstimateCntDTO>
	 */
	public List<EstimateCntDTO> getEstimateCntList(HashMap<String, Object> param);
	
	/**
	 * 업체별 구독 아파트 조회
	 * @param param
	 * @return List<AptDTO>
	 */
	public List<AptDTO> getSubscribeAptList(HashMap<String, Object> param);
	
	/**
	 * 업체별 구독 아파트 등록
	 * @param param
	 * @return int
	 */
	public int insertSubscribeApt(HashMap<String, Object> param);
	
	/**
	 * 업체별 구독 아파트 수정
	 * @param param
	 * @return int
	 */
	public int updateSubscribeApt(HashMap<String, Object> param);
	
	/**
	 * 핸드폰 본인인증 수정
	 * @param param
	 * @return int
	 */
	public int updateHpCertificationYn(HashMap<String, Object> param);
	
	/**
	 * 공동구매 목록 조회
	 * @param param
	 * @return List<GpInfoDTO>
	 */
	public List<GpInfoDTO> getGPList(HashMap<String, Object> param);
	
	/**
	 * 공동구매 상태 값 수정
	 * @param paramMap
	 * @return int
	 */
	public int updateGPstat(HashMap<String, Object> param);
	
	/**
	 * 결제정보 저장
	 * @param param
	 * @return int
	 */
	public int insertSubscribePaymentData(HashMap<String, Object> param);
	
	/**
	 * 공동구매 목록 조회
	 * @return List<SubscribePaymentDTO>
	 */
	public List<SubscribePaymentDTO> getSubscribePaymentDataList(HashMap<String, Object> param);
	
	/**
	 * 협력업체 인증 정보 수정
	 * @param paramMap
	 * @return int
	 */
	public int updatePartnerYn(HashMap<String, Object> param);
	
	/**
	 * 사업자 번호 불량여부 조회
	 * @return String
	 */
	public String getBizCertificationAllowYn(HashMap<String, Object> param);
	
}
