package com.gabrielmartins.api.game;

import com.gabrielmartins.api.game.player.GamePlayer;
import com.gabrielmartins.api.game.state.GameState;
import com.google.gson.JsonObject;
import lombok.Getter;

import java.util.Collection;
import java.util.UUID;

@Getter
public abstract class Game {

    private final UUID uniqueId;
    private final String id;

    private GameState state;

    private final Collection<GamePlayer> players;
    private final Collection<GamePlayer> spectators;

    protected Game(
            final UUID uniqueId,
            final String id
    ) {
        this.uniqueId = uniqueId;
        this.id = id;

        this.state = GameState.WAITING;

        this.players = new java.util.HashSet<>();
        this.spectators = new java.util.HashSet<>();
    }

    /**
     * Loads the game configuration and prepares its resources.
     *
     * @param jsonObject game configuration
     */

    public abstract void load(JsonObject jsonObject);

    /**
     * Checks whether the game has reached a win condition.
     */

    public abstract void verifyWin();

}