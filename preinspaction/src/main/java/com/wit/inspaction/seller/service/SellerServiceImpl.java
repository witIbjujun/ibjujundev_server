package com.wit.inspaction.seller.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.seller.mapper.SellerMapper;
import com.wit.inspaction.seller.model.AptDTO;
import com.wit.inspaction.seller.model.CashDTO;
import com.wit.inspaction.seller.model.CashHistoryDTO;
import com.wit.inspaction.seller.model.CashRechargeSetDTO;
import com.wit.inspaction.seller.model.CodeDTO;
import com.wit.inspaction.seller.model.DirectEstimateSetDTO;
import com.wit.inspaction.seller.model.EstimateCntDTO;
import com.wit.inspaction.seller.model.EstimateRequestDTO;
import com.wit.inspaction.seller.model.SellerDTO;
import com.wit.inspaction.seller.model.SellerSendDTO;

/**
 * 사전점검 서비스 상세
 */
@Service
public class SellerServiceImpl implements SellerService{

	@Autowired
	private SellerMapper sellerMapper;

	/**
	 * 견적리스트 조회
	 */
	@Override
	public List<EstimateRequestDTO> getEstimateRequestList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getEstimateRequestList 호출");

		List<EstimateRequestDTO> list = sellerMapper.selectEstimateRequestList(param);

		return list;
	}

	/**
	 * 견적발송 용 데이터 조회
	 * @return List<SellerSendDTO>
	 */
	@Override
	public SellerSendDTO getEstimateRequestInfoForSend(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getEstimateRequestInfoForSend 호출");

		SellerSendDTO sellerSendDTO = sellerMapper.selectEstimateRequestInfoForSend(param);

		return sellerSendDTO;
	}

	/**
	 * 견적발송 정보 저장
	 */
	@Override
	public int saveEstimateInfo(HashMap<String, Object> param) {
		return sellerMapper.insertEstimateInfo(param);
	}

	/**
	 * 사업자 프로필 저장
	 */
	@Override
	public int saveSellerProfile(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl saveSellerProfile 호출");
		return sellerMapper.insertSellerProfile(param);
	}

	@Override
	public SellerDTO getSellerInfo(HashMap<String, Object> param) {

		SellerDTO sellerDTO = sellerMapper.selectSellerInfo(param);

		return sellerDTO;
	}

	@Override
	public int updateEstimateInfo(HashMap<String, Object> param) {
		return sellerMapper.updateEstimateInfo(param);
	}

	@Override
	public CashDTO getCashInfo(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getCashInfo 호출");

		CashDTO cashDTO = sellerMapper.selectCashInfo(param);

		return cashDTO;
	}

	@Override
	public int insertCashInfo(HashMap<String, Object> param) {
		return sellerMapper.insertCashInfo(param);
	}

	@Override
	public int updateCashInfo(HashMap<String, Object> param) {
		return sellerMapper.updateCashInfo(param);
	}
	
	@Override
	public int updateBonusCashInfo(HashMap<String, Object> param) {
		return sellerMapper.updateBonusCashInfo(param);
	}

	@Override
	public int updateSellerInfo(HashMap<String, Object> param) {
		return sellerMapper.updateSellerInfo(param);
	}

	@Override
	public List<CashHistoryDTO> getCashHistoryList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getCashHistoryList 호출");

		List<CashHistoryDTO> list = sellerMapper.selectCashHistoryList(param);

		return list;
	}

	@Override
	public int insertCashHistoryInfo(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl insertCashHistoryInfo 호출");

		return sellerMapper.insertCashHistoryInfo(param);
	}

	@Override
	public List<CashRechargeSetDTO> getCashRechargeList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getCashRechargeList 호출");

		List<CashRechargeSetDTO> list = sellerMapper.selectCashRechargeList(param);

		return list;
	}

	@Override
	public List<EstimateRequestDTO> getAutoEstimateList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getAutoEstimateList 호출");

		List<EstimateRequestDTO> list = sellerMapper.selectAutoEstimateList(param);

		return list;
	}

	@Override
	public List<DirectEstimateSetDTO> getDirectEstimateSetList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getDirectEstimateSetList 호출");

		List<DirectEstimateSetDTO> list = sellerMapper.selectDirectEstimateSetList(param);

		return list;
	}

	@Override
	public DirectEstimateSetDTO getDirectEstimateSetInfo(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getDirectEstimateSetInfo 호출");

		DirectEstimateSetDTO directEstimateDTO = sellerMapper.selectDirectEstimateSetInfo(param);

		return directEstimateDTO;
	}

	@Override
	public int insertDirectEstimateSetInfo(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl insertDirectEstimateSetInfo 호출");

		return sellerMapper.insertDirectEstimateSetInfo(param);
	}

	@Override
	public int updateDirectEstimateSetInfo(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl updateDirectEstimateSetInfo 호출");

		return sellerMapper.updateDirectEstimateSetInfo(param);
	}

	@Override
	public List<CodeDTO> getCodeList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getCodeList 호출");

	    String cdClsParam = param.get("cdCls").toString();
	    // 문자열을 쉼표로 분리하여 배열로 변환
	    String[] cdClsArray = cdClsParam.split(",");

	    // 배열을 param에 설정
	    param.put("cdCls", cdClsArray);


		return sellerMapper.selectCodeList(param);
	}

	@Override
	public int updateSellerBordInfo(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl updateSellerBordInfo 호출");
		
		return sellerMapper.updateSellerBordInfo(param);
	}

	@Override
	public int updateBizCertification(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl updateBizCertification 호출");
		
		return sellerMapper.updateBizCertification(param);
	}

	@Override
	public List<SellerDTO> getSellerList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getSellerList 호출");

		return sellerMapper.selectSellerList(param);
	}

	@Override
	public List<BoardDTO> getSellerDetailImageList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getSellerDetailImageList 호출");

		return sellerMapper.selectSellerDetailImageList(param);
	}
	
	@Override
	public List<CashDTO> getPointInfoList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getPointInfoList 호출");
		return sellerMapper.selectPointInfoList(param);
	}
	
	@Override
	public List<CashHistoryDTO> getPointInfoDetailList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getPointInfoDetailList 호출");
		return sellerMapper.selectPointInfoDetailList(param);
	}
	
	@Override
	public List<EstimateCntDTO> getEstimateCntList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getEstimateCntList 호출");
		return sellerMapper.selectEstimateCntList(param);
	}

	@Override
	public List<AptDTO> getSubscribeAptList(HashMap<String, Object> param) {
		System.out.println("SellerServiceImpl getSubscribeAptList 호출");
		return sellerMapper.selectSubscribeAptList(param);
	}

}
