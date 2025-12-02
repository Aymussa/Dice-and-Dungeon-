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
        String[] bossOptions = {"Dragon", "Dark Elf", "Cerberus"};
        if ( option >= 1 && option <= 3) {
            return bossOptions[option - 1];
        }return null;
    }

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);


        System.out.println("""
                    +----------------------------------------------------+
                    |         Hello and welcome to the D&D game!         |
                    |                Let's get started!                  |
                    +----------------------------------------------------+
                """);
        System.out.println("What is your name Adventurer? ");

        String playerName = Input.nextLine();
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
                    | Option 1: Wizard         | Option 2: Knight        |
                    | Option 3: Wood Elf       | Option 4: High Elf      |
                    |                                                    |
                    +----------------------------------------------------+
                    """);
            System.out.println();

            try {
                int characterOptions = Input.nextInt();
                selectedClass = getCharacterClass(characterOptions);
                
                // Check if user input is right and continue with the selection
                if (characterOptions >= 1 && characterOptions <= 4) {
                    System.out.println("Congratulations " + playerName + " you have selected " + selectedClass + " as your character class");
                    System.out.println();//
                    Input.nextLine();

                    boolean confirmClass = true;

                    while (confirmClass) {
                        System.out.println("""
                                        +----------------------------------------------+
                                        | Would you like to change character? yes / no |
                                        +----------------------------------------------+
                                """);
                        String characterChange = Input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!characterChange.equals("yes")) && (!characterChange.equals("no"))) {
                            System.out.println(characterChange + " This is an invalid respond");
                            confirmClass = true; // keep asking the user the option question

                        } else if (characterChange.equals("yes")) {
                            System.out.println("Great");
                            confirmClass = false; // this would exist the inner loop
                            selectingCharacter = true;

                        } else if (characterChange.equals("no")) {
                            confirmClass = false; // EXIt this inner loop
                            selectingCharacter = false; //Exit the outer loop
                        }
                    }
                } else {
                    // if the user inputs anything else Invalid option - show error and loop continues
                    System.out.println(characterOptions + " - Invalid option. Please try again.");
                }
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 3.");
                Input.nextLine(); // Clear the scanner buffer
                selectingCharacter = true;

                System.out.println();
            }
        }
        
        //HumanCharacter player = new HumanCharacter(selectedClass);

        // Create player object with the selected class
        Character player;
        switch (selectedClass){
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
        System.out.println(selectedClass);

        boolean finalBoss = true;

        while (finalBoss) {
            System.out.println("""
                    +-----------------------------------------------------------------------+
                    |                                                                       |
                    |                   Great, Choose your final boss.                      |
                    |_______________________________________________________________________|
                    |                                                                       |
                    |   Option 1: Dragon   |   Option 2: Dark Elf  |    Option 3: Cerberus  |
                    +-----------------------------------------------------------------------+
            """);
            try {
                int boosOption = Input.nextInt();
                selectedBoss = getBoss(boosOption);
                
                // Check if user input is correct and continue with the selection
                if (boosOption >= 1 && boosOption <= 3) {
                    System.out.println("Congratulations " + playerName + " you have selected "+selectedBoss+ " as your final boss");
                    System.out.println();
                    Input.nextLine();

                    boolean finalBoosChange = true;
                    while (finalBoosChange) {
                        System.out.println("""
                                        +----------------------------------------------------+
                                        | Would you like to change your final boss? yes / no |
                                        +----------------------------------------------------+
                                """);
                        String responseBoosOption = Input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!responseBoosOption.equals("yes")) && (!responseBoosOption.equals("no"))) {
                            System.out.println(responseBoosOption + " This is an invalid respond");

                            finalBoosChange = true; // keep asking the user the option question
                        } else if (responseBoosOption.equals("yes")) {
                            finalBoosChange = false; // EXIT the inner loop
                            finalBoss = true; // keep asking the user the option question

                        } else {
                            System.out.println("""
                                    +--------------------------------------+
                                    |                                      |
                                    |   Great, lets begin your adventure!  |
                                    |                                      |
                                    +--------------------------------------+
                            """);
                            finalBoss = false;
                            finalBoosChange = false;
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
                Input.nextLine(); // Clear the scanner buffer
                finalBoss = true;
            }
            System.out.println();
        }
    }

}