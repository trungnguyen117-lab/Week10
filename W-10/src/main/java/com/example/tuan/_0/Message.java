package com.example.tuan._0;

public class Message {
    private String id;
    private String content;
    private long timestamp;

    // Constructor mặc định (yêu cầu bởi Jackson)
    public Message() {}

    public Message(String id, String content, long timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{id='" + id + "', content='" + content + "', timestamp=" + timestamp + "}";
    }
}

