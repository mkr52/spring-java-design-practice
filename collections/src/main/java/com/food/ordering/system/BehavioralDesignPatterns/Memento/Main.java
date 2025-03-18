package com.food.ordering.system.BehavioralDesignPatterns.Memento;


/**
 * The Memento pattern is a behavioral design pattern that provides the ability to restore an object to its previous state (undo via rollback).
 * <p>
 * The Memento pattern is implemented with three objects: the originator, a caretaker, and a memento. The originator is some object that has an internal state. The caretaker is going to do something to the originator, but wants to be able to undo the change. The caretaker first asks the originator for a memento object. Then it does whatever operation (or sequence of operations) it was going to do. To roll back to the state before the operations, it returns the memento object to the originator. The memento object itself is an opaque object (one which the caretaker cannot, or should not, change). When using this pattern, care should be taken if the originator may change other objects or resources - the memento pattern operates on a single object.
 * <p>
 * In this example, the TextEditor acts as the originator. It has a method to save its state, which returns a memento object. The TextEditor also has a method to restore its state from a memento object. The TextEditorMemento is the memento object. The TextEditorMemento has a method to return the saved state to the TextEditor.
 * <p>
 * The TextEditor class has a write method to set its content and a getContent method to get its content. The TextEditorMemento class has a constructor that takes the content to save. The TextEditorMemento class has a getContent method to return the saved content.
 * <p>
 * The Main class demonstrates the use of the Memento pattern. It creates a TextEditor object and writes two lines of text. It then prints the content of the TextEditor. It saves the state of the TextEditor to a memento object. It writes another line of text to the TextEditor and prints the content. It then restores the state of the TextEditor from the memento object and prints the content.
 * <p>
 * The output of the Main class is:
 * <p>
 * The Memento Design Pattern
 * How to implement it in Java?
 * The Memento Design Pattern
 * <p>
 */
public class Main {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker(); // responsible for managing the state/history of the TextEditor object

        textEditor.write("The Memento Design Pattern\n");
        careTaker.saveState(textEditor);

        textEditor.write("How to implement it in Java?\n");
        careTaker.saveState(textEditor);

        textEditor.write("Buy milk and eggs on your way home\n");
        careTaker.saveState(textEditor);

        System.out.println(textEditor.getContent());

        // Undo the last write
        System.out.println("---- Undoing the last write: ----- ");
        careTaker.undo(textEditor); // undo the last write
        careTaker.undo(textEditor); // undo the last two writes

        System.out.println(textEditor.getContent());

        // Save the state to restore to : The Memento Design Pattern
//        TextEditorMemento saved = textEditor.save();
//
//        textEditor.write("Buy milk and eggs on your way home\n");
//
//        System.out.println(textEditor.getContent());
//
//        // Restore to previous state
//        textEditor.restore(saved);
//
//        System.out.println(textEditor.getContent());
    }
}
