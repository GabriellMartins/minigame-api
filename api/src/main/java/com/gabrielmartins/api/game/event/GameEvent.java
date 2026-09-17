package com.gabrielmartins.api.game.event;

import com.gabrielmartins.api.game.Game;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class GameEvent {

    private final Game game;

}