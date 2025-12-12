public class StageFour {

    public static void stage4Final(PlayerCharacter player, Character boss) {
        /*
         * This final dice roll determine the final outcome of the game.
         * By the luck of the dice the game will write text file to each of the outcome to show how you did in the game
         */
        int roll = Dice.dice(6);
        if (roll >= 1 && roll <= 2) {
            System.out.println("CRITICAL Hit: You have lost all your lives");
            System.out.println("""
                        .-'~~~`-.
                      .'         `.
                      |  R  I  P  |
                      |           |
                      |           |
                    \\\\|_/\\\\_/__//\\|//
                    """);
            String finalRoll1or2 = String.format("""
                    Despite your courage and skill as a %s
                    %s proves too powerful. You fight valiantly,
                    but every strike meets %s defense. The dungeon
                    echoes with your last effort, and darkness claims you.
                    """, player.getName(), boss.getName(), boss.getName());
            System.out.println(finalRoll1or2);
            WriterDefeated.main(player,boss);
            System.out.println("Please go the the Defeated file to see the defeated art");
            System.exit(0);

        } else if (roll >= 3 && roll <= 4) {
            System.out.println("YOU FAILED YOUR QUEST, HOWEVER YOU SURVIVED!!! COUNT YOURSELF LUCKY AS YOU LIVE TO TELL THE TALE");
            System.out.println("[♥] [♡] [♡] [♡] [♡] ");
            String finalRoll3or4 = String.format("""
                    You narrowly survive the battle with %s retreating wounded.
                    The dungeon trembles as your adversary stands victorious.
                    You live, but the tale ends in partial failure
                    — a story of survival without glory.
                    """, boss.getName());
            System.out.println(finalRoll3or4);
            WriterSurvivor.main(player,boss);
            System.out.println("Please go to the Survivor file to see the survivor art ");
            System.exit(0);

        } else if (roll >= 5 && roll <= 6) {
            String finalRoll5or6 = String.format("""
                    Your %s skills shine in a final, decisive strike. %s falls,
                    and the dungeon grows silent in awe. You emerge triumphant,
                    the corridors echoing your victory. The Fallen Gate
                    stands behind you, and the legend of your success will endure...
                    """, player.getName(), boss.getName());
            System.out.println(finalRoll5or6);
            System.out.println("Please go to the Winner file to see the winner art");

            WriterWinner.main(player,boss);
            System.exit(0);
        }
    }


}