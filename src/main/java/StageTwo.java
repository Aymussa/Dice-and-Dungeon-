import java.util.Scanner;

public class StageTwo {

    public static void stage2Mystic(Character player, Character boss) {
        Scanner input = new Scanner(System.in);

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
                    The dungeon is alive with peril. Roots snap. You claw, but gravity,
                    overwhelms you. The echo of %s passes unseen above as...
                    your story ends in the cold, unyielding depths.
                    """, boss.getName());
            System.out.println(mysticRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 6) {
            // this is where I merged the story so that the story does not extend any further outputs

            String mysticRoll3to6 = String.format("""
                    Runes pulse beneath the dust, reacting to your presence as a
                    %s A magical humming grows — a heartbeat from %s
                    """, player.getName(), boss.getName());
            System.out.println(mysticRoll3to6);
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

                try {
                    int MysticSelections = input.nextInt();
                    // this is where I merged the story so that the story does not extend any further outputs

                    if (MysticSelections >= 1 && MysticSelections <= 3) {
                        StageThree.stage3Mystic(player, boss);
                        input.nextLine();
                        stage2Mystic = false;
                    } else {
                        System.out.println(MysticSelections + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage2Mystic = true;
                    input.nextLine();
                }
            }
        }
    }

    public static void stage2Combat(Character player, Character boss) {
        Scanner input = new Scanner(System.in);

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
            String combatRoll1or2 = String.format("""
                    The dungeon is alive with peril. Water surges.
                    You swim, but the current overwhelms you.
                    The echo of %s passes unseen above
                    as your story ends in the cold, unyielding depths.
                    """, boss.getName());
            System.out.println(combatRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 6) {
            // this is where I merged the story so that the story does not extend any further outputs

            String combatRoll3to6 = String.format("""
                    Rusting weapons, crushed armor, and deep gouges line the hall.
                    Heavy air presses down as echoes of old battles whisper your
                    approach toward %s
                    """, boss.getName());
            System.out.println(combatRoll3to6);
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

                try {
                    int combatSelection = input.nextInt();
                    // this is where I merged the story so that the story does not extend any further outputs

                    if (combatSelection >= 1 && combatSelection <= 3) {
                        StageThree.stage3Combat(player, boss);
                        input.nextLine();
                        stage2Combat = false;
                    } else {
                        System.out.println(combatSelection + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage2Combat = true;

                    input.nextLine();
                }
            }
        }
    }

    public static void stage2Stealth(Character player, Character boss) {
        Scanner input = new Scanner(System.in);

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
            String StealthRoll1or2 = String.format("""
                    The dungeon is alive with peril. Water surges. You swim,
                    but the current overwhelms you.The echo of %s
                    passes unseen above as your story ends in the cold, unyielding depths.
                    """, boss.getName());
            System.out.println(StealthRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 6) {

            String StealthRoll3or4or5or6 = String.format("""
                    You move quietly through torchless halls. Distant patrols pass by.
                    The stone vibrates occasionally — a sign %s shifts somewhere below.
                    """, boss.getName());
            System.out.println(StealthRoll3or4or5or6);

            boolean stage2Stealth = true;
            while (stage2Stealth) {

                System.out.println("""
                        +---------------------------+
                        |                           |
                        |    what do you do next?   |
                        |___________________________|
                        |                           |
                        |   1.Hide                  |
                        |   2.Sneak Attack          |
                        |   3.Slip Past             |
                        +---------------------------+
                        """);

                try {
                    int stealthSelection = input.nextInt();
                    // this is where I merged the story so that the story does not extend any further outputs

                    if (stealthSelection >= 1 && stealthSelection <= 3) {
                        StageThree.stage3Stealth(player, boss);
                        input.nextLine();
                        stage2Stealth = false;
                    } else {
                        System.out.println(stealthSelection + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage2Stealth = true;
                    input.nextLine();
                }
            }
        }
    }
}