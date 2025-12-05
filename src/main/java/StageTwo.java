import java.util.Scanner;

public class StageTwo {

    public static void stage2Mystic(String selectedClass, String selectedBoss) {
        //System.out.println(" Selected : Forest Hall");
        //System.out.println("You rolled a " + Dice.dice(6));


        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String mysticRoll1or2 = String.format("""
                    The dungeon is alive with peril. Roots snap. You claw, but gravity,
                    overwhelms you. The echo of %s passes unseen above as...
                    your story ends in the cold, unyielding depths.
                    """,selectedBoss);
            System.out.println(mysticRoll1or2); // prints the string format

            System.exit(0);

        } else if (roll >= 3 && roll <= 6) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
            String mysticRoll3to6 = String.format("""
                    Runes pulse beneath the dust, reacting to your presence as a 
                    %s A magical humming grows — a heartbeat from %s
                    """,selectedClass,selectedBoss); // the %s is a placeholder and will be replaced by the variable in order it is given
            System.out.println(mysticRoll3to6);// this prints the string format
                boolean stage2Mystic = true;
                while (stage2Mystic) {

                    System.out.println("""
                            +---------------------------+
                            |                           |
                            |   what do you do next?    |
                            |___________________________|
                            |                           |
                            |   1.Channel Energy        |
                            |   2.Read Runes            |
                            |   3.Break Seal            |
                            +---------------------------+
                            """);

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner input = new Scanner(System.in);

                    try {
                        int MysticSelections = input.nextInt();

                        if (MysticSelections >= 1 && MysticSelections <= 3) {
                            StageThree.stage3Mystic(selectedClass, selectedBoss);
                            input.nextLine();
                            stage2Mystic = false;
                        } else {
                            System.out.println(MysticSelections + " - Invalid option. Please try again.");
                            stage2Mystic = true;
                            input.nextLine(); // Clear the scanner buffer
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
    }

    public static void stage2Combat(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String combatRoll1or2 = String.format("""
                    The dungeon is alive with peril. Water surges.
                    You swim, but the current overwhelms you.
                    The echo of %s passes unseen above 
                    as your story ends in the cold, unyielding depths.
                    """,selectedBoss);
            System.out.println(combatRoll1or2); // this prints the string format

            System.exit(0);


        } else if (roll >= 3 && roll <= 6) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
            String combatRoll3to6 = String.format("""
                    Rusting weapons, crushed armor, and deep gouges line the hall.
                    Heavy air presses down as echoes of old battles whisper your
                    approach toward %s 
                    """,selectedBoss);
                System.out.println(combatRoll3to6);//this prints the string format
                boolean stage2Combat = true;
                while (stage2Combat) {

                    System.out.println("""
                            +---------------------------+
                            |                           |
                            |   what do you do next?    |
                            |___________________________|
                            |                           |
                            |   1.Bash Forward          |
                            |   2.Shield up             |
                            |   3.Charge                |
                            +---------------------------+
                    """);

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner input = new Scanner(System.in);
                    try {
                        int combatSelection = input.nextInt();

                        if (combatSelection >= 1 && combatSelection <= 3) {
                            StageThree.stage3Combat(selectedClass, selectedBoss);
                            input.nextLine();
                            stage2Combat = false;
                        } else {
                            System.out.println(combatSelection + " - Invalid option. Please try again.");
                            stage2Combat = true;
                            input.nextLine(); // Clear the scanner buffer
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
    }


    public static void stage2Stealth(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String StealthRoll1or2 = String.format("""
                    The dungeon is alive with peril. Water surges. You swim,
                    but the current overwhelms you.The echo of %s 
                    passes unseen above as your story ends in the cold, unyielding depths.
                    """, selectedBoss);
            System.out.println(StealthRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 6) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
            String StealthRoll3or4or5or6 = String.format("""
                    You move quietly through torchless halls. Distant patrols pass by. 
                    The stone vibrates occasionally — a sign %s shifts somewhere below.
                    """, selectedBoss);
            System.out.println(StealthRoll3or4or5or6);

                boolean stage2Stealth = true;
                while (stage2Stealth) {



                    System.out.println("""
                    +---------------------------+
                    |                           |
                    |   what do you do next?    |
                    |___________________________|
                    |                           |
                    |   1.Hide                  |
                    |   2.Sneak Attack          |
                    |   3.Slip Past             |
                    +---------------------------+
                    """);

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner input = new Scanner(System.in);

                    try {
                        int stealthSelection = input.nextInt();

                        if (stealthSelection >= 1 && stealthSelection <= 3) {
                            StageThree.stage3Stealth(selectedClass, selectedBoss);
                            input.nextLine();
                            stage2Stealth = false;
                        } else {
                            System.out.println(stealthSelection + " - Invalid option. Please try again.");
                            stage2Stealth = true;
                            input.nextLine(); // Clear the scanner buffer
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
    }
}