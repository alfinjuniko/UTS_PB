package com.example.uts_pb;

public class Memo {
    private String title;
    private String content;

    public Memo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
