package com.wit.inspaction.seller.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.seller.model.CashDTO;
import com.wit.inspaction.seller.model.CashHistoryDTO;
import com.wit.inspaction.seller.model.CashRechargeSetDTO;
import com.wit.inspaction.seller.model.CodeDTO;
import com.wit.inspaction.seller.model.DirectEstimateSetDTO;
import com.wit.inspaction.seller.model.EstimateRequestDTO;
import com.wit.inspaction.seller.model.SellerDTO;
import com.wit.inspaction.seller.model.SellerSendDTO;

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
		return sql.update(path + "updateCashInfo", param);
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


}