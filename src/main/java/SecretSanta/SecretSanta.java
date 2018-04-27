package SecretSanta;

import java.util.Random;
import java.util.Scanner;

public class SecretSanta {
    private static SecretSanta ourInstance = new SecretSanta();

    public static SecretSanta getInstance() {
        return ourInstance;
    }

    private SecretSanta() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 - Create an account");
            System.out.println("2 - Create a Game");
            System.out.println("3 - Add Players to Game");
            System.out.println("6 - Quit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    // Perform "Create Account" case.
                    System.out.println("Create Account");
                    System.out.println("Please enter a user name");
                    scan.nextLine();
                    String name = scan.nextLine();
                    Player myPlayer = new Player(name);
                    UserInventory.getInstance().addAccount(myPlayer);
                    System.out.print("Hi " + myPlayer.getPlayerName());
                    System.out.println(", your account number is " + myPlayer.getPlayerId());
                    break;
                case 2:
                    // Perform "Create Game" case.
                    System.out.println("Create Game");
                    System.out.println("Please enter a Game name");
                    scan.nextLine();
                    String gameName = scan.nextLine();
                    Game myGame = new Game(gameName);
                    System.out.print("Hi, game created: " + myGame.getGameName());
                    System.out.println(", your game ID is " + myGame.getGameID());
                    break;
                case 3:
                    // Perform "Add Users to Game" case.
                    System.out.println("Add Users to Game");
                    System.out.println("Please enter <GameID> <PlayerID>");
                    scan.nextLine();
                    String[] gameName = scan.nextLine().split();
                    Game myGame = new Game(gameName);
                    System.out.print("Hi, game created: " + myGame.getGameName());
                    System.out.println(", your game ID is " + myGame.getGameID());
                    break;
                case 6:
                    // Perform "Discover Your Recipient" case.
                    System.out.println("Quit");
                    break;
                default:
                    // The user input an unexpected choice.
            }
        }
        while (choice != 6);
        scan.close();

        UserInventory.getInstance().listAccounts();
    }

    public static int createID(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
