package com.wit.inspaction.seller.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

@Repository
public class SellerMapper {

	@Autowired
	private SqlSessionTemplate sql;

	private final String path = "com.wit.inspaction.seller.mapper.SellerMapper.";

	/**
	 * 견적리스트 조회
	 * @param param
	 * @return List<EstimateRequestDTO>
	 */
	public List<EstimateRequestDTO> selectEstimateRequestList(HashMap<String, Object> param) {
		return sql.selectList(path + "selectEstimateRequestList", param);
	}

	/**
	 * 견적발송 용 데이터 조회
	 * @param param
	 * @return SellerSendDTO
	 */
	public SellerSendDTO selectEstimateRequestInfoForSend(HashMap<String, Object> param) {
		// TODO Auto-generated method stub
		return sql.selectOne(path + "selectEstimateRequestInfoForSend", param);
	}

	/**
	 * 견적발송 정보 저장
	 * @param param
	 * @return int
	 */
	public int insertEstimateInfo(HashMap<String, Object> param) {
		return sql.update(path + "insertEstimateInfo", param);
	}

	/**
	 * 판매자 프로필 저장
	 * @param param
	 * @return int
	 */
	public int insertSellerProfile(HashMap<String, Object> param) {
		int result = sql.insert(path + "insertSellerProfile", param);
		System.out.println("############# sllrNo : " + param.get("sllr_no"));
		int sllrNo =  Integer.parseInt(param.get("sllr_no").toString());
		return sllrNo;
	}

	/**
	 * 판매자 정보 조회
	 * @param param
	 * @return SellerDTO
	 */
	public SellerDTO selectSellerInfo(HashMap<String, Object> param) {
		// TODO Auto-generated method stub
		System.out.println("############# selectSellerInfo : " + param);
		return sql.selectOne(path + "selectSellerInfo", param);
	}

	/**
	 * 견적발송 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateEstimateInfo(HashMap<String, Object> param) {
		return sql.update(path + "updateEstimateInfo", param);
	}

	/**
	 * 캐시 정보 조회
	 * @param param
	 * @return SellerDTO
	 */
	public CashDTO selectCashInfo(HashMap<String, Object> param) {
		System.out.println("############# selectCashInfo : " + param);
		return sql.selectOne(path + "selectCashInfo", param);
	}

	/**
	 * 캐시 정보 등록
	 * @param param
	 * @return int
	 */
	public int insertCashInfo(HashMap<String, Object> param) {
		System.out.println("############# insertCashInfo : " + param);
		return sql.insert(path + "insertCashInfo", param);
	}

	/**
	 * 캐시 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateCashInfo(HashMap<String, Object> param) {
		System.out.println("############# updateCashInfo : " + param);
		return sql.update(path + "updateCashInfo", param);
	}
	
	/**
	 * 보너스 캐시 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateBonusCashInfo(HashMap<String, Object> param) {
		System.out.println("############# updateBonusCashInfo : " + param);
		return sql.update(path + "updateBonusCashInfo", param);
	}

	/**
	 * 판매자 정보 수정
	 * @param param
	 * @return int
	 */
	public int updateSellerInfo(HashMap<String, Object> param) {
		System.out.println("############# updateSellerInfo : " + param);

		return sql.update(path + "updateSellerInfo", param);
	}

	/**
	 * 캐시 이력 목록
	 * @param param
	 * @return List
	 */
	public List<CashHistoryDTO> selectCashHistoryList(HashMap<String, Object> param) {
		return sql.selectList(path + "selectCashHistoryList", param);
	}

	/**
	 * 캐시 이력 등록
	 * @param param
	 * @return int
	 */
	public int insertCashHistoryInfo(HashMap<String, Object> param) {
		System.out.println("############# insertCashHistoryInfo : " + param);
		return sql.insert(path + "insertCashHistoryInfo", param);
	}

	/**
	 * 캐시 충전금액 설정 목록 조회
	 * @param param
	 * @return List
	 */
	public List<CashRechargeSetDTO> selectCashRechargeList(HashMap<String, Object> param) {
		System.out.println("############# selectCashRechargeList : " + param);
		return sql.selectList(path + "selectCashRechargeList", param);
	}

	/**
	 * 바로 견적 발송 리스트 조회
	 * @param param
	 * @return List
	 */
	public List<EstimateRequestDTO> selectAutoEstimateList(HashMap<String, Object> param) {
		System.out.println("############# selectAutoEstimateList : " + param);
		return sql.selectList(path + "selectAutoEstimateList", param);
	}

	/**
	 * 바로견적 설정 목록 조회
	 * @param param
	 * @return List
	 */
	public List<DirectEstimateSetDTO> selectDirectEstimateSetList(HashMap<String, Object> param) {
		System.out.println("############# selectDirectEstimateSetList : " + param);
		return sql.selectList(path + "selectDirectEstimateSetList", param);
	}

	/**
	 * 바로견적 설정 정보 조회
	 * @param param
	 * @return
	 */
	public DirectEstimateSetDTO selectDirectEstimateSetInfo(HashMap<String, Object> param) {
		System.out.println("############# selectDirectEstimateSetInfo : " + param);
		return sql.selectOne(path + "selectDirectEstimateSetInfo", param);
	}

	/**
	 * 바로견적 설정 등록
	 * @param param
	 * @return int
	 */
	public int insertDirectEstimateSetInfo(HashMap<String, Object> param) {
		System.out.println("############# insertDirectEstimateSetInfo : " + param);
		return sql.insert(path + "insertDirectEstimateSetInfo", param);
	}

	/**
	 * 바로견적 설정 수정
	 * @param param
	 * @return int
	 */
	public int updateDirectEstimateSetInfo(HashMap<String, Object> param) {
		System.out.println("############# updateDirectEstimateSetInfo : " + param);

		return sql.update(path + "updateDirectEstimateSetInfo", param);
	}

	/**
	 * 공통코드 목록 조회
	 * @param param
	 * @return
	 */
	public List<CodeDTO> selectCodeList(HashMap<String, Object> param) {
		System.out.println("############# selectCodeList : " + param);
		return sql.selectList(path + "selectCodeList", param);
	}
	
	/**
	 * 판매자 게시판 정보 수정
	 * @param param
	 * @return
	 */
	public int updateSellerBordInfo(HashMap<String, Object> param) {
		System.out.println("############# updateSellerBordInfo : " + param);
		
		return sql.update(path + "updateSellerBordInfo", param);
	}
	
	/**
	 * 사업자 인증 상태 수정
	 * @param param
	 * @return
	 */
	public int updateBizCertification(HashMap<String, Object> param) {
		System.out.println("############# updateBizCertification : " + param);
		
		return sql.update(path + "updateBizCertification", param);
	}
	
	/**
	 * 사업자 목록 조회
	 * @param param
	 * @return
	 */
	public List<SellerDTO> selectSellerList(HashMap<String, Object> param) {
		System.out.println("############# selectSellerList : " + param);
		return sql.selectList(path + "selectSellerList", param);
	}
	
	/**
	 * 판매자 이미지 목록 조회
	 * @param param
	 * @return
	 */
	public List<BoardDTO> selectSellerDetailImageList(HashMap<String, Object> param) {
		System.out.println("############# selectSellerDetailImageList : " + param);
		return sql.selectList(path + "selectSellerDetailImageList", param);
	}
	
	/**
	 * 포인트 관리 목록
	 * @param param
	 * @return List<CashDTO>
	 */
	public List<CashDTO> selectPointInfoList(HashMap<String, Object> param) {
		System.out.println("############# selectPointInfoList : " + param);
		return sql.selectList(path + "selectPointInfoList", param);
	}
	
	/**
	 * 포인트 관리 상세 목록
	 * @param param
	 * @return List<CashHistoryDTO>
	 */
	public List<CashHistoryDTO> selectPointInfoDetailList(HashMap<String, Object> param) {
		System.out.println("############# selectPointInfoDetailList : " + param);
		return sql.selectList(path + "selectPointInfoDetailList", param);
	}
	
	/**
	 * 업체별 견적 카운트 조회
	 * @param param
	 * @return List<EstimateCntDTO>
	 */
	public List<EstimateCntDTO> selectEstimateCntList(HashMap<String, Object> param) {
		System.out.println("############# selectEstimateCntList : " + param);
		return sql.selectList(path + "selectEstimateCntList", param);
	}
	
	/**
	 * 업체별 구독 아파트 조회
	 * @param param
	 * @return List<AptDTO>
	 */
	public List<AptDTO> selectSubscribeAptList(HashMap<String, Object> param) {
		System.out.println("############# selectSubscribeAptList : " + param);
		return sql.selectList(path + "selectSubscribeAptList", param);
	}
	
	/**
	 * 업체별 구독 아파트 등록
	 * @param param
	 * @return int
	 */
	public int insertSubscribeApt(HashMap<String, Object> param) {
		System.out.println("############# insertSubscribeApt : " + param);
		return sql.insert(path + "insertSubscribeApt", param);
	}

	/**
	 * 업체별 구독 아파트 수정
	 * @param param
	 * @return int
	 */
	public int updateSubscribeApt(HashMap<String, Object> param) {
		System.out.println("############# updateSubscribeApt : " + param);
		return sql.update(path + "updateSubscribeApt", param);
	}
	
	/**
	 * 핸드폰 본인인증 수정
	 * @param param
	 * @return int
	 */
	public int updateHpCertificationYn(HashMap<String, Object> param) {
		System.out.println("############# updateHpCertificationYn : " + param);
		return sql.update(path + "updateHpCertificationYn", param);
	}
	
	/**
	 * 공동구매 목록 조회
	 * @param param
	 * @return List<GpInfoDTO>
	 */
	public List<GpInfoDTO> selectGPList(HashMap<String, Object> param) {
		System.out.println("############# selectGPList : " + param);
		return sql.selectList(path + "selectGPList", param);
	}
	
	/**
	 * 공동구매 상태 값 수정
	 * @param paramMap
	 * @return int
	 */
	public int updateGPstat(HashMap<String, Object> param) {
		System.out.println("############# updateGPstat : " + param);
		return sql.update(path + "updateGPstat", param);
	}
	
	/**
	 * 결제정보 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertSubscribePaymentData(HashMap<String, Object> param) {
		System.out.println("############# insertSubscribePaymentData : " + param);
		return sql.insert(path + "insertSubscribePaymentData", param);
	}
	
	/**
	 * 공동구매 목록 조회
	 * @return List<SubscribePaymentDTO>
	 */
	public List<SubscribePaymentDTO> selectSubscribePaymentDataList(HashMap<String, Object> param) {
		System.out.println("############# selectSubscribePaymentDataList : " + param);
		return sql.selectList(path + "selectSubscribePaymentDataList", param);
	}
	
	/**
	 * 협력업체 인증 정보 수정
	 * @param paramMap
	 * @return int
	 */
	public int updatePartnerYn(HashMap<String, Object> param) {
		System.out.println("############# updatePartnerYn : " + param);
		return sql.update(path + "updatePartnerYn", param);
	}
	
	/**
	 * 사업자 번호 불량여부 조회
	 * @param param
	 * @return SellerDTO
	 */
	public SellerDTO selectBizCertificationAllowYn(HashMap<String, Object> param) {
		System.out.println("############# selectBizCertificationAllowYn : " + param);
		return sql.selectOne(path + "selectBizCertificationAllowYn", param);
	}


}