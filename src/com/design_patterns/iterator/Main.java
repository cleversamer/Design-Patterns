package com.design_patterns.iterator;

public class Main {

    public static void main(String[] args) {

        // We use this pattern to solve the problem iterating over various types of lists
        // In the BrowseHistory class, we have used the ArrayList data structure to store the list of URLs
        // Let's imagine that we don't use the iterator pattern, and we have a built-in iterator functions
        // in the BrowseHistory class that deals with ArrayList.
        // What will happen if we decide to change the type of data structure we are using.
        // We may face a bunch of problems, because we was dealing with an ArrayList object.
        // And we will be dealing with another type of data structures that may have another functions.
        //
        // We have 3 main functions to deal with in our system (current, next, hasNext)
        // So to avoid the problem that we have explained before, we have used the concept of abstraction
        // to solve this problem.
        //
        // So we have an iterator object that is a super-class of ListIterator, and in the future if we want to
        // change the ArrayList to for example an Array, we will be building a new class that implements the
        // Iterator interface, and we will be still having the 3 main methods.
        // But they are dealing with Array, not ArrayList.

        BrowseHistory history = new BrowseHistory();
        history.push("A");
        history.push("B");
        history.push("C");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
