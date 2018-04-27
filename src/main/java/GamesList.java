import java.util.ArrayList;
import SecretSanta.Game;


public class GamesList {
    private static GamesList ourInstance = new GamesList();

    public static GamesList getInstance() {
        return ourInstance;
    }

    private GamesList() {
    }

    private static ArrayList<Game> Games = new ArrayList<Game>;

}
