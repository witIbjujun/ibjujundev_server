package com.wit.inspaction.schedule.service;

import java.util.HashMap;
import java.util.List;

import com.wit.inspaction.schedule.model.ScheduleInfoDTO;

/**
 * ScheduleService
 * @author 조성훈
 * @since 2025.03.29
 * @category Schedule
 */
public interface ScheduleService {
	
	/**
	 * 스케쥴 조회
	 * @param param
	 * @return List<ScheduleInfoDTO>
	 */
	public List<ScheduleInfoDTO> selectScheduleList(HashMap<String, Object> param);
	
	/**
	 * 스케쥴 저장
	 * @param param
	 * @return int
	 */
	public int insertScheduleInfo(HashMap<String, Object> param);
	
	/**
	 * 스케쥴 수정
	 * @param param
	 * @return int
	 */
	public int updateScheduleInfo(HashMap<String, Object> param);
	
	/**
	 * 스케쥴 삭제
	 * @param param
	 * @return int
	 */
	public int deleteScheduleInfo(HashMap<String, Object> param);
	
}
