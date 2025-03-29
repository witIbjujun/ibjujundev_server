package com.wit.inspaction.schedule.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.schedule.model.ScheduleInfoDTO;

/**
 * ScheduleMapper
 * @author 조성훈
 * @since 2025.03.29
 * @category Schedule
 */
@Repository
public class ScheduleMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.schedule.mapper.ScheduleMapper.";
	
	/**
	 * 스케쥴 조회
	 * @param paramMap
	 * @return List<ScheduleInfoDTO>
	 */
	public List<ScheduleInfoDTO> selectScheduleList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectScheduleList", paramMap);
	}
	
	/**
	 * 스케쥴 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertScheduleInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertScheduleInfo", paramMap);
	}
	
	/**
	 * 스케쥴 수정
	 * @param paramMap
	 * @return int
	 */
	public int updateScheduleInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateScheduleInfo", paramMap);
	}
	
	/**
	 * 스케쥴 삭제
	 * @param paramMap
	 * @return int
	 */
	public int deleteScheduleInfo(HashMap<String, Object> paramMap) {
		return sql.delete(path + "deleteScheduleInfo", paramMap);
	}
	
}