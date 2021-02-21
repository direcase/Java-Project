package com.example.java_project;

public class Question {
    long id;
    int image;
    String question;
    String fist;
    String second;
    String third;
    String fourth;
    String correct;

    public Question(long id, int image, String question, String fist, String second, String third,String fourth, String correct) {
        this.id = id;
        this.image=image;
        this.question = question;
        this.fist = fist;
        this.second = second;
        this.third = third;
        this.fourth=fourth;
        this.correct = correct;
    }

    public long getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getQuestion() {
        return question;
    }

    public String getFist() {
        return fist;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public String getFourth() {
        return fourth;
    }

    public String getCorrect() {
        return correct;
    }
}
