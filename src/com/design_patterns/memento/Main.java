package com.design_patterns.memento;

public class Main {

    public static void main(String[] args) {

        // We use this pattern to implement the UNDO mechanism.

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A"); // Set the content to A
        history.push(editor.createState()); // Save the content to history

        editor.setContent("B"); // Update the content to become B
        history.push(editor.createState()); // Push the new content to the history list

        editor.setContent("C"); // Update the content again to become C
        editor.restore(history.pop()); // Undo the last update we just made

        System.out.println(editor.getContent()); // Print out the current content

        editor.restore(history.pop()); // Undo again

        System.out.println(editor.getContent()); // Print out the current content

        editor.restore(history.pop()); // Undo again

        System.out.println(editor.getContent()); // Print out the current content
    }
}
