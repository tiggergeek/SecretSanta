package SecretSanta;

import java.util.ArrayList;
import java.util.Scanner;

class Game {

    String getGameName() {
        return gameName;
    }

    void setGameName(String gameName) {
        this.gameName = gameName;
    }

    int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    int getNumberOfChoices() {
        return numberOfChoices;
    }

    void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }

    String gameName;
    int numberOfPlayers;
    int numberOfChoices;

    ArrayList<Person> players = new ArrayList<Person>();

    void defineGame(Scanner scan){
//        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of this game");
        setGameName(scan.nextLine());
        System.out.println("How many players are there?");
        setNumberOfPlayers(scan.nextInt());
        System.out.println("How many choices does each player get?");
        setNumberOfChoices(scan.nextInt());
        scan.nextLine(); // consumes remainder of line in prep for next read
//        scan.close();
    }
}
