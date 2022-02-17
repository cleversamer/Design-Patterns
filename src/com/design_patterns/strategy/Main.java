package com.design_patterns.strategy;

public class Main {

    public static void main(String[] args) {

        // We use this pattern to solve the problem of multi-states in the system
        // This pattern is very similar to the 'state pattern', it follows the same technique
        // But the difference between them is the 'state pattern' solves the problem when there is
        // a single state for an object.
        // But this pattern 'strategy pattern' solves the problem when there are two or more states
        // for a single object.
        //
        // In the 'state pattern', we have simulated a simple drawing app like photoshop,
        // and this app does have a single tool.
        // If we want to build a similar app, and we want to add something extra (not a drawing tool)
        // We should convert the 'state pattern' to a 'strategy pattern'.
        //
        // Here we are building an app that can compress, filter, and then store images

        ImageStorage storage = new ImageStorage();

        Compressor jpeg = new JPEGCompressor();
        Filter blackAndWhite = new BlackAndWhite();

        storage.store("avatar-pic", jpeg, blackAndWhite);
    }
}
