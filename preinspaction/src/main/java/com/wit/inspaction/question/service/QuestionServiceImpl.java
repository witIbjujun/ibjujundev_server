package com.wit.inspaction.question.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.question.mapper.QuestionMapper;
import com.wit.inspaction.question.model.OptionInfoDTO;
import com.wit.inspaction.question.model.QuestionInfoDTO;

/**
 * QuestionServiceImpl
 * @author 조성훈
 * @since 2024.10.26
 * @category Question
 */
@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionMapper questionMapper;
	
	/**
	 * 질문 조회
	 * @param param
	 * @return QuestionInfoDTO
	 */
	@Override
	public QuestionInfoDTO getQuestionInfo(HashMap<String, Object> param) {
		return questionMapper.getQuestionInfo(param);
	}

	/**
	 * 질문 옵션 조회
	 * @param param
	 * @return List<OptionInfoDTO>
	 */
	@Override
	public List<OptionInfoDTO> getOptionList(HashMap<String, Object> param) {
		return questionMapper.getOptionList(param);
	}

	/**
	 * 질문 저장
	 * @param param
	 * @return int
	 */
	@Override
	public int saveQuestionInfo(HashMap<String, Object> param) {
		return questionMapper.saveQuestionInfo(param);
	}
	
	/**
	 * 질문 삭제
	 * @param param
	 * @return int
	 */
	@Override
	public int deleteQuestionInfo(HashMap<String, Object> param) {
		return questionMapper.deleteQuestionInfo(param);
	}

	/**
	 * 저장 질문 조회
	 * @param param
	 * @return List<QuestionInfoDTO>
	 */
	@Override
	public List<QuestionInfoDTO> getQuestionInfoBySave(HashMap<String, Object> param) {
		return questionMapper.selectQuestionInfoBySave(param);
	}

	/**
	 * 저장 옵션 조회
	 * @param param
	 * @return List<OptionInfoDTO>
	 */
	@Override
	public List<OptionInfoDTO> selectOptionListBySave(HashMap<String, Object> param) {
		return questionMapper.selectOptionListBySave(param);
	}

	/**
	 * 질문 전체 삭제
	 * @param param
	 * @return int
	 */
	@Override
	public int deleteQuestionInfoByAll(HashMap<String, Object> param) {
		return questionMapper.deleteQuestionInfoByAll(param);
	}

}
