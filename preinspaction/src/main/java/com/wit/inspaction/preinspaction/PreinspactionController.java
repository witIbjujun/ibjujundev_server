package com.wit.inspaction.preinspaction;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.preinspaction.service.PreinspactionService;

@RestController
public class PreinspactionController {
	
	// logger
	private static final Logger logger = LoggerFactory.getLogger(PreinspactionController.class);
	
	@Autowired
	private PreinspactionService preinspactionService;
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨1)
	 * @return List<PreinspactionDTO>
	 */
	@PostMapping("/wit/getPreinspactionListByLv1")
    public List<PreinspactionDTO> getPreinspactionList() {
    	
		logger.info("PreinspactionServiceImpl 호출");
		
		List<PreinspactionDTO> preinspactionList = preinspactionService.getPreinspactionListByLv1();
    	
		logger.info("사전점검 리스트 Lv1 ::: " + preinspactionList.size());
		
        return preinspactionList;
    }
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨2)
	 * @return List<PreinspactionDTO>
	 */
	@PostMapping("/wit/getPreinspactionListByLv2")
    public List<PreinspactionDTO> getPreinspactionListByLv2(@RequestBody HashMap<String, Object> param) {
    	
		logger.info("PreinspactionServiceImpl 호출");
		
		// 파라미터
		String inspId = param.get("inspId") == null ? "" : (String) param.get("inspId");
				
		logger.info("inspId2 :: " + inspId);
		
		List<PreinspactionDTO> preinspactionList = preinspactionService.getPreinspactionListByLv2(param);
    	
		logger.info("사전점검 리스트 Lv2 ::: " + preinspactionList.size());
		
        return preinspactionList;
    }
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨2)
	 * @return List<PreinspactionDTO>
	 */
	@PostMapping("/wit/getPreinspactionListByLv3")
    public List<PreinspactionDTO> getPreinspactionListByLv3(@RequestBody HashMap<String, Object> param) {
    	
		logger.info("PreinspactionServiceImpl 호출");
		
		// 파라미터
		String inspId = param.get("inspId") == null ? "" : (String) param.get("inspId");
		String parentsInspId = param.get("parentsInspId") == null ? "" : (String) param.get("parentsInspId");
		
		logger.info("parentsInspId :: " + parentsInspId);
		logger.info("inspId :: " + inspId);
		
		List<PreinspactionDTO> preinspactionList = preinspactionService.getPreinspactionListByLv3(param);
    	
		logger.info("사전점검 리스트 Lv3 ::: " + preinspactionList.size());
		
        return preinspactionList;
    }
	
	/**
	 * 사전점검 항목 저장
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/savePreinspactionInfo")
    public int savePreinspactionInfo(@RequestBody HashMap<String, Object> param) {
    	
		logger.info("savePreinspactionInfo 호출");
		int result = preinspactionService.savePreinspactionInfo(param);
		
        return result;
    }
	
	/**
	 * 사전점검 항목 미완료 건수 조회
	 * @return int
	 */
	@PostMapping("/wit/getPreinspactionNoCnt")
    public int getPreinspactionNoCnt() {
    	
		logger.info("PreinspactionServiceImpl 호출");
		
		int noCnt = preinspactionService.getPreinspactionNoCnt();
    	
		logger.info("사전점검 항목 미완료 건수 조회 ::: " + noCnt);
		
        return noCnt;
    }
	
	/**
	 * 사전점검 항목 미완료 리스트 조회
	 * @return List<PreinspactionDetailDTO>
	 */
	@PostMapping("/wit/getPreinspactionNoList")
    public List<PreinspactionDTO> getPreinspactionNoList() {
    	
		logger.info("PreinspactionServiceImpl 호출");
		
		List<PreinspactionDTO> preinspactionNoList = preinspactionService.getPreinspactionNoList();
    	
		logger.info("사전점검 항목 미완료 리스트 조회 ::: " + preinspactionNoList.size());
		
        return preinspactionNoList;
    }
}