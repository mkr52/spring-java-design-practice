package com.food.ordering.system.BehavioralDesignPatterns.Memento;

/**
 * Memento class
 * <p>
 *     This class is used to store the internal state of the {@link TextEditor} object.
 *     It is used to restore the state of the {@link TextEditor} object.
 *     The {@link TextEditor} object is the originator in this pattern.
 *     The {@link EditorMemento} object is the memento in this pattern.
 *     The {@link EditorMemento} object has a method to return the saved state to the {@link TextEditor}.
 *     The {@link TextEditor} object has a method to save its state, which returns a {@link EditorMemento} object.
 *     The {@link TextEditor} object also has a method to restore its state from a {@link EditorMemento} object.
 */
public class EditorMemento {

    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
