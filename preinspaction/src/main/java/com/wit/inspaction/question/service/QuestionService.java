package com.wit.inspaction.question.service;

import java.util.HashMap;
import java.util.List;

import com.wit.inspaction.question.model.OptionInfoDTO;
import com.wit.inspaction.question.model.QuestionInfoDTO;

/**
 * QuestionService
 * @author 조성훈
 * @since 2024.10.26
 * @category Question
 */
public interface QuestionService {
	
	/**
	 * 질문 조회
	 * @param param
	 * @return QuestionInfoDTO
	 */
	public QuestionInfoDTO getQuestionInfo(HashMap<String, Object> param);
	
	/**
	 * 질문 옵션 조회
	 * @param param
	 * @return List<OptionInfoDTO>
	 */
	public List<OptionInfoDTO> getOptionList(HashMap<String, Object> param);

	/**
	 * 질문 저장
	 * @param param
	 * @return int
	 */
	public int saveQuestionInfo(HashMap<String, Object> param);
	
	/**
	 * 질문 삭제
	 * @param param
	 * @return int
	 */
	public int deleteQuestionInfo(HashMap<String, Object> param);

	/**
	 * 저장 질문 조회
	 * @param param
	 * @return List<QuestionInfoDTO>
	 */
	public List<QuestionInfoDTO> getQuestionInfoBySave(HashMap<String, Object> param);
	
	/**
	 * 저장 옵션 조회
	 * @param param
	 * @return List<OptionInfoDTO>
	 */
	public List<OptionInfoDTO> selectOptionListBySave(HashMap<String, Object> param);

	/**
	 * 질문 전체 삭제
	 * @param param
	 * @return int
	 */
	public int deleteQuestionInfoByAll(HashMap<String, Object> param);

}
