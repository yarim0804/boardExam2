package service;

import Repository.BoardRepository;
import vo.BoardRequest;
import vo.BoardResponse;

import java.util.List;

public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<BoardResponse> getAllBoardList(){

        return boardRepository.findAll();

    }

    public BoardResponse createBoard(BoardRequest boardRequest){
        boardRepository.save(boardRequest);

        return null;
    }
}
