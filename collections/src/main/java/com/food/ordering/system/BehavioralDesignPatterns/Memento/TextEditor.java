package com.food.ordering.system.BehavioralDesignPatterns.Memento;

public class TextEditor {

    private String content;

    public void write(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }

}
