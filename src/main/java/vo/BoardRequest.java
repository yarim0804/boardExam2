package vo;

import java.time.LocalDateTime;

public class BoardRequest{

    private String title;
    private String writerName;
    private String writeContent;
    private LocalDateTime writeDate;

    public String getWriteContent() {
        return writeContent;
    }

    public String getWriterName() {
        return writerName;
    }

    public LocalDateTime getWriteDate() {
        return writeDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriteContent(String writeContent) {
        this.writeContent = writeContent;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }
}
