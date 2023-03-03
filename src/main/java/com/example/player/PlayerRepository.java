package com.example.player;
import java.util.*;

public interface PlayerRepository{
    ArrayList<Player> getPlayers();
    Player getPlayerById(int playerId);
    Player addPlayer(Player singlePlayer);
    Player updatePlayer(int playerId , Player singlePlayer);

    void deletePlayer(int playerId);
}
