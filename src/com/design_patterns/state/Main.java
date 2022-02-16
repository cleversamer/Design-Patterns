package com.design_patterns.state;

public class Main {

    public static void main(String[] args) {

        // We use this pattern to handle the app behaviour when state changes
        //
        // In this implementation, we are simulating a drawing app like photoshop
        // We are assuming that the canvas does have 3 tools (Brush tool, Erase tool, Selection tool)
        // The state of the application contains a single tool, and this tool gives the app
        // a special behaviour.
        // When the tool changes, the behaviour of the application also changes.
        //
        // This pattern uses the concept of abstraction to solve the problem.
        // We can use either an interface (As we have used), or an abstract class.

        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
