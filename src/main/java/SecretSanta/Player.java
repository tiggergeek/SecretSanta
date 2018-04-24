package SecretSanta;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    private String playerName;
    private String nickName;
    private int playerId;
    private String password;
    private ArrayList<Integer> gamesOwned;
    private ArrayList<Integer> gamesPlaying;

    Player(String playerName) {
        this.playerId = GameHelper.createID(10000, 100000);
        this.playerName = playerName;
    }




}
