package com.wit.inspaction.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.question.model.OptionInfoDTO;
import com.wit.inspaction.question.model.QuestionInfoDTO;
import com.wit.inspaction.question.service.QuestionService;

/**
 * 질문 Controller
 * @author 조성훈
 * @since 2024.10.26
 * @category Question
 */
@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	/**
	 * 최초 질문, 옵션 조회
	 * @param paramMap
	 * @return ResponseEntity<?>
	 */
	@PostMapping("/wit/getFirstQuestionInfo")
	public ResponseEntity<?> getFirstQuestionInfo(@RequestBody HashMap<String, Object> paramMap) {
		
		// 결과값 저장 MAP
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		// 저장 질문 조회
		List<QuestionInfoDTO> saveQuestionList = questionService.getQuestionInfoBySave(paramMap);
		
		if (saveQuestionList == null) {
			resultMap.put("questionList", null);
	        resultMap.put("optionList", null);
	        resultMap.put("saveData", null);
	        return ResponseEntity.ok(resultMap);
		}
		
		// 저장 옵션 List
		List<List<OptionInfoDTO>> saveOptionList = new ArrayList<List<OptionInfoDTO>>();
		
		for (QuestionInfoDTO questionInfoDTO : saveQuestionList) {
			
			String qustOpCd = questionInfoDTO.getQustOpCd();
			
			System.out.println("qustOpCd ::: " + qustOpCd);
			
			// 질문 파라미터
			HashMap<String, Object> optionParam = new HashMap<String, Object>();
			optionParam.put("opCd", qustOpCd);		// 질문 코드
			
			// 질문 옵션 조회
			List<OptionInfoDTO> optionInfo = questionService.getOptionList(optionParam);
			saveOptionList.add(optionInfo);
		}
		
		List<OptionInfoDTO> saveData = questionService.selectOptionListBySave(paramMap);
		
        resultMap.put("questionList", saveQuestionList);
        resultMap.put("optionList", saveOptionList);
        resultMap.put("saveData", saveData);
        return ResponseEntity.ok(resultMap);
	}
	
	/**
	 * 질문, 옵션 조회
	 * @param paramMap
	 * @return ResponseEntity<?>
	 */
	@PostMapping("/wit/getNextQuestionInfo")
	public ResponseEntity<?> getNextQuestionInfo(@RequestBody HashMap<String, Object> paramMap) {
    	
		// Question 코드
		String qustCd = (String) paramMap.get("qustCd") == null ? "" : (String) paramMap.get("qustCd");
		
		// 결과값 저장 MAP
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		// 질문 파라미터
		HashMap<String, Object> questionParam = new HashMap<String, Object>();
		questionParam.put("qustCd", qustCd);		// 질문 코드
		
		// 질문 조회
		QuestionInfoDTO questionInfo = questionService.getQuestionInfo(questionParam);
		
		if (questionInfo == null) {
			resultMap.put("questionInfo", null);
	        resultMap.put("optionList", null);
	        return ResponseEntity.ok(resultMap);
		}
		
		// 질문 옵션 파라미터
		HashMap<String, Object> optionParam = new HashMap<String, Object>();
		optionParam.put("opCd", questionInfo.getQustOpCd());	// 질문 옵션 코드
		
		// 질문 옵션 조회
		List<OptionInfoDTO> optionList = questionService.getOptionList(optionParam);
		
        // 결과값 리턴
        resultMap.put("questionInfo", questionInfo);
        resultMap.put("optionList", optionList);

        return ResponseEntity.ok(resultMap);
	}
	
	/**
	 * 질문 저장
	 * @param paramMap
	 * @return ResponseEntity<?>
	 */
	@PostMapping("/wit/saveQuestionInfo")
	public ResponseEntity<?> saveQuestionInfo(@RequestBody HashMap<String, Object> paramMap) {
    	
		// 질문 코드
		String qustCd = (String) paramMap.get("qustCd") == null ? "" : (String) paramMap.get("qustCd");
		// 옵션 코드
		String opCd = (String) paramMap.get("opCd") == null ? "" : (String) paramMap.get("opCd");
		// 옵션순번
		String opSeq = (String) paramMap.get("opSeq") == null ? "" : (String) paramMap.get("opSeq");
		// 등록자
		String userId = (String) paramMap.get("userId") == null ? "" : (String) paramMap.get("userId");
		// 결과코드
		int saveResult = 0;
		
		// 옵션 다건 선택건 split 처리
		String[] opCdList = opCd.split(",");
		String[] opSeqList = opSeq.split(",");
		
		for (int idx = 0; idx < opCdList.length; idx++) {
			// 저장 파라미터
			HashMap<String, Object> saveMap = new HashMap<String, Object>();
			saveMap.put("qustCd", qustCd);
			saveMap.put("opCd", opCdList[idx]);
			saveMap.put("opSeq", opSeqList[idx]);
			saveMap.put("userId", userId);
			
			// 기존 질문 삭제 (한번만 삭제) 
			if (idx == 0) {
				int deleteResult = questionService.deleteQuestionInfo(saveMap);
				System.out.println("삭제 ::: " + deleteResult);
			}
			
			// 질문 저장
			saveResult += questionService.saveQuestionInfo(saveMap);
		}
		
		// 결과값 저장 MAP
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (saveResult > 0) {
			resultMap.put("saveResult", "OK");
		} else {
			resultMap.put("saveResult", "FAIL");
		}
		
		return ResponseEntity.ok(resultMap);
	}
	
	/**
	 * 질문 삭제
	 * @param paramMap
	 * @return ResponseEntity<?>
	 */
	@PostMapping("/wit/deleteQuestionInfo")
	public ResponseEntity<?> deleteQuestionInfo(@RequestBody HashMap<String, Object> paramMap) {
    	
		// 등록자
		String userId = (String) paramMap.get("userId") == null ? "" : (String) paramMap.get("userId");
		// 순번
		String seq = (String) paramMap.get("seq") == null ? "" : (String) paramMap.get("seq");
		// 결과코드
		int deleteResult = 0;
		
		// 삭제 파라미터
		HashMap<String, Object> delMap = new HashMap<String, Object>();
		delMap.put("seq", seq);
		delMap.put("userId", userId);
		
		deleteResult = questionService.deleteQuestionInfoBySeq(delMap);
		System.out.println("삭제 ::: " + deleteResult);
		
		// 결과값 저장 MAP
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (deleteResult > 0) {
			resultMap.put("delResult", "OK");
		} else {
			resultMap.put("delResult", "FAIL");
		}
		
		return ResponseEntity.ok(resultMap);
	}
	
	/**
	 * 질문 전체 삭제
	 * @param paramMap
	 * @return ResponseEntity<?>
	 */
	@PostMapping("/wit/deleteQuestionInfoByAll")
	public ResponseEntity<?> deleteQuestionInfoByAll(@RequestBody HashMap<String, Object> paramMap) {
		
		int deleteResult = questionService.deleteQuestionInfoByAll(paramMap);
		
		// 결과값 저장 MAP
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (deleteResult > 0) {
			resultMap.put("delResult", "OK");
		} else {
			resultMap.put("delResult", "OK");
		}
		
		return ResponseEntity.ok(resultMap);
	}
	
}