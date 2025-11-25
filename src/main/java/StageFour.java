import java.util.Scanner;

public class StageFour {

    public static void stage4Final(String selectedClass, String selectedBoss) {

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    Despite your courage and skill as a [class], [boss-title] proves too powerful.
                    You fight valiantly, but every strike meets the beast, knight, or Cerberus’
                    defense. The dungeon echoes with your last effort, and darkness claims you.
                    """);
        } else if (roll >= 3 && roll <= 4) {
            System.out.println("""
                    You narrowly survive the battle with [boss-title], retreating wounded.
                    The dungeon trembles as your adversary roars or lifts its weapon, victorious.
                    You live, but the tale ends in partial failure — a story of survival without glory.
                    """);


        } else if (roll >= 5 && roll <= 6) {

            //roll 3/4/5/6 this is the outcome if they pick number 3
            System.out.println("""
                    Your [class] skills shine in a final, decisive strike. [Boss-title] falls,
                    whether dragon, dark knight, or Cerberus, and the dungeon grows silent in awe.
                    You emerge triumphant, the corridors echoing your victory. The Fallen Gate stands behind you,
                    and the legend of your success will endure.. 
                    """);
        }
    }
}