package com.design_patterns.memento;

import java.util.ArrayList;

public class History {

    private final ArrayList<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        this.states.add(state);
    }

    public EditorState pop() {
        int lastIndex = this.states.size() - 1;
        EditorState lastState = this.states.get(lastIndex);

        if (lastIndex == 0)
            return lastState;

        this.states.remove(lastState);
        return lastState;
    }
}
