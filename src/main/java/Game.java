import java.util.Scanner;

public class Game {
    public static String getCharacterClass(int option){
        //take in the option 1/2/3 as the user input and return string array
        //this will have the logic and method outside the main so that i can test the code
        String[] characterClasses = {"Wizard", "Knight", "Wood Elf", "High Elf"};
        if ( option >= 1 && option <= 4) {
            return characterClasses[option - 1];
        }return null;
    }
    public static String getBoss(int option){
        String[] bossOptions = {"Dragon", "Dark Elf", "Cerberus", "Goblin"};
        if ( option >= 1 && option <= 4) {
            return bossOptions[option - 1];
        }return null;
    }
    public static Character createPlayer(String selectedClass) {
        Character player = null; //initialise the player to null and then assign it to the selected class with switch statement
        switch (selectedClass) {
            case "Wizard":
                player = new HumanCharacter.Wizard(selectedClass);
                break;
            case "Knight":
                player = new HumanCharacter.Knight(selectedClass);
                break;
            case "Wood Elf":
                player = new ElfCharacter.WoodElf(selectedClass);
                break;
            case "High Elf":
                player = new ElfCharacter.HighElf(selectedClass);
                break;
        }
        return player;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("""
                    +------------------------------------------------+
                    |       _                                        |
                    |      |  Hello and welcome to the D&D game!     |
                    |  O===[=====================================-   |
                    |      |_          Let's get started!            |
                    |                                                |
                    +------------------------------------------------+
                """);
        System.out.println("What is your name Adventurer? ");

        String playerName = input.nextLine();
        System.out.println("\nWelcome, " + playerName + "! Let's begin your D&D adventure!");
        System.out.println("");

        String selectedClass = "";
        String selectedBoss = "";

        boolean selectingCharacter = true;

        while (selectingCharacter) {
            System.out.println("""
                    +----------------------------------------------------+
                    | What character class would you like to choose?     |
                    |    -Please select from the following options-      |
                    |____________________________________________________|
                    |                                                    |
                    |   Option 1: Wizard      |   Option 2: Knight       |
                    |   Option 3: Wood Elf    |   Option 4: High Elf     |
                    |                                                    |
                    +----------------------------------------------------+
                    """);
            System.out.println();

            try {
                int characterOptions = input.nextInt();
                selectedClass = getCharacterClass(characterOptions);
                
                // Check if user input is right and continue with the selection
                if (characterOptions >= 1 && characterOptions <= 4) {
                    System.out.println("Congratulations " + playerName + " you have selected " + selectedClass + " as your character class");
                    System.out.println();
                    input.nextLine();

                    boolean confirmClass = true;

                    while (confirmClass) {
                        System.out.println("""
                                        +---------------------------------------------+
                                        |    Would you like to change character?      |
                                        |                  yes / no                   |
                                        +---------------------------------------------+
                                """);
                        String characterChange = input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!characterChange.equals("yes")) && (!characterChange.equals("no"))) {
                            System.out.println(characterChange + " This is an invalid response");
                            confirmClass = true; // keep asking the user the option question

                        } else if (characterChange.equals("yes")) {
                            System.out.println("Great");
                            confirmClass = false; // this would exist the inner loop
                            selectingCharacter = true; // and this would take you back to the character selection

                        } else if (characterChange.equals("no")) {
                            confirmClass = false; // Exit this inner loop
                            selectingCharacter = false; //Exit the outer loop
                        }
                    }
                } else {
                    // if the user inputs anything else Invalid option - show error and loop continues
                    System.out.println(characterOptions + " - Invalid option. Please try again.");
                }
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 3.");
                input.nextLine(); // Clear the scanner buffer
                selectingCharacter = true;

                System.out.println();
            }
        }
        //HumanCharacter player = new HumanCharacter(selectedClass);
        // Create player object with the selected class passed through with switch statement
        Character player = createPlayer(selectedClass);

        //System.out.println(selectedClass);

        boolean finalBoss = true;

        while (finalBoss) {
            System.out.println("""
                    +-----------------------------------------------+
                    |   What Final boss would you like to defeat?   |
                    |   -Please select from the following options-  |
                    |_______________________________________________|
                    |                                               |
                    |   Option 1: Dragon    |   Option 2: Dark Elf  |
                    |   Option 3: Cerberus  |   Option 4: Goblin    |
                    +-----------------------------------------------+
            """);
            try {
                int boosOption = input.nextInt();
                selectedBoss = getBoss(boosOption);
                
                // Check if user input is correct and continue with the selection
                if (boosOption >= 1 && boosOption <= 4) {
                    System.out.println("Congratulations " + playerName + " you have selected "+selectedBoss+ " as your final boss");
                    System.out.println();
                    input.nextLine();

                    boolean finalBossChange = true;
                    while (finalBossChange) {
                        System.out.println("""
                                        +---------------------------------------------+
                                        |  Would you like to change your final boss?  |
                                        |                  yes / no                   |
                                        +---------------------------------------------+
                                """);
                        String responseBossOption = input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!responseBossOption.equals("yes")) && (!responseBossOption.equals("no"))) {
                            System.out.println(responseBossOption + " This is an invalid response");

                            finalBossChange = true; // keep asking the user the option question
                        } else if (responseBossOption.equals("yes")) {
                            finalBossChange = false; // EXIT the inner loop
                            finalBoss = true; // keep asking the user the option question
                            
                        } else {
                            System.out.println("""
                                    +-------------------------------------------------+
                                    |       _                                         |
                                    |      |  Great, lets begin your adventure!       |
                                    |  O===[====================================-     |
                                    |      |_                                         |
                                    +-------------------------------------------------+
                            """);
                            finalBoss = false;
                            finalBossChange = false;
                            // Change this line when you want to exit the main character selection loop
                            MainStory.startStory(selectedClass, selectedBoss);// exit the option question loop and enter the main story arc
                        }
                    }
                } else {
                    // Invalid option - show error and loop continues
                    System.out.println(boosOption + " - Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 3.");
                input.nextLine(); // Clear the scanner buffer
                finalBoss = true;
            }
            System.out.println();
        }
    }
}