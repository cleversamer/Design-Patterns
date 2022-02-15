package com.design_patterns.memento.exercise;

public class Main {

    public static void main(String[] args) {

        Document document = new Document();
        History history = new History();

        document.setContent("doc-1"); // Set the content to 'doc-1'
        document.setFontName("Roboto"); // Set the font name to 'Roboto'
        document.setFontSize(16); // Set the font size to 16px
        history.push(document.createState()); // Save changes to the history list

        System.out.println(document); // Print out the document object

        document.setContent("doc-2"); // Set the content to 'doc-2'
        document.setFontName("Comic Sans MS"); // Set the font name to 'Comic Sans MS'
        document.setFontSize(18); // Set the font size to 18px
        history.push(document.createState()); // Save changes to the history list

        System.out.println(document); // Print out the document object

        document.restoreContent(history.pop()); // Restore the previous content

        System.out.println(document); // Print out the document object

        document.setContent("doc-3"); // Set the content to 'doc-3'
        document.setFontName("Arial"); // Set the font name to 'Arial'
        document.setFontSize(24); // Set the font size to 24px
        history.push(document.createState()); // Save changes to the history list

        document.restoreAll(history.pop()); // Restore the previous changes

        System.out.println(document); // Print out the document object
    }
}
