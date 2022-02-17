package com.design_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private final List<String> urls = new ArrayList<>();

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        if (urls.isEmpty()) return null;
        int lastUrlIndex = urls.size() - 1;
        String lastUrl = urls.get(lastUrlIndex);
        urls.remove(lastUrlIndex);
        return lastUrl;
    }

    public static class ListIterator implements Iterator {

        private final BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
            this.index = 0;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index <= (history.urls.size() - 1);
        }
    }
}
