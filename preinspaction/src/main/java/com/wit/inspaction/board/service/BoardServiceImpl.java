package com.wit.inspaction.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.board.mapper.BoardMapper;
import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.board.model.BoardReportDTO;
import com.wit.inspaction.board.model.CommentDTO;

/**
 * 게시판 서비스 상세
 */
@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	/**
	 * 게시판 리스트 조회
	 */
	@Override
	public List<BoardDTO> getBoardList(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl getBoardList 호출");
		
		return boardMapper.selectBoardList(paramMap);
	}
	
	/**
	 * 게시판 상세 조회
	 */
	@Override
	public BoardDTO getBoardDetailInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl getBoardDetailInfo 호출");
		
		return boardMapper.selectBoardDetailList(paramMap);
	}
	
	/**
	 * 게시판 상세 이미지 조회
	 */
	@Override
	public List<BoardDTO> getBoardDetailImageList(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl getBoardDetailImageList 호출");
		
		return boardMapper.selectBoardDetailImageList(paramMap);
	}

	/**
	 * 게시판 조회수 증가
	 */
	@Override
	public int boardRdCntUp(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl boardRdCntUp 호출");
		
		return boardMapper.updateBoardRdCntUp(paramMap);
	}
	
	/**
	 * 게시판 번호 조회
	 */
	@Override
	public String getNewBordNo(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl getNewBordNo 호출");
		
		return boardMapper.selectNewBordNo(paramMap);
	}
	
	/**
	 * 게시판 저장
	 */
	@Override
	public int saveBoardInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl saveBoardInfo 호출");
		
		return boardMapper.saveBoardInfo(paramMap);
	}
	
	/**
	 * 게시판 수정
	 */
	@Override
	public int updateBoardInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl updateBoardInfo 호출");
		
		return boardMapper.updateBoardInfo(paramMap);
	}
	
	/**
	 * 게시판 종료
	 */
	@Override
	public int endBoardInfo(HashMap<String, Object> paramMap) {
		return boardMapper.endBoardInfo(paramMap);
	}
	
	/**
	 * 댓글 리스트 조회
	 */
	@Override
	public List<CommentDTO> getCommentList(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl getCommentList 호출");
		
		return boardMapper.selectCommentList(paramMap);
	}
	
	/**
	 * 댓글 저장
	 */
	@Override
	public int saveCommentInfo(HashMap<String, Object> paramMap) {
		
		System.out.println("BoardServiceImpl saveCommentInfo 호출");
		
		return boardMapper.saveCommentInfo(paramMap);
	}
	
	/**
	 * 댓글 종료
	 */
	@Override
	public int endCommentInfo(HashMap<String, Object> paramMap) {
		return boardMapper.endCommentInfo(paramMap);
	}
	
	/**
	 * 댓글 전체 종료
	 */
	@Override
	public int endCommentList(HashMap<String, Object> paramMap) {
		return boardMapper.endCommentList(paramMap);
	}
	
	/**
	 * 파일 저장
	 */
	@Override
	public int saveFileInfo(HashMap<String, Object> paramMap) {
		return boardMapper.saveFileInfo(paramMap);
	}
	
	/**
	 * 파일 삭제
	 */
	@Override
	public int deleteFileInfo(HashMap<String, Object> paramMap) {
		return boardMapper.deleteFileInfo(paramMap);
	}

	/**
	 * 게시글 기신고건 체크
	 */
	@Override
	public int checkSendReport(HashMap<String, Object> paramMap) {
		return boardMapper.checkSendReport(paramMap);
	}
	
	/**
	 * 게시글 신고하기
	 */
	@Override
	public int boardSendReport(HashMap<String, Object> paramMap) {
		return boardMapper.boardSendReport(paramMap);
	}
	
	/**
	 * 업체 후기 별점 변경
	 */
	@Override
	public int updateStarRateInfo(HashMap<String, Object> paramMap) {
		return boardMapper.updateStarRateInfo(paramMap);
	}
	
	/**
	 * 업체 후기 총별점 변경
	 */
	@Override
	public int updateAllRateInfo(HashMap<String, Object> paramMap) {
		return boardMapper.updateAllRateInfo(paramMap);
	}

	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * 게시판 신고 리스트 조회
	 */
	@Override
	public List<BoardReportDTO> getBoardReportList(HashMap<String, Object> paramMap) {
		return boardMapper.selectBoardReportList(paramMap);
	}

	/**
	 * 게시판 신고 상세 리스트 조회
	 */
	@Override
	public List<BoardReportDTO> getBoardReportDetailList(HashMap<String, Object> paramMap) {
		return boardMapper.selectBoardReportDetailList(paramMap);
	}
	
	/**
	 * 게시판 신고 상태 변경
	 */
	@Override
	public int updateReportStat(HashMap<String, Object> paramMap) {
		return boardMapper.updateReportStat(paramMap);
	}
	
}
