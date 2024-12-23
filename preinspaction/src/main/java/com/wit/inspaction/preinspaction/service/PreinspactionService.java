package com.wit.inspaction.preinspaction.service;

import java.util.HashMap;
import java.util.List;

import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;

/**
 * 사전점검 서비스
 */
public interface PreinspactionService {

	/**
	 * 사전점검 항목 미완료 건수 조회
	 * @return int
	 */
	public int getPreinspactionNoCnt();
	
	/**
	 * 사전점검 항목 미완료 리스트 조회
	 * @return List<PreinspactionDetailDTO>
	 */
	public List<PreinspactionDetailDTO> getPreinspactionNoList();
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨1)
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> getPreinspactionListByLv1();
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨2)
	 * @param param
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> getPreinspactionListByLv2(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨3)
	 * @param param
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> getPreinspactionListByLv3(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 상세항목 리스트 조회
	 * @param paramMap
	 * @return List<PreinspactionDetailDTO>
	 */
	public List<PreinspactionDetailDTO> getPreinspactionDetailList(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 항목 저장
	 * @param param
	 * @return int
	 */
	public int savePreinspactionInfo(HashMap<String, Object> paramMap);
	
}
