import java.util.Scanner;

public class StageThree {

    public static void stage3Mystic(String selectedClass, String selectedBoss) {
        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String mysticRoll1or2 = String.format("""
                    Magical energy arcs around the chamber, responding violently to your %s
                    presence. You attempt to harness it, but the raw force backlashes. Sparks
                    ignite, runes shatter, and the dungeon consumes you whole. %s senses the
                    disturbance, but your attempt ends in fiery ruin.
                    """,selectedClass,selectedBoss);// the %s is a placeholder and will be replaced by the variable in order it is given
            System.out.println(mysticRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 4) {
            String mysticRoll3or4 = String.format("""
                    The magic of the dungeon overwhelms your senses. You stumble
                    through twisting halls, runes burning around you. Eventually,
                    you find a narrow escape, but the final seal prevents any progress toward %s.
                    Survival comes at the price of failing your quest.
                    """,selectedBoss);
            System.out.println(mysticRoll3or4);
            //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story - as this is a merger of the combat and stealth story
        } else if (roll >= 5 && roll <= 6) {
            String mysticRoll5or6 = String.format("""
                    You emerge silently. %s lifts its head toward you, sensing your presence.
                    """,selectedBoss);
            System.out.println(mysticRoll5or6);

            boolean stage3Mystic = true;
            while (stage3Mystic) {

                String mysticRollLast = String.format("""
                        As a %s you have come far.
                        Only one final dice roll stands between you and victory.
                        Press 1 to roll the dice one last time
                        """,selectedClass);

                System.out.println(mysticRollLast);

                System.out.println("");
                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                Scanner Input = new Scanner(System.in);

                try {
                    int MysticSelections = Input.nextInt();
                    if (MysticSelections == 1) {
                        stage3Mystic = true;
                    } else {
                        System.out.println(MysticSelections + " - Invalid option. Please try again.");
                        stage3Mystic = true;
                    }
                    if (MysticSelections == 1) {
                        StageFour.stage4Final(selectedClass, selectedBoss);
                        Input.nextLine();
                        stage3Mystic = false;
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


    public static void stage3Combat(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));
        boolean stage3Combat = true;


        while (stage3Combat) {
            int roll = Dice.dice(6);
            //roll 1/2 this is the end of the line
            if (roll >= 1 && roll <= 2) {
                String combatRoll1or2 = String.format("""
                        Stones tumble, weapons fall, and the ground shakes.
                        You struggle, pushing against debris and fallen enemies,
                        but the weight is too much. As a %s strength cannot overcome
                        sheer ruin. The dungeon’s power crushes you, leaving only silence
                        """, selectedClass);
                System.out.println(combatRoll1or2);
                System.exit(0);


            } else if (roll >= 3 && roll <= 4) {

                //roll 3/4/5/6 this is the outcome if they pick number 3
                String combatRoll3or4 = String.format("""
                        You face formidable foes in the ruins, fighting with all your might.
                        Despite bravery, the enemies prove too strong. Wounded, you withdraw,leaving
                        %s undisturbed. Your %s training saved your life, but victory eludes you.
                        """,selectedBoss,selectedClass);// the %s is a placeholder and will be replaced by the variable in order it is given
                System.out.println(combatRoll3or4);

            } else if (roll >= 5 && roll <= 6) {
                String combatRoll5or6 = String.format("""
                        You stride forward confidently. The lair trembles as %s rises
                        """,selectedBoss);
                System.out.println(combatRoll5or6);

                String combatRollLast = String.format("""
                        
                        """,selectedClass);
                String combatRollLast2 = String.format("""
                        As a %s you have come far.
                        Only one final dice roll stands between you and victory.
                        Press 1 to roll the dice one last time
                        """,selectedClass);
                System.out.println(combatRollLast2);

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                Scanner Input = new Scanner(System.in);

                try {
                    int combatSelection = Input.nextInt();
                    if (combatSelection == 1) {
                        stage3Combat = true;
                    } else {
                        System.out.println(combatSelection + " - Invalid option. Please try again.");
                        stage3Combat = true;
                    }
                    if (combatSelection == 1) {
                        StageFour.stage4Final(selectedClass, selectedBoss);
                        Input.nextLine();
                        stage3Combat = false;
                    } else {
                        System.out.println("invalid pick");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    System.out.println();
                    Input.nextLine();// Clear the scanner buffer
                }
            }
        }
    }


    public static void stage3Stealth(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));
        boolean stage3Stealth = true;

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String stealthRoll1or2 = String.format("""
                    The stealthy shadows you sought to navigate turn against you.
                    Darkness engulfs you, unseen force dragging you into the void.
                    Even as a nimble %s you cannot escape the
                    dungeon's wrath. %s stirs above, indifferent.
                    """,selectedClass,selectedBoss);// the %s is a placeholder and will be replaced by the variable in order it is given
            System.out.println(stealthRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 4) {
            String stealthRoll3or4 = String.format("""
                    Shadows and traps nearly overwhelm you, but quick thinking lets
                    you slip through. You emerge battered and shaken. The dungeon
                    keeps its secrets, and %s  remains undefeated.
                    Your %s skills saved you, but at great cost.
                    """,selectedBoss,selectedClass);// the %s is a placeholder and will be replaced by the variable in order it is given
            System.out.println(stealthRoll3or4);
        } else if (roll >= 5 && roll <= 6) {

            //roll 5/6 this is the outcome if they pick number 3
            System.out.println("The runes blaze, and the chamber opens. " + selectedBoss + " stands ready.");

            while (stage3Stealth) {
                String stealthRollLast = String.format("""
                        As a %s you have come far.
                        Only one final dice roll stands between you and victory.
                        Press 1 to roll the dice one last time
                        """,selectedClass);
                System.out.println(stealthRollLast);

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                Scanner Input = new Scanner(System.in);

                try {
                    int stealthSelection = Input.nextInt();
                    if (stealthSelection == 1) {
                        stage3Stealth = true;
                    } else {
                        System.out.println(stealthSelection + " - Invalid option. Please try again.");
                        stage3Stealth = true;
                    }
                    if (stealthSelection == 1) {
                        StageFour.stage4Final(selectedClass, selectedBoss);
                        Input.nextLine();
                        stage3Stealth = false;
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
