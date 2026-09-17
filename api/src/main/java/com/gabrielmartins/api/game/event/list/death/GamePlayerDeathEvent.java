package com.gabrielmartins.api.game.event.list.death;

import com.gabrielmartins.api.game.Game;
import com.gabrielmartins.api.game.event.GameEvent;
import com.gabrielmartins.api.game.player.GamePlayer;
import lombok.Getter;

@Getter
public final class GamePlayerDeathEvent extends GameEvent {

    private final GamePlayer player;
    private final GamePlayer killer;

    private boolean cancelled;

    public GamePlayerDeathEvent(
            final Game game,
            final GamePlayer player,
            final GamePlayer killer
    ) {
        super(game);

        this.player = player;
        this.killer = killer;
    }

    public void cancel() {
        this.cancelled = true;
    }

}