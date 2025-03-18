package com.food.ordering.system.BehavioralDesignPatterns.Memento;

public class TextEditor {

    private String content;

    public void write(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }

    // Save the current state of the TextEditor object by creating memento object
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    // Restore the state of the current content
    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }

}
