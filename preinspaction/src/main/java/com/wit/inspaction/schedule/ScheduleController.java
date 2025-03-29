package com.wit.inspaction.schedule;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.schedule.model.ScheduleInfoDTO;
import com.wit.inspaction.schedule.service.ScheduleService;

/**
 * 스케쥴 Controller
 * @author 조성훈
 * @since 2025.03.29
 * @category Question
 */
@RestController
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	
	/**
	 * 스케쥴 조회
	 * @param paramMap
	 * @return List<ScheduleInfoDTO>
	 */
	@PostMapping("/wit/selectScheduleList")
	public List<ScheduleInfoDTO> selectScheduleList(@RequestBody HashMap<String, Object> paramMap) {
        return scheduleService.selectScheduleList(paramMap);
	}
	
	/**
	 * 스케쥴 저장
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/insertScheduleInfo")
	public int insertScheduleInfo(@RequestBody HashMap<String, Object> paramMap) {
		return scheduleService.insertScheduleInfo(paramMap);
	}
	
	/**
	 * 스케쥴 수정
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/updateScheduleInfo")
	public int updateScheduleInfo(@RequestBody HashMap<String, Object> paramMap) {
		return scheduleService.updateScheduleInfo(paramMap);
	}
	
	/**
	 * 스케쥴 삭제
	 * @param paramMap
	 * @return int
	 */
	@PostMapping("/wit/deleteScheduleInfo")
	public int deleteScheduleInfo(@RequestBody HashMap<String, Object> paramMap) {
		return scheduleService.deleteScheduleInfo(paramMap);
	}
	
}