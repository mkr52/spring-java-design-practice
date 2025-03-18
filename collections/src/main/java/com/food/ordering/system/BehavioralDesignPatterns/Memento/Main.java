package com.food.ordering.system.BehavioralDesignPatterns.Memento;

public class Main {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.write("The Memento Design Pattern\n");

        textEditor.write("How to implement it in Java?\n");

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
