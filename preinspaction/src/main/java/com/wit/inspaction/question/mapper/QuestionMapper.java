package com.wit.inspaction.question.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.question.model.OptionInfoDTO;
import com.wit.inspaction.question.model.QuestionInfoDTO;

/**
 * QuestionMapper
 * @author 조성훈
 * @since 2024.10.26
 * @category Question
 */
@Repository
public class QuestionMapper {

	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.question.mapper.QuestionMapper.";
	
	/**
	 * 질문 조회
	 * @param param
	 * @return QuestionInfoDTO
	 */
	public QuestionInfoDTO getQuestionInfo(HashMap<String, Object> param) {
		return sql.selectOne(path + "selectQuestionInfo", param);
	}

	/**
	 * 질문 옵션 조회
	 * @param param
	 * @return List<OptionInfoDTO>
	 */
	public List<OptionInfoDTO> getOptionList(HashMap<String, Object> param) {
		return sql.selectList(path + "selectOptionList", param);
	}

	/**
	 * 질문 저장
	 * @param param
	 * @return int
	 */
	public int saveQuestionInfo(HashMap<String, Object> param) {
		return sql.insert(path + "saveQuestionInfo", param);
	}
	
	/**
	 * 질문 삭제
	 * @param param
	 * @return int
	 */
	public int deleteQuestionInfo(HashMap<String, Object> param) {
		return sql.delete(path + "deleteQuestionInfo", param);
	}
	
	/**
	 * 질문 삭제
	 * @param param
	 * @return int
	 */
	public int deleteQuestionInfoBySeq(HashMap<String, Object> param) {
		return sql.delete(path + "deleteQuestionInfoBySeq", param);
	}

	/**
	 * 저장 질문 조회
	 * @param param
	 * @return List<QuestionInfoDTO>
	 */
	public List<QuestionInfoDTO> selectQuestionInfoBySave(HashMap<String, Object> param) {
		return sql.selectList(path + "selectQuestionInfoBySave", param);
	}

	/**
	 * 저장 옵션 조회
	 * @param param
	 * @return List<OptionInfoDTO>
	 */
	public List<OptionInfoDTO> selectOptionListBySave(HashMap<String, Object> param) {
		return sql.selectList(path + "selectOptionListBySave", param);
	}

	/**
	 * 질문 전체 삭제
	 * @param param
	 * @return int
	 */
	public int deleteQuestionInfoByAll(HashMap<String, Object> param) {
		return sql.delete(path + "deleteQuestionInfoByAll", param);
	}

}