package com.food.ordering.system.BehavioralDesignPatterns.Memento;

import java.util.Stack;

/**
 * The CareTaker class
 * <p>
 *     This class is used to store the mementos(snapshots) of the {@link TextEditor} object.
 *     It is used to store the state of the {@link TextEditor} object.
 *     Managing the state of the {@link TextEditor} object is the responsibility of the {@link CareTaker} object.
 *     The {@link CareTaker} object has a list of {@link EditorMemento} objects.
 *     The {@link CareTaker} object has methods to add and retrieve {@link EditorMemento} objects.
 *     The {@link CareTaker} object is the caretaker in this pattern.
 *  </p>
 */
public class CareTaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            history.pop();
            textEditor.restore(history.peek());
        }
    }
}
