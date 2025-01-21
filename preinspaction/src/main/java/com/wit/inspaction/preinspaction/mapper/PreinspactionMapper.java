package com.wit.inspaction.preinspaction.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wit.inspaction.preinspaction.model.PreinspactionDTO;

@Repository
public class PreinspactionMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.preinspaction.mapper.PreinspactionMapper.";
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨1)
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> selectPreinspactionListByLv1(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectPreinspactionListByLv1", paramMap);
	}
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨2)
	 * @param paramMap
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> selectPreinspactionListByLv2(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectPreinspactionListByLv2", paramMap);
	}
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨3)
	 * @param paramMap
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> selectPreinspactionListByLv3(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectPreinspactionListByLv3", paramMap);
	}
    
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertPreinspactionInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertPreinspactionInfo", paramMap);
	}
	
	/**
	 * 사전점검 항목 미완료 건수 조회
	 * @return int
	 */
	public int selectPreinspactionNoCnt(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "selectPreinspactionNoCnt", paramMap);
	}
	
	/**
	 * 사전점검 항목 미완료 리스트 조회
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> selectPreinspactionNoList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectPreinspactionNoList", paramMap);
	}
	
}