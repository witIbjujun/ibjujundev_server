package com.wit.inspaction.board.service;

import java.util.HashMap;
import java.util.List;

import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.board.model.CommentDTO;

/**
 * 게시판 서비스
 */
public interface BoardService {

	/**
	 * 게시판 리스트 조회
	 * @param paramMap
	 * @return List<BoardDTO>
	 */
	public List<BoardDTO> getBoardList(HashMap<String, Object> paramMap);
	
	/**
	 * 게시판 상세 조회
	 * @param paramMap
	 * @return BoardDTO
	 */
	public BoardDTO getBoardDetailInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 게시판 상세 이미지 조회
	 * @param paramMap
	 * @return List<BoardDTO>
	 */
	public List<BoardDTO> getBoardDetailImageList(HashMap<String, Object> paramMap);

	/**
	 * 게시판 조회수 증가
	 * @param paramMap
	 * @return int
	 */
	public int boardRdCntUp(HashMap<String, Object> paramMap);
	
	/**
	 * 게시판 번호 조회
	 * @param paramMap
	 * @return int
	 */
	public int getNewBordNo(HashMap<String, Object> paramMap);
	
	/**
	 * 게시판 저장
	 * @param paramMap
	 * @return int
	 */
	public int saveBoardInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 게시판 수정
	 * @param paramMap
	 * @return int
	 */
	public int updateBoardInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 게시판 종료
	 * @param paramMap
	 * @return int
	 */
	public int endBoardInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 댓글 리스트 조회
	 * @param paramMap
	 * @return List<CommentDTO>
	 */
	public List<CommentDTO> getCommentList(HashMap<String, Object> paramMap);
	
	/**
	 * 댓글 저장
	 * @param paramMap
	 * @return int
	 */
	public int saveCommentInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 댓글 종료
	 * @param paramMap
	 * @return int
	 */
	public int endCommentInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 댓글 전체 종료
	 * @param paramMap
	 * @return int
	 */
	public int endCommentList(HashMap<String, Object> paramMap);
	
	/**
	 * 파일 저장
	 * @param paramMap
	 * @return int
	 */
	public int saveFileInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 파일 삭제
	 * @param paramMap
	 * @return int
	 */
	public int deleteFileInfo(HashMap<String, Object> paramMap);
	
}
