package SecretSanta;

import java.util.ArrayList;

public class UserInventory {
    private static UserInventory ourInstance = new UserInventory();

    public static UserInventory getInstance() {
        return ourInstance;
    }

    private static ArrayList<Player> Accounts = new ArrayList<Player>();

    private UserInventory() {
    }

    public void addAccount(Player player) {
        Accounts.add(player);
    }
    
    public void listAccounts() {
        for (Player player:Accounts) {
            System.out.println(player.getPlayerName());
        }
    }
}
