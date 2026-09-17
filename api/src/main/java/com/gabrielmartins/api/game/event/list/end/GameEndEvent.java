package com.gabrielmartins.api.game.event.list.end;

import com.gabrielmartins.api.game.Game;
import com.gabrielmartins.api.game.event.GameEvent;

public final class GameEndEvent extends GameEvent {

    public GameEndEvent(final Game game) {
        super(game);
    }

}