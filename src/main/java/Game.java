import java.util.Scanner;

/*
 * This is where I create the Game class,
 * I kept the logic in methods outside the main so that I can test the code
 */
public class Game {
    public static String getCharacterClass(int option) {
        /*
         *This method takes the user options 1/2/3/4  and returns the matching character class as a string.
         * if the option is not between 1-4 it returns null
         */
        String[] characterClasses = {"Wizard", "Knight", "Wood Elf", "High Elf"};
        if (option >= 1 && option <= 4) {
            return characterClasses[option - 1];
        }
        return null;
    }

    /*
    I created this method to build the player object. It takes the selected class name
    * and uses a switch statement to create the correct Character subclass.
    */
    public static PlayerCharacter createPlayer(String selectedClass) {
        PlayerCharacter player = null; //initialise the player to null and then assign it to the selected class with switch statement
        switch (selectedClass) {
            case "Wizard":
                player = new PlayerCharacter.Wizard(selectedClass);
                break;
            case "Knight":
                player = new PlayerCharacter.Knight(selectedClass);
                break;
            case "Wood Elf":
                player = new PlayerCharacter.WoodElf(selectedClass);
                break;
            case "High Elf":
                player = new PlayerCharacter.HighElf(selectedClass);
                break;
        }
        return player;
    }

    /*
     *This method takes the user boss option 1/2/3/4 and returns the matching boss as a string.
     * if the option is not between 1-4 it returns null
     */
    public static String getBoss(int option) {
        String[] bossOptions = {"Dragon", "Dark Elf", "Cerberus", "Goblin"};
        if (option >= 1 && option <= 4) {
            return bossOptions[option - 1];
        }
        return null;
    }

    /*
     *I created this method to build the boss object. It takes the selected boss name
     * and uses a switch statement to create the correct BossCharacter subclass.
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

    /*
     * This starts the game Class. Main method to run the game.
     * This is where the game logic is implemented by first asking for the name of the player and then letting the player choose their character class.
     * this creates the player object and then asking for user boss option and then creating the boss object.
     * Then the game starts and it will continue until the player loses or wins
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

        //initialise the selected class and boss to an empty string, then assign it to the selected class or boss with switch statement
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
                    System.out.println("Congratulations " + playerName + " you have selected " + selectedClass + " as your character class");
                    System.out.println();
                    input.nextLine();

                    boolean confirmClass = true;
                    while (confirmClass) {
                        System.out.println("""
                                +---------------------------------------------+
                                |    Please confirm your choice. Type 'yes'   |
                                |       to continue or 'no' to reselect."     |
                                |                                             |
                                +---------------------------------------------+
                                """);
                        String characterChange = input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!characterChange.equals("yes")) && (!characterChange.equals("no")) && (!characterChange.equals("y")) && (!characterChange.equals("n"))) {
                            System.out.println(characterChange + " This is an invalid response. Please write yes or no.(y/n)");
                            confirmClass = true;

                        } else if (characterChange.equals("yes") || characterChange.equals("y")) {
                            confirmClass = false;
                            selectingCharacter = false;

                        } else if (characterChange.equals("no") || characterChange.equals("n")) {
                            confirmClass = false;
                            selectingCharacter = true;
                        }
                    }
                } else {
                    System.out.println(characterOptions + " - Invalid option. Please try again. Please enter a number between 1 - 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 4.");
                input.nextLine();
                selectingCharacter = true;

                System.out.println();
            }
        }

        // Here I create the player object using the selectedClass.
        // The main method calls createPlayer(selectedClass), which uses a switch to build the right Character type.
        PlayerCharacter player = createPlayer(selectedClass);
        System.out.println("Welcome " + player.getName());
        System.out.println("You have " + player.getLives2() + " lives");

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
                    System.out.println("Congratulations " + playerName + " you have selected " + selectedBoss + " as your final boss");
                    System.out.println();
                    input.nextLine();

                    boolean finalBossChange = true;
                    while (finalBossChange) {
                        System.out.println("""
                                +---------------------------------------------+
                                |    Please confirm your choice. Type 'yes'   |
                                |       to continue or 'no' to reselect."     |
                                |                                             |
                                +---------------------------------------------+
                                """);
                        String responseBossOption = input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!responseBossOption.equals("yes")) && (!responseBossOption.equals("no")) && (!responseBossOption.equals("y")) && (!responseBossOption.equals("n"))) {
                            System.out.println(responseBossOption + " This is an invalid response. Please enter yes or no.(y/n)");

                        } else if (responseBossOption.equals("yes") || responseBossOption.equals("y")) {
                            System.out.println("""
                                            +-------------------------------------------------+
                                            |       _                                         |
                                            |      |  Great, lets begin your adventure!       |
                                            |  O===[====================================-     |
                                            |      |_                                         |
                                            +-------------------------------------------------+
                                    """);
                            finalBossChange = false;
                            finalBoss = false;
                            Character boss = createBoss(selectedBoss);
                            // exit the option question loop and enter the main story arc that starts the game play
                            MainStory.startStory(player, boss);

                        } else if (responseBossOption.equals("no") || responseBossOption.equals("n")) {
                            finalBossChange = false;
                            finalBoss = true;
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