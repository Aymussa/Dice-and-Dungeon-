package src.main.dungeon;
import java.util.Scanner;



    public class Game {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello and welcome to the D&D game!");
            System.out.println("Let's get started!");

            System.out.print("What is your name? ");
            String name = scanner.nextLine();
            System.out.println("\nWelcome, " + name + "! Let's begin your D&D adventure!");


            try {


            } catch (Exception e) {
                System.out.println("\nAn error occurred reading input. Using default name.");
                name = "Adventurer";
                System.out.println("Welcome, " + name + "! Let's begin your D&D adventure!");
            } finally {
                scanner.close();
//                String rolling = (int) (Math.random() * 6) + 1;
//                rollingdice.dice(6);
                Dice.dice(6);
//                System.out.println("You rolled a "+ Dice.dice(6));

//            System.out.println("\nThank you for p/**/laying, your number is : " + Dice.dice(6));
            }
        }
    }

