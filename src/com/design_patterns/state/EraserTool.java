package com.design_patterns.state;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something");
    }
}
