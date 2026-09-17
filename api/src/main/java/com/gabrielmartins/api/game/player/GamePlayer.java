package com.gabrielmartins.api.game.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public final class GamePlayer {

    private final UUID uniqueId;
    private final String name;

}