package SecretSanta;

import java.util.ArrayList;

public class Game {

    int gameID;
    String gameName;
    String gameDesc;
    int numChoices;
    int budget;
    int gameOwner;
    ArrayList<Integer> players;

    Game(String gameName) {
        this.gameName = gameName;
        this.gameID = SecretSanta.createID(20000, 30000);
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDesc() {
        return gameDesc;
    }

    public void setGameDesc(String gameDesc) {
        this.gameDesc = gameDesc;
    }

    public int getNumChoices() {
        return numChoices;
    }

    public void setNumChoices(int numChoices) {
        this.numChoices = numChoices;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getGameOwner() {
        return gameOwner;
    }

    public void setGameOwner(int gameOwner) {
        this.gameOwner = gameOwner;
    }

    public ArrayList<Integer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Integer> players) {
        this.players = players;
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
