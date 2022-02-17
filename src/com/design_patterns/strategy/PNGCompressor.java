package com.design_patterns.strategy;

public class PNGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing file '" +  fileName + "' using PNG algorithm");
    }
}
