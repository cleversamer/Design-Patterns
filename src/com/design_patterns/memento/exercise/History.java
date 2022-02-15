package com.design_patterns.memento.exercise;

import com.design_patterns.memento.implementation.EditorState;

import java.util.ArrayList;

public class History {

    private final ArrayList<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        this.states.add(state);
    }

    public DocumentState pop() {
        int lastIndex = this.states.size() - 1;
        DocumentState lastState = this.states.get(lastIndex);

        if (lastIndex == 0)
            return lastState;

        this.states.remove(lastState);
        return lastState;
    }
}
