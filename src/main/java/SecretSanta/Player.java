package SecretSanta;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    Player(String playerName) {
        this.playerId = SecretSanta.createID(10000, 100000);
        this.playerName = playerName;
    }

    private String playerName;
    private String nickName;
    private int playerId;
    private String password;
    private ArrayList<Integer> gamesOwned;
    private ArrayList<Integer> gamesPlaying;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getGamesOwned() {
        return gamesOwned;
    }

    public void setGamesOwned(ArrayList<Integer> gamesOwned) {
        this.gamesOwned = gamesOwned;
    }

    public ArrayList<Integer> getGamesPlaying() {
        return gamesPlaying;
    }

    public void setGamesPlaying(ArrayList<Integer> gamesPlaying) {
        this.gamesPlaying = gamesPlaying;
    }


}
