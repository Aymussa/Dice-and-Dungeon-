import java.util.Scanner;

public class StageThree {

    public static void stage3Mystic(PlayerCharacter player, Character boss) {
        int roll = Dice.dice(6);
        if (roll >= 1 && roll <= 2) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\|_/\\_/__//\\|//
                        """);
                String mysticRoll1or2 = String.format("""
                        Magical energy arcs around the chamber, responding violently to your %s
                        presence. You attempt to harness it, but the raw force backlashes. Sparks
                        ignite, runes shatter, and the dungeon consumes you whole. %s senses the
                        disturbance, but your attempt ends in fiery ruin.
                        """, player.getName(), boss.getName());
                System.out.println(mysticRoll1or2);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 3 ");
                StageThree.stage3Mystic(player, boss);
            }

        } else if (roll >= 3 && roll <= 4) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\|_/\\_/__//\\|//
                        """);
                String mysticRoll3or4 = String.format("""
                        The magic of the dungeon overwhelms your senses. You stumble
                        through twisting halls as runes erupt in blinding light. The
                        chamber collapses around you, and arcane fire consumes your path.
                        No escape remains; %s and the dungeon claim you completely.
                        """, boss.getName());
                System.out.println(mysticRoll3or4);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 3 ");
                StageThree.stage3Mystic(player, boss);
            }

            //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story - as this is a merger of the combat and stealth story
        } else if (roll >= 5 && roll <= 6) {
            String mysticRoll5or6 = String.format("""
                    You emerge silently. %s lifts its head toward you, sensing your presence.
                    """, boss.getName());
            System.out.println(mysticRoll5or6);

            String mysticRollLast = String.format("""
                       .-------.
                      /   o   /| As a %s you have come far.
                     /_______/o| Only one final dice roll
                    | o     |  | stands between you and victory.
                    |   o   |o/
                    |     o |/   Press Enter to roll the dice one last time
                    '-------'
                    """, player.getName());
            System.out.println(mysticRollLast);

            // Directly go to the final stage; Dice.dice will handle the actual roll when the user presses Enter
            StageFour.stage4Final(player, boss);
        }
    }


    public static void stage3Combat(PlayerCharacter player, Character boss) {
        int roll = Dice.dice(6);

//roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\|_/\\_/__//\\|//
                        """);
                String combatRoll1or2 = String.format("""
                        Stones tumble, weapons fall, and the ground shakes.
                        You struggle, pushing against debris and fallen enemies,
                        but the weight is too much. As a %s strength cannot overcome
                        sheer ruin. The dungeon’s power crushes you, leaving only silence
                        """, player.getName());
                System.out.println(combatRoll1or2);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 3 ");
                StageThree.stage3Combat(player, boss);
            }

        } else if (roll >= 3 && roll <= 4) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\|_/\\_/__//\\|//
                        """);
                String combatRoll3or4 = String.format("""
                        You face formidable foes in the ruins, fighting with all your might.
                        Blades crash, shields shatter, and the stone beneath you runs slick.
                        At last your guard falters, and the enemy strikes you down.
                        %s stands undisturbed as the dungeon falls silent over your fallen %s.
                        """, boss.getName(), player.getName());
                System.out.println(combatRoll3or4);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 3 ");
                StageThree.stage3Combat(player, boss);
            }

        } else if (roll >= 5 && roll <= 6) {
            String combatRoll5or6 = String.format("""
                    You stride forward confidently. The lair trembles as %s rises
                    """, boss.getName());
            System.out.println(combatRoll5or6);

            String combatRollLast = String.format("""
                       .-------.
                      /   o   /| As a %s you have come far.
                     /_______/o| Only one final dice roll
                    | o     |  | stands between you and victory.
                    |   o   |o/
                    |     o |/   Press Enter to roll the dice one last time
                    '-------'
                    """, player.getName());
            System.out.println(combatRollLast);

            // Directly go to the final stage; Dice.dice will handle the actual roll when the user presses Enter
            StageFour.stage4Final(player, boss);
        }
    }

    public static void stage3Stealth(PlayerCharacter player, Character boss) {
        int roll = Dice.dice(6);

        if (roll >= 1 && roll <= 2) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\|_/\\_/__//\\|//
                        """);
                String stealthRoll1or2 = String.format("""
                        Shadows and traps nearly overwhelm you, but quick thinking lets
                        you slip through. You emerge battered and shaken. The dungeon
                        keeps its secrets, and %s  remains undefeated.
                        Your %s skills saved you, but at great cost.
                        """, boss.getName(), player.getName());
                System.out.println(stealthRoll1or2);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 3 ");
                StageThree.stage3Stealth(player, boss);
            }

        } else if (roll >= 3 && roll <= 4) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\|_/\\_/__//\\|//
                        """);
                String stealthRoll3or4 = String.format("""
                        Shadows and traps nearly overwhelm you, but quick thinking lets
                        you slip through. You emerge battered and shaken. The dungeon
                        keeps its secrets, and %s  remains undefeated.
                        Your %s skills saved you, but at great cost.
                        """, boss.getName(), player.getName());
                System.out.println(stealthRoll3or4);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 3 ");
                StageThree.stage3Stealth(player, boss);
            }


        } else if (roll >= 5 && roll <= 6) {
            System.out.println("The runes blaze, and the chamber opens. " + boss.getName() + " stands ready.");

            String stealthRollLast = String.format("""
                       .-------.
                      /   o   /| As a %s you have come far.
                     /_______/o| Only one final dice roll
                    | o     |  | stands between you and victory.
                    |   o   |o/
                    |     o |/   Press Enter to roll the dice one last time
                    '-------'
                    """, player.getName());
            System.out.println(stealthRollLast);

            // Directly go to the final stage; Dice.dice will handle the actual roll when the user presses Enter
            StageFour.stage4Final(player, boss);
        }
    }
}
