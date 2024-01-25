package Repository;

import org.springframework.stereotype.Repository;
import vo.BoardRequest;
import vo.BoardResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BoardRepository {
    private static List<HashMap<String, String>> storeList;
    public BoardRepository(){

    }

    public List<BoardResponse> findAll() {

        List<BoardResponse> returnList =  new ArrayList<>();

        for (HashMap<String, String> stringStringHashMap : storeList) {
            BoardResponse boardResponse = new BoardResponse();
            boardResponse.setTitle(stringStringHashMap.get("title"));
            boardResponse.setWriteContent(stringStringHashMap.get("content"));
            boardResponse.setWriterName(stringStringHashMap.get("writerName"));
            boardResponse.setWriteDate(LocalDateTime.parse(stringStringHashMap.get("writeDate")));

            returnList.add(returnList.size(), boardResponse);
        }

        return returnList;
    }

    public BoardResponse save(BoardRequest boardRequest){
        HashMap<String, String> storeMap = new HashMap<>();

        storeMap.put("title", boardRequest.getTitle());
        storeMap.put("content", boardRequest.getWriteContent());
        storeMap.put("writerName", boardRequest.getWriterName());
        storeMap.put("writeDate", boardRequest.getWriteDate().toString());

        storeList.add(storeList.size(), storeMap);

        // todo : 사실 저장된걸 가져오는 서비스를 호출했어야 됨
        BoardResponse boardResponse = new BoardResponse();
        boardResponse.setTitle(boardRequest.getTitle());
        boardResponse.setWriteContent(boardRequest.getWriteContent());
        boardResponse.setWriterName(boardRequest.getWriterName());
        boardResponse.setWriteDate(boardRequest.getWriteDate());

        return boardResponse;

    }

}
