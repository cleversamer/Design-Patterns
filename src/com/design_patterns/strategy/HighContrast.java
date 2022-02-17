package com.design_patterns.strategy;

public class HighContrast implements Filter {

    @Override
    public void apply() {
        System.out.println("Applying high contrast filter");
    }
}
