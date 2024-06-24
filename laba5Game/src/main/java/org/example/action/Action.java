package org.example.action;

import org.example.player.Fighter;

public abstract class Action {
    public abstract String getType();
    public abstract void realisation(Fighter fighter1, Fighter fighter2, String fighter2ActionType);
}
