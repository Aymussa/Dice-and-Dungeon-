import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class StageFour {

    public static void stage4Final(String selectedClass, String selectedBoss) {

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String finalRoll1or2 = String.format("""
                    Despite your courage and skill as a %s
                    %s proves too powerful. You fight valiantly,
                    but every strike meets %s defense. The dungeon
                    echoes with your last effort, and darkness claims you.
                    """,selectedClass,selectedBoss,selectedBoss);
            System.out.println(finalRoll1or2);
            System.exit(0);

        } else if (roll >= 3 && roll <= 4) {
            String finalRoll3or4 = String.format("""
                    You narrowly survive the battle with %s retreating wounded.
                    The dungeon trembles as your adversary stands victorious.
                    You live, but the tale ends in partial failure
                    — a story of survival without glory.
                    """,selectedBoss);
            System.out.println(finalRoll3or4);
            System.exit(0);

        } else if (roll >= 5 && roll <= 6) {
            //roll 3/4/5/6 this is the outcome if they pick number 3
            String finalRoll5or6 = String.format("""
                    Your %s skills shine in a final, decisive strike. %s falls,
                    and the dungeon grows silent in awe. You emerge triumphant,
                    the corridors echoing your victory. The Fallen Gate
                    stands behind you, and the legend of your success will endure... 
                    """,selectedClass,selectedBoss);
            System.out.println(finalRoll5or6);
            System.out.println("Please go to the winner file to see the winner art");

            WriterWinner.main();
            System.exit(0);
        }
    }


}