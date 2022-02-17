package com.design_patterns.strategy;

public class JPEGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing file '" +  fileName + "' using JPEG algorithm");
    }
}
