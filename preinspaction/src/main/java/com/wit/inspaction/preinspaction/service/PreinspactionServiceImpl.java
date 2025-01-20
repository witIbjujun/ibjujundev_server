package com.wit.inspaction.preinspaction.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.preinspaction.mapper.PreinspactionMapper;
import com.wit.inspaction.preinspaction.model.PreinspactionDTO;

/**
 * 사전점검 서비스 상세
 */
@Service
public class PreinspactionServiceImpl implements PreinspactionService{
	
	@Autowired
	private PreinspactionMapper preinspactionMapper;
	
	/**
	 * 사전점검 리스트 조회
	 */
	@Override
	public List<PreinspactionDTO> getPreinspactionListByLv1() {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionList 호출");
		
		List<PreinspactionDTO> list = preinspactionMapper.selectPreinspactionListByLv1();
		
		return list;
	}
	
	/**
	 * 사전점검 리스트 조회 (레벨2)
	 */
	@Override
	public List<PreinspactionDTO> getPreinspactionListByLv2(HashMap<String, Object> paramMap) {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionListByLv2 호출");
		
		List<PreinspactionDTO> list = preinspactionMapper.selectPreinspactionListByLv2(paramMap);
		
		return list;
	}
	
	/**
	 * 사전점검 리스트 조회 (레벨3)
	 */
	@Override
	public List<PreinspactionDTO> getPreinspactionListByLv3(HashMap<String, Object> paramMap) {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionListByLv3 호출");
		
		List<PreinspactionDTO> list = preinspactionMapper.selectPreinspactionListByLv3(paramMap);
		
		return list;
	}

	/**
	 * 사전점검 항목 저장
	 */
	@Override
	public int savePreinspactionInfo(HashMap<String, Object> paramMap) {
		return preinspactionMapper.insertPreinspactionInfo(paramMap);
	}

	/**
	 * 사전점검 항목 미완료 건수 조회
	 */
	@Override
	public int getPreinspactionNoCnt() {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionNoCnt 호출");
		
		int noCnt = preinspactionMapper.selectPreinspactionNoCnt();
		
		return noCnt;
	}
	
	/**
	 * 사전점검 항목 미완료 리스트 조회
	 */
	@Override
	public List<PreinspactionDTO> getPreinspactionNoList() {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionNoList 호출");
		
		List<PreinspactionDTO> list = preinspactionMapper.selectPreinspactionNoList();
		
		return list;
	}
}
