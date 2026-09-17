package com.gabrielmartins.api.game.event.list.damage;

import com.gabrielmartins.api.game.Game;
import com.gabrielmartins.api.game.event.GameEvent;
import com.gabrielmartins.api.game.player.GamePlayer;
import lombok.Getter;

@Getter
public final class GamePlayerDamageEvent extends GameEvent {

    private final GamePlayer player;
    private final GamePlayer damager;

    private double damage;
    private boolean cancelled;

    public GamePlayerDamageEvent(
            final Game game,
            final GamePlayer player,
            final GamePlayer damager,
            final double damage
    ) {
        super(game);

        this.player = player;
        this.damager = damager;
        this.damage = damage;
    }

    public void setDamage(final double damage) {
        this.damage = Math.max(0.0D, damage);
    }

    public void cancel() {
        this.cancelled = true;
    }

}