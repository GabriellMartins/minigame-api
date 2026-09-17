package com.gabrielmartins.api.game.state;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameState {

    WAITING("Aguardando jogadores"),
    STARTING("Iniciando partida"),
    PLAYING("Partida em andamento"),
    ENDING("Finalizando partida"),
    RESETTING("Resetando partida");

    private final String description;
}