package com.gabrielmartins.api.game.event.list.start;

import com.gabrielmartins.api.game.Game;
import com.gabrielmartins.api.game.event.GameEvent;

public final class GameStartEvent extends GameEvent {

    public GameStartEvent(final Game game) {
        super(game);
    }

}