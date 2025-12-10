import java.util.Scanner;

public class StageThree {

    public static void stage3Mystic(Character player, Character boss) {
        int roll = Dice.dice(6);
        if (roll >= 1 && roll <= 2) {
            System.out.println("YOU LOSE");
            System.out.println("""
                        .-'~~~`-.
                      .'         `.
                      |  R  I  P  |
                      |           |
                      |           |
                    \\\\|_/\\\\_/__//\\|//
                    """);
            String mysticRoll1or2 = String.format("""
                    Magical energy arcs around the chamber, responding violently to your %s
                    presence. You attempt to harness it, but the raw force backlashes. Sparks
                    ignite, runes shatter, and the dungeon consumes you whole. %s senses the
                    disturbance, but your attempt ends in fiery ruin.
                    """,player.getName(),boss.getName());
            System.out.println(mysticRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 4) {
            System.out.println("YOU LOSE");
            System.out.println("""
                        .-'~~~`-.
                      .'         `.
                      |  R  I  P  |
                      |           |
                      |           |
                    \\\\|_/\\\\_/__//\\|//
                    """);
            String mysticRoll3or4 = String.format("""
                    The magic of the dungeon overwhelms your senses. You stumble
                    through twisting halls, runes burning around you. Eventually,
                    you find a narrow escape, but the final seal prevents any progress toward %s.
                    Survival comes at the price of failing your quest.
                    """,boss.getName());
            System.out.println(mysticRoll3or4);
            System.exit(0);

            //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story - as this is a merger of the combat and stealth story
        } else if (roll >= 5 && roll <= 6) {
            String mysticRoll5or6 = String.format("""
                    You emerge silently. %s lifts its head toward you, sensing your presence.
                    """,boss.getName());
            System.out.println(mysticRoll5or6);

            boolean stage3Mystic = true;
            while (stage3Mystic) {
                String mysticRollLast = String.format("""
                       .-------.
                      /   o   /| As a %s you have come far.
                     /_______/o| Only one final dice roll
                    | o     |  | stands between you and victory.
                    |   o   |o/
                    |     o |/   Press 1 to roll the dice one last time
                    '-------'
                    """,player.getName());
                System.out.println(mysticRollLast);

                Scanner input = new Scanner(System.in);

                try {
                    int MysticSelections = input.nextInt();
                    /*Rather than having the user press enter, I made it so that if the user enters number 1
                     * this int will take the user to stage 4
                     */
                    if (MysticSelections == 1) {
                        StageFour.stage4Final(player, boss);
                        input.nextLine();
                        stage3Mystic = false;
                    } else {
                        System.out.println(MysticSelections + " - Invalid option. Please try again. Please enter the number 1");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter the number 1.");
                    stage3Mystic = true;
                    input.nextLine();
                }
            }
        }
    }


    public static void stage3Combat(Character player, Character boss) {
        int roll = Dice.dice(6);

            //roll 1/2 this is the end of the line
            if (roll >= 1 && roll <= 2) {
                System.out.println("YOU LOSE");
                System.out.println("""
                        .-'~~~`-.
                      .'         `.
                      |  R  I  P  |
                      |           |
                      |           |
                    \\\\|_/\\\\_/__//\\|//
                    """);
                String combatRoll1or2 = String.format("""
                        Stones tumble, weapons fall, and the ground shakes.
                        You struggle, pushing against debris and fallen enemies,
                        but the weight is too much. As a %s strength cannot overcome
                        sheer ruin. The dungeon’s power crushes you, leaving only silence
                        """, player.getName());
                System.out.println(combatRoll1or2);
                System.exit(0);


            } else if (roll >= 3 && roll <= 4) {
                System.out.println("YOU LOSE");
                String combatRoll3or4 = String.format("""
                        You face formidable foes in the ruins, fighting with all your might.
                        Despite bravery, the enemies prove too strong. Wounded, you withdraw,leaving
                        %s undisturbed. Your %s training saved your life, but victory eludes you.
                        """,boss.getName(),player.getName());// the %s is a placeholder and will be replaced by the variable in order it is given
                System.out.println(combatRoll3or4);
                System.exit(0);

            } else if (roll >= 5 && roll <= 6) {
                String combatRoll5or6 = String.format("""
                        You stride forward confidently. The lair trembles as %s rises
                        """,boss.getName());
                System.out.println(combatRoll5or6);

                boolean stage3Combat = true;
                while (stage3Combat) {
                String combatRollLast = String.format("""
                       .-------.
                      /   o   /| As a %s you have come far.
                     /_______/o| Only one final dice roll
                    | o     |  | stands between you and victory.
                    |   o   |o/
                    |     o |/   Press 1 to roll the dice one last time
                    '-------'
                    """,player.getName());
                System.out.println(combatRollLast);

                Scanner input = new Scanner(System.in);

                try {
                    int combatSelection = input.nextInt();
                    /*Rather than having the user press enter, I made it so that if the user enters number 1
                     * this int will take the user to stage 4
                     */
                    if (combatSelection == 1) {
                        StageFour.stage4Final(player, boss);
                        input.nextLine();
                        stage3Combat = false;
                    } else {
                        System.out.println(combatSelection + " - Invalid option. Please try again. Please enter the number 1.");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter the number 1.");
                    stage3Combat = true;
                    input.nextLine();// Clear the scanner buffer
                }
            }
        }
    }

    public static void stage3Stealth(Character player, Character boss) {
        // When this method is called the dice will roll and depending on the roll the story ends on 1/2/3/4 and or goes to stage 4 5/6

        int roll = Dice.dice(6);

        if (roll >= 1 && roll <= 2) {
            System.out.println("YOU LOSE");
            System.out.println("""
                        .-'~~~`-.
                      .'         `.
                      |  R  I  P  |
                      |           |
                      |           |
                    \\\\|_/\\\\_/__//\\|//
                    """);
            String stealthRoll1or2 = String.format("""
                    The stealthy shadows you sought to navigate turn against you.
                    Darkness engulfs you, unseen force dragging you into the void.
                    Even as a nimble %s you cannot escape the
                    dungeon's wrath. %s stirs above, indifferent.
                    """,player.getName(),boss.getName());// the %s is a placeholder and will be replaced by the variable in order it is given
            System.out.println(stealthRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 4) {
            System.out.println("YOU LOSE, HOWEVER YOU SURVIVED!!! COUNT YOURSELF LUCKY AS YOU LIVE TO TELL THE TALE");
            System.out.println("[♥] [♡] [♡] [♡] [♡]");
            String stealthRoll3or4 = String.format("""
                    Shadows and traps nearly overwhelm you, but quick thinking lets
                    you slip through. You emerge battered and shaken. The dungeon
                    keeps its secrets, and %s  remains undefeated.
                    Your %s skills saved you, but at great cost.
                    """,boss.getName(),player.getName());// the %s is a placeholder and will be replaced by the variable in order it is given
            System.out.println(stealthRoll3or4);
            System.exit(0);

        } else if (roll >= 5 && roll <= 6) {
            System.out.println("The runes blaze, and the chamber opens. " + boss.getName() + " stands ready.");
            boolean stage3Stealth = true;
            while (stage3Stealth) {
                String stealthRollLast = String.format("""
                       .-------.
                      /   o   /| As a %s you have come far.
                     /_______/o| Only one final dice roll
                    | o     |  | stands between you and victory.
                    |   o   |o/
                    |     o |/   Press 1 to roll the dice one last time
                    '-------'
                    """,player.getName());
                System.out.println(stealthRollLast);

                Scanner input = new Scanner(System.in);
                try {
                    int stealthSelection = input.nextInt();
                    /*Rather than having the user press enter, I made it so that if the user enters number 1
                    * this int will take the user to stage 4
                    */

                    if (stealthSelection == 1) {
                        StageFour.stage4Final(player, boss);
                        input.nextLine();
                        stage3Stealth = false;
                    } else {
                        System.out.println(stealthSelection + " - Invalid option. Please try again. Please enter the number 1");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter the number 1.");
                    stage3Stealth = true;
                    input.nextLine();
                }
            }
        }
    }
}
