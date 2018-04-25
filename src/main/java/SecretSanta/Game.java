package SecretSanta;

import java.util.ArrayList;
import java.util.Scanner;

class Game {

    int gameID;
    String gameName;
    String gameDesc;
    int numChoices;
    int budget;
    int gameOwner;
    ArrayList<Integer> players;

    Game(String gameName) {
        this.gameName = gameName;
        this.gameID = GameHelper.createID(20000, 30000);
    }


//    ArrayList<Person> players = new ArrayList<Person>();
//
//    void defineGame(Scanner scan){
////        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter the name of this game");
//        setGameName(scan.nextLine());
//        System.out.println("How many players are there?");
//        setNumberOfPlayers(scan.nextInt());
//        System.out.println("How many choices does each player get?");
//        setNumberOfChoices(scan.nextInt());
//        scan.nextLine(); // consumes remainder of line in prep for next read
//        scan.close();
    }
