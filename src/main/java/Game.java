import java.util.Scanner;
/*
 * This is where i create a Game class, which will have the logic and method outside the main so that i can test the code
 */
public class Game {
    public static String getCharacterClass(int option){
        /*
        *This method is used to take in the option 1/2/3/4 as the user input and return string array
        */
        String[] characterClasses = {"Wizard", "Knight", "Wood Elf", "High Elf"};
        if ( option >= 1 && option <= 4) {
            return characterClasses[option - 1];
        }return null;
    }

    //Created this method to create the player object with the selected class passed through with switch statement
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
    /**
     *This method is used to take in the option 1/2/3/4 as the user input and return string array
     */
    public static String getBoss(int option){
        String[] bossOptions = {"Dragon", "Dark Elf", "Cerberus", "Goblin"};
        if ( option >= 1 && option <= 4) {
            return bossOptions[option - 1];
        }return null;
    }
    /**
     * This method is used to create the boss object with the selected boss passed through with switch statement
     */
    public static Character createBoss(String selectedBoss) {
        Character boss = null; //initialise the boss to null and then assign it to the selected boss with switch statement
        switch (selectedBoss) {
            case "Dragon":
                boss = new BossCharacter.Dragon(selectedBoss);
                break;
            case "Dark Elf":
                boss = new BossCharacter.DarkElf(selectedBoss);
                break;
            case "Cerberus":
                boss = new BossCharacter.Cerberus(selectedBoss);
                break;
            case "Goblin":
                boss = new BossCharacter.Goblin(selectedBoss);
                break;
        }
        return boss;
    }

    /**
     * This starts the game Class. Main method to run the game.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
            +------------------------------------------------+
            |       _                                        |
            |      |  Hello and welcome to the D&D game!     |
            |  O===[=====================================-   |
            |      |_         Let's get started!             |
            |                                                |
            +------------------------------------------------+
            """);
        System.out.println("What is your name Adventurer? ");

        String playerName = input.nextLine();
        System.out.println("Welcome, " + playerName + "! Let's begin your D&D adventure!\n");

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
                    +----------------------------------------------------+
                    """);
            try {
                int characterOptions = input.nextInt();
                selectedClass = getCharacterClass(characterOptions);

                if (characterOptions >= 1 && characterOptions <= 4) {
                    System.out.println("Congratulations " + playerName + " you have selected " + selectedClass+ " as your character class");
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

                        if ((!characterChange.equals("yes")) && (!characterChange.equals("no"))&&(!characterChange.equals("y"))&&(!characterChange.equals("n"))) {
                            System.out.println(characterChange + " This is an invalid response. Please write yes or no.(y/n)");
                            confirmClass = true;

                        } else if (characterChange.equals("yes")||characterChange.equals("y")) {
                            confirmClass = false;
                            selectingCharacter = true;

                        } else if (characterChange.equals("no")||characterChange.equals("n")) {
                            confirmClass = false;
                            selectingCharacter = false;
                        }
                    }
                } else {
                    System.out.println(characterOptions + " - Invalid option. Please try again. Please enter a number between 1 - 4.");
                }
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 4.");
                input.nextLine();
                selectingCharacter = true;

                System.out.println();
            }
        }
        // Create player object with the selected class passed through with switch statement

        // Main method calls the createPlayer method and passes the selectedClass to the player object
        Character player = createPlayer(selectedClass);

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

                if (boosOption >= 1 && boosOption <= 4) {
                    System.out.println("Congratulations " + playerName + " you have selected "+ selectedBoss + " as your final boss");
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

                        if ((!responseBossOption.equals("yes")) && (!responseBossOption.equals("no"))&&(!responseBossOption.equals("y"))&&(!responseBossOption.equals("n"))) {
                            System.out.println(responseBossOption + " This is an invalid response. Please enter yes or no.(y/n)");

                            finalBossChange = true;
                        } else if (responseBossOption.equals("yes")||responseBossOption.equals("y")) {
                            finalBossChange = false;
                            finalBoss = true;

                        } else if (responseBossOption.equals("no")||responseBossOption.equals("n")) {
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
                            Character boss = createBoss(selectedBoss);
                            // exit the option question loop and enter the main story arc that starts the game play
                            MainStory.startStory(player, boss);
                        }
                    }
                } else {
                    System.out.println(boosOption + " - Invalid option. Please try again. Please enter a number between 1 - 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 4.");
                input.nextLine();
                finalBoss = true;
            }
            System.out.println();
        }
    }
}