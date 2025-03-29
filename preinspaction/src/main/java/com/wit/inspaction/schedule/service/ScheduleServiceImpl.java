package com.wit.inspaction.schedule.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.schedule.mapper.ScheduleMapper;
import com.wit.inspaction.schedule.model.ScheduleInfoDTO;

/**
 * ScheduleServiceImpl
 * @author 조성훈
 * @since 2025.03.29
 * @category Schedule
 */
@Service
public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	private ScheduleMapper scheduleMapper;
	
	/**
	 * 스케쥴 조회
	 * @param param
	 * @return List<ScheduleInfoDTO>
	 */
	@Override
	public List<ScheduleInfoDTO> selectScheduleList(HashMap<String, Object> param) {
		return scheduleMapper.selectScheduleList(param);
	}

	/**
	 * 스케쥴 저장
	 * @param param
	 * @return int
	 */
	@Override
	public int insertScheduleInfo(HashMap<String, Object> param) {
		return scheduleMapper.insertScheduleInfo(param);
	}

	/**
	 * 스케쥴 수정
	 * @param param
	 * @return int
	 */
	@Override
	public int updateScheduleInfo(HashMap<String, Object> param) {
		return scheduleMapper.updateScheduleInfo(param);
	}

	/**
	 * 스케쥴 삭제
	 * @param param
	 * @return int
	 */
	@Override
	public int deleteScheduleInfo(HashMap<String, Object> param) {
		return scheduleMapper.deleteScheduleInfo(param);
	}
	
}
