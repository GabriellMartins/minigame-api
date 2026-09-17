package com.gabrielmartins.api.game.event.list.join;

import com.gabrielmartins.api.game.Game;
import com.gabrielmartins.api.game.event.GameEvent;
import com.gabrielmartins.api.game.player.GamePlayer;
import lombok.Getter;

@Getter
public final class GamePlayerQuitEvent extends GameEvent {

    private final GamePlayer player;

    public GamePlayerQuitEvent(
            final Game game,
            final GamePlayer player
    ) {
        super(game);

        this.player = player;
    }

}