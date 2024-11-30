package com.wit.inspaction.board;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wit.inspaction.board.model.BoardDTO;
import com.wit.inspaction.board.model.CommentDTO;
import com.wit.inspaction.board.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * 게시판 리스트 조회
	 * @return List<BoardDTO>
	 */
	@PostMapping("/wit/getBoardList")
    public List<BoardDTO> getBoardList(@RequestBody HashMap<String, Object> paramMap) {
    	
		System.out.println("boardService getBoardList 호출"); 
		System.out.println("bordNo ::: " + paramMap.get("bordNo"));
		System.out.println("bordType ::: " + paramMap.get("bordType"));
		System.out.println("searchText ::: " + paramMap.get("searchText"));
		System.out.println("currentPage ::: " + paramMap.get("currentPage"));
		System.out.println("pageSize ::: " + paramMap.get("pageSize"));
		
		List<BoardDTO> boardList = boardService.getBoardList(paramMap);
		
		System.out.println("게시판 리스트 ::: " + boardList.size());
		
        return boardList;
    }
	
	/**
	 * 게시판 상세 조회
	 * @return BoardDTO
	 */
	@PostMapping("/wit/getBoardDetailInfo")
    public BoardDTO getBoardDetailInfo(@RequestBody HashMap<String, Object> paramMap) {
    	
		System.out.println("boardService getBoardDetailInfo 호출");
		
		BoardDTO boardInfo = boardService.getBoardDetailInfo(paramMap);
		
        return boardInfo;
    }
	
	/**
	 * 게시판 상세 이미지 조회
	 * @return List<BoardDTO>
	 */
	@PostMapping("/wit/getBoardDetailImageList")
    public List<BoardDTO> getBoardDetailImageList(@RequestBody HashMap<String, Object> paramMap) {
    	
		System.out.println("boardService getBoardDetailImageList 호출");
		
		List<BoardDTO> boardImageInfo = boardService.getBoardDetailImageList(paramMap);
		
        return boardImageInfo;
    }	
	
	/**
	 * 게시판 조회수 증가
	 * @return int
	 */
	@PostMapping("/wit/boardRdCntUp")
    public int boardRdCntUp(@RequestBody HashMap<String, Object> paramMap) {
    	
		System.out.println("boardService boardRdCntUp 호출");
		
		int result = boardService.boardRdCntUp(paramMap);
		
        return result;
    }
	
	/**
	 * 게시판 저장
	 * @return int
	 * @throws Exception 
	 */
	@PostMapping("/wit/saveBoardInfo")
    public int saveBoardInfo(@RequestBody HashMap<String, Object> paramMap) throws Exception {
		
		System.out.println("boardService saveBoardInfo 호출");
		
		// 게시판 번호 조회
//		／／int bordNo = boardService.getNewBordNo(paramMap);
		
		String bordNo = paramMap.get("bordNo") == null ? "" : (String) paramMap.get("bordNo");
		
		paramMap.put("bordNo", bordNo);
		paramMap.put("bordSubTitle","22");
		System.out.println("게시판 번호 ::: " + paramMap.get("bordNo"));
		System.out.println("게시판 bordType ::: " + paramMap.get("bordType"));
		System.out.println("게시판 bordTitle ::: " + paramMap.get("bordTitle"));
		System.out.println("게시판 bordSubTitle ::: " + paramMap.get("bordSubTitle"));
		System.out.println("게시판 bordContent ::: " + paramMap.get("bordContent"));
		System.out.println("게시판 creUser ::: " + paramMap.get("creUser"));
		
		
		
	
		
		// 게시판 저장
		int result = boardService.saveBoardInfo(paramMap);
		
		System.out.println("resultresultresultresult ::: " + result);
		
		
		if (result > 0) {
			
			// 파일 Json
			String fileJson = (String) paramMap.get("fileInfo") == null ? "" : (String) paramMap.get("fileInfo");

			System.out.println("게시판 fileInfo ::: " + paramMap.get("fileInfo"));
			
			// JSON 문자열을 List<HashMap<String, Object>>로 변환
			
			if(!fileJson.isEmpty()) {
				ObjectMapper objectMapper = new ObjectMapper();
				List<HashMap<String, Object>> fileList = objectMapper.readValue(fileJson, new TypeReference<List<HashMap<String, Object>>>(){});
				
				// 파일 저장
				for (int i = 0; i < fileList.size(); i++) {
					
					HashMap<String, Object> fileInfo = fileList.get(i);
					fileInfo.put("bizCd", "B001");
					fileInfo.put("bizKey", bordNo);
					fileInfo.put("fileType", "01");
					fileInfo.put("creUser", "테스트");
					
					int fileResult = boardService.saveFileInfo(fileInfo);
					
					System.out.println("파일 등록 ::: " + fileResult);
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
		
		System.out.println("boardService updateBoardInfo 호출");
		
		// 게시판 수정
		int result = boardService.updateBoardInfo(paramMap);
		
		/*if (result > 0) {
			
			// 파일 Json
			String fileJson = (String) paramMap.get("fileInfo") == null ? "" : (String) paramMap.get("fileInfo");

			// JSON 문자열을 List<HashMap<String, Object>>로 변환
			ObjectMapper objectMapper = new ObjectMapper();
	        List<HashMap<String, Object>> fileList = objectMapper.readValue(fileJson, new TypeReference<List<HashMap<String, Object>>>(){});
			
			// 파일 저장
			for (int i = 0; i < fileList.size(); i++) {
				
				HashMap<String, Object> fileInfo = fileList.get(i);
				fileInfo.put("bizCd", "B001");
				fileInfo.put("bizKey", bordNo);
				fileInfo.put("fileType", "01");
				fileInfo.put("creUser", "테스트");
				
				int fileResult = boardService.saveFileInfo(fileInfo);
				
				System.out.println("파일 등록 ::: " + fileResult);
			}
			
		}*/
		
        return result;
    }
	
	/**
	 * 작성글 종료
	 * @return int
	 * @throws Exception 
	 */
	@PostMapping("/wit/endBoardInfo")
    public int endBoardInfo(@RequestBody HashMap<String, Object> paramMap) throws Exception {
		
		int bordNo = (int)paramMap.get("bordNo");
		int bordSeq = (int) paramMap.get("bordSeq");
		
		System.out.println("boardService endBoardInfo 호출");
		System.out.println("bordNo : " + bordNo);
		System.out.println("bordSeq : " + bordSeq);
		
		// 게시판 댓글 종료
		int result1 = boardService.endCommentList(paramMap);
		
		System.out.println("댓글 종료 ::: " + result1);
		
		// 작성글 종료
		int result2 = boardService.endBoardInfo(paramMap);
		
		System.out.println("게시판 종료 ::: " + result2);
		
        return result2; 
    }
	
	
	/**
	 * 댓글 리스트 조회
	 * @return int
	 */
	@PostMapping("/wit/getCommentList")
    public List<CommentDTO> getCommentList(@RequestBody HashMap<String, Object> paramMap) {
		
		System.out.println("boardService getCommentList 호출");
		
		return boardService.getCommentList(paramMap);
    }
	
	/**
	 * 댓글 저장
	 * @return int
	 */
	@PostMapping("/wit/saveCommentInfo")
    public List<CommentDTO> saveCommentInfo(@RequestBody HashMap<String, Object> paramMap) {
		
		System.out.println("boardService saveCommentInfo 호출");
		
		int result = boardService.saveCommentInfo(paramMap);
		
		System.out.println("댓글 저장 ::: " + result);
		
        return boardService.getCommentList(paramMap);
    }
	
	/**
	 * 파일 저장
	 * @return int
	 * @throws Exception
	 */
	@PostMapping("/wit/fileUpload")
    public List<HashMap<String, Object>> fileUpload(@RequestParam("images") MultipartFile[] fileList) throws Exception {
		
		System.out.println("boardService fileUpload 호출");
		
		List<HashMap<String, Object>> fileParamList = new ArrayList<HashMap<String, Object>>();
		
		for (MultipartFile file : fileList) {
			
			System.out.println("file.getOriginalFilename() :::" + file.getOriginalFilename());
			System.out.println("file.getName() :::" + file.getName());
			System.out.println("file.getSize() :::" + file.getSize());
			
			// 저장할 경로 설정
			String filePath = "D:/eclipse_node/eclipse-workspace/preinspaction/src/main/resources/file/WIT/" + file.getOriginalFilename();
            file.transferTo(new File(filePath));
            
            HashMap<String, Object> fileParam = new HashMap<String, Object>();
            fileParam.put("fileId", file.getOriginalFilename());
            fileParam.put("fileNm", file.getName());
            fileParam.put("fileLoc", "/WIT/");
            fileParam.put("fileSize", file.getSize());
            fileParamList.add(fileParam);
		}
		
        return fileParamList;
    }
	
}