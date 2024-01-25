package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BoardService;
import vo.BoardRequest;
import vo.BoardResponse;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardApiController {

    private final BoardService boardService;

    public BoardApiController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 전체 게시글 목록 조회
    @GetMapping("/boardList")
    public List<BoardResponse> getAllBoardList() {
        return boardService.getAllBoardList();
    }

    // 게시글 작성
    @PostMapping("/write")
    public BoardResponse createBoard(@RequestBody BoardRequest boardRequest){
        return boardService.createBoard(boardRequest);

    }


}

