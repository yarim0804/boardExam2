package vo;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDateTime;

public class BoardResponse {
    // 제목, 작성자명, 작성내용, 작성날짜
    private String title;
    private String writerName;
    private String writeContent;
    private LocalDateTime writeDate;

    public String getTitle() {
        return title;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getWriteContent() {
        return writeContent;
    }

    public LocalDateTime getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteContent(String writeContent) {
        this.writeContent = writeContent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }
}
