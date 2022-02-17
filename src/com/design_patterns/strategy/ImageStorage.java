package com.design_patterns.strategy;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply();
        System.out.println("Storing file " + fileName + " in the disk storage");
    }
}
