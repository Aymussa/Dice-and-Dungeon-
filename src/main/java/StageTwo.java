import java.util.Scanner;

public class StageTwo {

    public static void stage2Mystic(String selectedClass, String selectedBoss) {
        //System.out.println(" Selected : Forest Hall");
        //System.out.println("You rolled a " + Dice.dice(6));


        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
                System.out.println("""
                        The dungeon is alive with peril. Roots snap. You claw, but gravity,
                        overwhelms you. The echo of """ + selectedBoss + """
                         passes unseen above as
                        your story ends in the cold, unyielding depths.
                        """);
            } else if (roll >= 3 && roll <= 6) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
                System.out.println("""
                        Runes pulse beneath the dust, reacting to your presence as a 
                        """
                        + selectedClass +
                        " A magical humming grows — a heartbeat from " + selectedBoss);
                boolean stage2Mystic = true;
                while (stage2Mystic) {

                    System.out.println("1.Channel Energy \n2.Read Runes \n3.Break Seal");

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner Input = new Scanner(System.in);

                    try {
                        int MysticSelections = Input.nextInt();
                    if (MysticSelections >= 1 && MysticSelections <= 3) {
                        stage2Mystic = true;
                    } else {
                        System.out.println(MysticSelections + " - Invalid option. Please try again.");
                        stage2Mystic = true;
                    }
                        if (MysticSelections >= 1 && MysticSelections <= 3) {
                            StageThree.stage3Mystic(selectedClass, selectedBoss);
                            Input.nextLine();
                            stage2Mystic = false;
                        } else {
                            System.out.println("invalid pick");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        Input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
    }


    public static void stage2Combat(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
                System.out.println("""
                        The dungeon is alive with peril. Water surges.
                        You swim, but the current, overwhelms you.
                        The echo of""" + selectedBoss +
                        """
                                passes unseen above
                                as your story ends in the cold, unyielding depths.
                                """);

            } else if (roll >= 3 && roll <= 6) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
                System.out.println("Rusting weapons, crushed armor, and deep gouges line the hall.");
                System.out.println(" Heavy air presses down as echoes of old battles whisper your approach toward " + selectedBoss);
                boolean stage2Combat = true;
                while (stage2Combat) {

                    System.out.println("1.Bash Forward \n2.Shield up \n3. Charge");

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner Input = new Scanner(System.in);
                    try {
                        int combatSelection = Input.nextInt();
                        if (combatSelection >= 1 && combatSelection <= 3) {
                        stage2Combat = true;
                    } else {
                        System.out.println(combatSelection + " - Invalid option. Please try again.");
                        stage2Combat = true;
                    }
                        if (combatSelection >= 1 && combatSelection <= 3) {
                            StageThree.stage3Combat(selectedClass, selectedBoss);
                            Input.nextLine();
                            stage2Combat = false;
                        } else {
                            System.out.println("invalid pick");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        Input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
    }


    public static void stage2Stealth(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
                System.out.println("""
                        The dungeon is alive with peril. Water surges. You swim,
                        but the current, overwhelms you.The echo of""" + selectedBoss +
                        """
                                passes unseen above as your story ends in the cold, unyielding depths.
                                """);
            } else if (roll >= 3 && roll <= 6) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
                System.out.println("You move quietly through torchless halls. Distant patrols pass by. ");
                System.out.println("The stone vibrates occasionally — a sign" + selectedBoss + " shifts somewhere below.");
                boolean stage2Stealth = true;
                while (stage2Stealth) {

                    System.out.println("1.Hide \n2.Sneak Attack \n3. Slip Past");

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner Input = new Scanner(System.in);

                    try {
                        int stealthSelection = Input.nextInt();
                    if (stealthSelection >= 1 && stealthSelection <= 3) {
                        stage2Stealth = true;
                    } else {
                        System.out.println(stealthSelection + " - Invalid option. Please try again.");
                        stage2Stealth = true;
                    }
                        if (stealthSelection >= 1 && stealthSelection <= 3) {
                            StageThree.stage3Stealth(selectedClass, selectedBoss);
                            Input.nextLine();
                            stage2Stealth = false;
                        } else {
                            System.out.println("invalid pick");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        Input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
    }
}