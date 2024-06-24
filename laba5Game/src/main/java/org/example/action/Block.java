package org.example.action;

import org.example.player.Fighter;

public class Block extends Action {

    @Override
    public String getType() {
        return "Block";
    }

    @Override
    public void realisation(Fighter fighter1, Fighter fighter2, String fighter2ActionType) {

    }
}

