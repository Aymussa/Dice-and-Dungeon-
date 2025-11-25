import java.util.Scanner;

public class StageFour {

    public static void stage4Final(String selectedClass, String selectedBoss) {

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("Despite your courage and skill as a"+selectedClass);
            System.out.println(selectedBoss + "proves too powerful.");
            System.out.println("You fight valiantly, but every strike meets "+selectedBoss);
            System.out.println("defense. The dungeon echoes with your last effort, and darkness claims you.");

        } else if (roll >= 3 && roll <= 4) {
            System.out.println("You narrowly survive the battle with "+selectedBoss+" retreating wounded.");
            System.out.println("""
                    The dungeon trembles as your adversary roars or lifts its weapon, victorious.
                    You live, but the tale ends in partial failure — a story of survival without glory.
                    """);

        } else if (roll >= 5 && roll <= 6) {
            //roll 3/4/5/6 this is the outcome if they pick number 3
            System.out.println("Your "+ selectedClass +" skills shine in a final,decisive strike.");
            System.out.println(selectedBoss+"falls, and the dungeon grows silent in awe");
            System.out.println("""
                    You emerge triumphant, the corridors echoing your victory. The Fallen Gate stands behind you,
                    and the legend of your success will endure.. 
                    """);
        }
    }
}