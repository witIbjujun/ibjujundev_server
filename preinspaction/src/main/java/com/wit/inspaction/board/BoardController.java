package com.wit.inspaction.board;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.board.model.BoardReportDTO;
import com.wit.inspaction.board.model.CommentDTO;
import com.wit.inspaction.board.service.BoardService;

@RestController
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * 게시판 리스트 조회
	 * @return List<BoardDTO>
	 */
	@PostMapping("/wit/getBoardList")
    public List<BoardDTO> getBoardList(@RequestBody HashMap<String, Object> paramMap) {
        return boardService.getBoardList(paramMap);
    }
	
	/**
	 * 게시판 상세 조회
	 * @return BoardDTO
	 */
	@PostMapping("/wit/getBoardDetailInfo")
    public BoardDTO getBoardDetailInfo(@RequestBody HashMap<String, Object> paramMap) {
        return boardService.getBoardDetailInfo(paramMap);
    }
	
	/**
	 * 게시판 상세 이미지 조회
	 * @return List<BoardDTO>
	 */
	@PostMapping("/wit/getBoardDetailImageList")
    public List<BoardDTO> getBoardDetailImageList(@RequestBody HashMap<String, Object> paramMap) {
        return boardService.getBoardDetailImageList(paramMap);
    }	
	
	/**
	 * 게시판 조회수 증가
	 * @return int
	 */
	@PostMapping("/wit/boardRdCntUp")
    public int boardRdCntUp(@RequestBody HashMap<String, Object> paramMap) {
        return boardService.boardRdCntUp(paramMap);
    }
	
	/**
	 * 게시판 저장
	 * @return int
	 * @throws Exception 
	 */
	@PostMapping("/wit/saveBoardInfo")
    public int saveBoardInfo(@RequestBody HashMap<String, Object> paramMap) throws Exception {
		
		String bordNo = boardService.getNewBordNo(paramMap);
		paramMap.put("bordNo", bordNo);
		
		// 게시판 저장
		int result = boardService.saveBoardInfo(paramMap);
		
		if (result > 0) {
			
			// 파일 리스트
			List<HashMap<String, Object>> fileList = (List<HashMap<String, Object>>) paramMap.get("fileInfo");
			
			if (fileList != null && !fileList.isEmpty()) {
				
				// 파일 저장
				for (HashMap<String, Object> fileInfo : fileList) {
					fileInfo.put("bizCd", paramMap.get("bordType"));
	                fileInfo.put("bizKey", bordNo);
	                fileInfo.put("creUser", paramMap.get("creUser"));
	                fileInfo.put("updUser", paramMap.get("updUser"));
					
					int fileResult = boardService.saveFileInfo(fileInfo);
					
					logger.info("파일 등록 ::: " + fileResult);
				}
			}
		}
		
        return result;
    }
	
	/**
	 * 게시판 수정
	 * @return int
	 * @throws Exception 
	 */
	@PostMapping("/wit/updateBoardInfo")
    public int updateBoardInfo(@RequestBody HashMap<String, Object> paramMap) throws Exception {
		
		logger.info("boardService updateBoardInfo 호출");
		
		// 게시판 수정
		int result = boardService.updateBoardInfo(paramMap);
		
		if (result > 0) {
			
			// 파일 저장 리스트
			List<HashMap<String, Object>> fileList = (List<HashMap<String, Object>>) paramMap.get("fileInfo");
			
			if (fileList != null && !fileList.isEmpty()) {
			
				// 파일 저장
				for (int i = 0; i < fileList.size(); i++) {
					
					HashMap<String, Object> fileInfo = fileList.get(i);
					fileInfo.put("bizCd", paramMap.get("bordType"));
					fileInfo.put("bizKey", paramMap.get("bordNo"));
					fileInfo.put("creUser", paramMap.get("creUser"));
					fileInfo.put("updUser", paramMap.get("updUser"));
					
					int fileResult = boardService.saveFileInfo(fileInfo);
					
					logger.info("파일 등록 ::: " + fileResult);
				}
			}
			
			// 파일 삭제 리스트
			List<String> fileDelList = (List<String>) paramMap.get("fileDelInfo");
			
			if (fileDelList != null && !fileDelList.isEmpty()) {
				
				// 파일 삭제
				for (String fileDelInfo : fileDelList) {
					HashMap<String, Object> delParam = new HashMap<String, Object>();
					delParam.put("fileId", fileDelInfo.split("/")[3]);
					int fileDelResult = boardService.deleteFileInfo(delParam);
					
					logger.info("파일 삭제 ::: " + fileDelResult);
					
					if (fileDelResult > 0) {
						File delFile = new File("/ibjujundev/tomcat/webapps/FILE/ibjujun/Board/" + fileDelInfo.split("/")[3]);
						Boolean delFlag =  delFile.delete();
						
						logger.info("파일 삭제 ::: " + delFlag);
						
					}
				}
			}
		}
		
        return result;
    }
	
	/**
	 * 작성글 종료
	 * @return int
	 * @throws Exception 
	 */
	@PostMapping("/wit/endBoardInfo")
    public int endBoardInfo(@RequestBody HashMap<String, Object> paramMap) throws Exception {
		
		String bordNo = (String) paramMap.get("bordNo");
		
		logger.info("boardService endBoardInfo 호출");
		logger.info("bordNo : " + bordNo);
		
		// 게시판 댓글 종료
		int result1 = boardService.endCommentList(paramMap);
		
		logger.info("댓글 종료 ::: " + result1);
		
		// 작성글 종료
		int result2 = boardService.endBoardInfo(paramMap);
		
		logger.info("게시판 종료 ::: " + result2);
		
        return result2; 
    }
	
	
	/**
	 * 댓글 리스트 조회
	 * @return int
	 */
	@PostMapping("/wit/getCommentList")
    public List<CommentDTO> getCommentList(@RequestBody HashMap<String, Object> paramMap) {
		
		logger.info("boardService getCommentList 호출");
		
		return boardService.getCommentList(paramMap);
    }
	
	/**
	 * 댓글 저장
	 * @return int
	 */
	@PostMapping("/wit/saveCommentInfo")
    public List<CommentDTO> saveCommentInfo(@RequestBody HashMap<String, Object> paramMap) {
		
		logger.info("boardService saveCommentInfo 호출");
		
		int result = boardService.saveCommentInfo(paramMap);
		
		logger.info("댓글 저장 ::: " + result);
		
        return boardService.getCommentList(paramMap);
    }
	
	/**
	 * 댓글 종료
	 * @return int
	 */
	@PostMapping("/wit/endCommentInfo")
    public int endCommentInfo(@RequestBody HashMap<String, Object> paramMap) {
		
		logger.info("boardService endCommentInfo 호출");
		
		int result = boardService.endCommentInfo(paramMap);
		
		logger.info("댓글 삭제 ::: " + result);
		
        return result;
    }
	
	/**
	 * 파일 저장
	 * @return int
	 * @throws Exception
	 */
	@PostMapping("/wit/fileUpload")
    public List<HashMap<String, Object>> fileUpload(@RequestParam("images") MultipartFile[] fileList) throws Exception {
		
		logger.info("boardService fileUpload 호출");
		
		List<HashMap<String, Object>> fileParamList = new ArrayList<HashMap<String, Object>>();
		
		for (MultipartFile file : fileList) {
			
			logger.info("file.getOriginalFilename() :::" + file.getOriginalFilename());
			logger.info("file.getName() :::" + file.getName());
			logger.info("file.getSize() :::" + file.getSize());
			
			// 저장할 경로 설정
			String filePath = "/ibjujundev/tomcat/webapps/FILE/ibjujun/Board/";
			
			File directory = new File(filePath);
	        if (!directory.exists()) {
	            directory.mkdirs();
	        }
			
            file.transferTo(new File(filePath + file.getOriginalFilename()));
            
            HashMap<String, Object> fileParam = new HashMap<String, Object>();
            fileParam.put("fileId", file.getOriginalFilename());
            fileParam.put("fileNm", file.getName());
            fileParam.put("fileLoc", "/WIT/Board/");
            fileParam.put("fileSize", file.getSize());
            fileParamList.add(fileParam);
		}
		
        return fileParamList;
    }
	
	/**
	 * 신고하기
	 * @return int
	 */
	@PostMapping("/wit/boardSendReport")
    public int boardSendReport(@RequestBody HashMap<String, Object> paramMap) {
		
		logger.info("boardService boardSendReport 호출");
		
		// 기신고건 있는지 체크
		int checkResult = boardService.checkSendReport(paramMap);
		if (checkResult > 0) {
			return -2;
		}
		// 신규 신고 등록
		int result = boardService.boardSendReport(paramMap);
		
		logger.info("게시글 신고 ::: " + result);
		
        return result;
    }
	
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * 게시판 신고 리스트 조회
	 * @param paramMap
	 * @return List<BoardReportDTO>
	 */
	@PostMapping("/wit/getBoardReportList")
    public List<BoardReportDTO> getBoardReportList(@RequestBody HashMap<String, Object> paramMap) {
        return boardService.getBoardReportList(paramMap);
    }
	
}