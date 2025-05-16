package com.wit.inspaction.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.board.model.BoardReportDTO;
import com.wit.inspaction.board.model.CommentDTO;

@Repository
public class BoardMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.board.mapper.BoardMapper.";
	
	/**
	 * 게시판 리스트 조회
	 * @param paramMap
	 * @return List<BoardDTO>
	 */
	public List<BoardDTO> selectBoardList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectBoardList", paramMap);
	}
	
	/**
	 * 게시판 상세 조회
	 * @param paramMap
	 * @return BoardDTO
	 */
	public BoardDTO selectBoardDetailList(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "selectBoardDetailList", paramMap);
	}
	
	/**
	 * 게시판 상세 이미지 조회
	 * @param paramMap
	 * @return List<BoardDTO>
	 */
	public List<BoardDTO> selectBoardDetailImageList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectBoardDetailImageList", paramMap);
	}
	
	/**
	 * 게시판 조회수 증가
	 * @param paramMap
	 * @return int
	 */
	public int updateBoardRdCntUp(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateBoardRdCntUp", paramMap);
	}
	
	/**
	 * 게시판 번호 조회
	 * @param paramMap
	 * @return String
	 */
	public String selectNewBordNo(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "selectNewBordNo", paramMap);
	}
	
	/**
	 * 게시판 저장
	 * @param paramMap
	 * @return int
	 */
	public int saveBoardInfo(HashMap<String, Object> paramMap) {
	    return sql.insert(path + "saveBoardInfo", paramMap);
	}
	
	/**
	 * 게시판 수정
	 * @param paramMap
	 * @return int
	 */
	public int updateBoardInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateBoardInfo", paramMap);
	}
	
	/**
	 * 게시판 종료
	 * @param paramMap
	 * @return int
	 */
	public int endBoardInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "endBoardInfo", paramMap);
	}
	
	/**
	 * 게시판 리스트 조회
	 * @param paramMap
	 * @return List<CommentDTO>
	 */
	public List<CommentDTO> selectCommentList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectCommentList", paramMap);
	}
	
	/**
	 * 댓글 저장
	 * @param paramMap
	 * @return int
	 */
	public int saveCommentInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "saveCommentInfo", paramMap);
	}
	
	/**
	 * 댓글 종료
	 * @param paramMap
	 * @return int
	 */
	public int endCommentInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "endCommentInfo", paramMap);
	}
	
	/**
	 * 댓글 전체 종료
	 * @param paramMap
	 * @return int
	 */
	public int endCommentList(HashMap<String, Object> paramMap) {
		return sql.update(path + "endCommentList", paramMap);
	}
	
	/**
	 * 파일 저장
	 * @param paramMap
	 * @return int
	 */
	public int saveFileInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "saveFileInfo", paramMap);
	}
	
	/**
	 * 파일 삭제
	 * @param paramMap
	 * @return int
	 */
	public int deleteFileInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "deleteFileInfo", paramMap);
	}

	/**
	 * 게시글 기신고건 체크
	 */
	public int checkSendReport(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "checkSendReport", paramMap);
	}
	
	/**
	 * 게시글 신고하기
	 * @param paramMap
	 * @return int
	 */
	public int boardSendReport(HashMap<String, Object> paramMap) {
		return sql.insert(path + "boardSendReport", paramMap);
	}
	
	/**
	 * 업체 후기 별점 변경
	 * @param paramMap
	 * @return int
	 */
	public int updateStarRateInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateStarRateInfo", paramMap);
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 게시판 신고 리스트 조회
	 * @param paramMap
	 * @return List<BoardReportDTO>
	 */
	public List<BoardReportDTO> selectBoardReportList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectBoardReportList", paramMap);
	}
	
	/**
	 * 게시판 신고 상세 리스트 조회
	 * @param paramMap
	 * @return List<BoardReportDTO>
	 */
	public List<BoardReportDTO> selectBoardReportDetailList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectBoardReportDetailList", paramMap);
	}

	/**
	 * 게시판 신고 상태 변경
	 * @param paramMap
	 * @return int
	 */
	public int updateReportStat(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateReportStat", paramMap);
	}
	
}