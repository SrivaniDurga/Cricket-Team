/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import com.example.player.PlayerService;


@RestController
public class PlayerController{
    PlayerService ps = new PlayerService();
    @GetMapping("/players")
    public ArrayList<Player> getAllPlayers(){
        return ps.getPlayers();
    }
    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable ("playerId") int playerId){
        return ps.getPlayerById(playerId);
    }
    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player singlePlayer){
        return ps.addPlayer(singlePlayer);
    }
    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable ("playerId") int playerId,@RequestBody Player singlePlayer ){
        return ps.updatePlayer(playerId , singlePlayer);
    }
    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable ("playerId") int playerId){
        ps.deletePlayer(playerId);
    }
}