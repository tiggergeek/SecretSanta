//package SecretSanta;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class GameHelper {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Game myGame = new Game();
//        int choice;
//        do {
//            System.out.println("1 - Create Game");
//            System.out.println("2 - Add Player");
//            System.out.println("3 - Add Player Preferences");
//            System.out.println("4 - Allocate Gifters");
//            System.out.println("5 - Discover Your Recipient");
//            System.out.println("6 - Quit");
//            choice = scan.nextInt();
//            switch (choice) {
//                case 1:
//                    // Perform "Create Game" case.
//                    System.out.println("Create Game");
//                    scan.nextLine();
//                    myGame.defineGame(scan);
//                    System.out.print("In game " + myGame.getGameName() + " ");
//                    System.out.print("there are " + myGame.getNumberOfPlayers() + " players, each of whom ");
//                    System.out.println("has " + myGame.getNumberOfChoices() + " choices.");
//                    break;
//                case 2:
//                    // Perform "Add Player" case.
//                    System.out.println("Add Players");
//                    scan.nextLine();
//                    for (int i = 0; i < myGame.getNumberOfPlayers(); i++) {
//                        System.out.println("Please enter your first name, player " + i);
//                        myGame.players.add(new Person());
//                        myGame.players.get(i).setFirstName(scan.nextLine());
//                        System.out.println(myGame.players.get(i).getFirstName() + " is player " + i);
//                    }
//                    break;
//                case 3:
//                    // Perform "Add Player Preferences" case.
//                    System.out.println("Add Player Preferences");
//                    System.out.println("Which player do you want to update?");
//                    System.out.println("Enter a number between 0 and " + myGame.getNumberOfPlayers());
////                    scan.nextLine();
//                    try {
//                        int thisPlayer = scan.nextInt();
//
//                        for (int j = 0; j < myGame.getNumberOfChoices(); j++) {
//                            myGame.players.get(thisPlayer).setChoice(scan.nextLine());
//                            System.out.println("Choice " + j + " is" + myGame.players.get(thisPlayer).getChoice(j));
//                        }
//                    } catch (ArithmeticException e) {
//                     /* This block will only execute if any Arithmetic exception
//                      * occurs in try block
//                      */
//                        System.out.println("You should not divide a number by zero");
//                    } catch (Exception e) {
//                     /* This is a generic Exception handler which means it can handle
//                      * all the exceptions. This will execute if the exception is not
//                      * handled by previous catch blocks.
//                      */
//                        System.out.println("Exception occurred");
//                    }
//                    System.out.println("I'm out of try-catch block in Java.");
//                    break;
//                case 4:
//                    // Perform "Allocate Gifters" case.
//                    System.out.println("Allocate Gifters");
//                    scan.nextLine();
//                    break;
//                case 5:
//                    // Perform "Discover Your Recipient" case.
//                    System.out.println("Discover Your Recipient");
//                    scan.nextLine();
//                    break;
//                case 6:
//                    // Perform "Discover Your Recipient" case.
//                    System.out.println("Quit");
//                    break;
//                default:
//                    // The user input an unexpected choice.
//            }
//        }
//        while (choice != 6);
//        scan.close();
//    }
//
////    public static int createID(int min, int max) {
////
////        if (min >= max) {
////            throw new IllegalArgumentException("max must be greater than min");
////        }
////
////        Random r = new Random();
////        return r.nextInt((max - min) + 1) + min;
////    }
//
//}
