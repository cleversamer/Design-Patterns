package com.design_patterns.strategy;

public class BlackAndWhite implements Filter {

    @Override
    public void apply() {
        System.out.println("Applying black and white filter");
    }
}
