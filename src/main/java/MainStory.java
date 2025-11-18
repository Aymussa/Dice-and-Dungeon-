import java.util.Scanner;

public class MainStory {
    public static void main(String[] args) {
        startStory();
    }
    
    public static void startStory() {
        System.out.println("welcome");
        System.out.println("""
        You awaken in the shadowed ruins of The Fallen Gate,
        the air thick with dust and echoing distant tremors. As your senses return,
        you steady yourself — the resolve of a seasoned [class ] settles into your bones.
        Somewhere deep below, you hear a low rumble… the presence o [bossTitle ] stirs.
        Three passageways stretch before you, each leading deeper into the ancient dungeon.
        """);
        //Scanner Stage1 = new Scanner;



        //Input.nextLine(); // Clear the scanner buffer
        //  Input.nextLine(); // Clear the scanner buffer

        //try {


        //} catch (Exception e) {
        //  System.out.println("\nAn error occurred reading input. Using default name.");
        //firstName = "Adventurer";
        //System.out.println("Welcome, " + firstName + "! Let's begin your D&D adventure!");
        //} finally {
        //  Input.close();
//                String rolling = (int) (Math.random() * 6) + 1;
//                rollingdice.dice(6);
        //Dice.dice(1);
        System.out.println("You rolled a "+ Dice.dice(6));

//            System.out.println("\nThank you for p/**/laying, your number is : " + Dice.dice(6));
    }
}
