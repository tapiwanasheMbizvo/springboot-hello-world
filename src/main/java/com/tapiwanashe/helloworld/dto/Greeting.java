package com.tapiwanashe.helloworld.dto;

public class Greeting{
    private String title;
    private String sentence;

    public Greeting(String title, String sentence) {
        this.title = title;
        this.sentence = sentence;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", sentence='" + getSentence() + "'" +
            "}";
    }


}