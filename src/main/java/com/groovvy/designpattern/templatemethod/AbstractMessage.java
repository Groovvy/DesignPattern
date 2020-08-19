package com.groovvy.designpattern.templatemethod;

/**
 * @author wanghuaan
 * @date 2020/8/19
 **/
public abstract class AbstractMessage {

    private String to;

    private String content;

    private String date;

    private String from;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public AbstractMessage(String to, String content, String date, String from) {
        this.to = to;
        this.content = content;
        this.date = date;
        this.from = from;
    }

    public abstract void writeHead();

    public  void writeBody(){
        System.out.println("内容:"+this.content);
    }

    public abstract void writeTail();

    public void showMessage(){
        writeHead();
        writeBody();
        writeTail();
    }
}
