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
    public List<PreinspactionDTO> getPreinspactionList(@RequestBody HashMap<String, Object> param) {
        return preinspactionService.getPreinspactionListByLv1(param);
    }
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨2)
	 * @return List<PreinspactionDTO>
	 */
	@PostMapping("/wit/getPreinspactionListByLv2")
    public List<PreinspactionDTO> getPreinspactionListByLv2(@RequestBody HashMap<String, Object> param) {
        return preinspactionService.getPreinspactionListByLv2(param);
    }
	
	/**
	 * 사전점검 항목 리스트 조회 (레벨2)
	 * @return List<PreinspactionDTO>
	 */
	@PostMapping("/wit/getPreinspactionListByLv3")
    public List<PreinspactionDTO> getPreinspactionListByLv3(@RequestBody HashMap<String, Object> param) {
        return preinspactionService.getPreinspactionListByLv3(param);
    }
	
	/**
	 * 사전점검 항목 저장
	 * @param param
	 * @return int
	 */
	@PostMapping("/wit/savePreinspactionInfo")
    public int savePreinspactionInfo(@RequestBody HashMap<String, Object> param) {
        return preinspactionService.savePreinspactionInfo(param);
    }
	
	/**
	 * 사전점검 항목 미완료 건수 조회
	 * @return int
	 */
	@PostMapping("/wit/getPreinspactionNoCnt")
    public int getPreinspactionNoCnt(@RequestBody HashMap<String, Object> param) {
        return preinspactionService.getPreinspactionNoCnt(param);
    }
	
	/**
	 * 사전점검 항목 미완료 리스트 조회
	 * @return List<PreinspactionDetailDTO>
	 */
	@PostMapping("/wit/getPreinspactionNoList")
    public List<PreinspactionDTO> getPreinspactionNoList(@RequestBody HashMap<String, Object> param) {
        return preinspactionService.getPreinspactionNoList(param);
    }
}