import java.util.Scanner;
import java.util.NoSuchElementException;

public class Dice {
    /*
     * This Class implements the dice rolling logic so that i can use it at every option outcome for the user inpit
     */
    public static int dice(int roll) {
        System.out.println("Press Enter to roll the dice");
        Scanner input = new Scanner(System.in);
        try {//
            input.nextLine();// this is to make the game wait for the user to press enter and then roll the dice
        } catch (NoSuchElementException ignored) { // this is to handle with NoSuchElementException is for the unit test however it is not needed for the game
        }
        int rolling = (int) (Math.random() * roll) + 1;
        if (roll == 6) {
            printDie(rolling);
        }
        System.out.println("You rolled a " + rolling + "\n");

        return rolling;
    }

static void printDie(int rolling) {
    /*
     * This method is used to print the dice into the ASCII art as a display for the user to see the dice roll
     */
    String dice1 = """
            +-------+
            |       |
            |   ●   |
            |       |
            +-------+
            """;

    String dice2 = """
            +-------+
            | ●     |
            |       |
            |     ● |
            +-------+
            """;

    String dice3 = """
            +-------+
            | ●     |
            |   ●   |
            |     ● |
            +-------+
            """;

    String dice4 = """
            +-------+
            | ●   ● |
            |       |
            | ●   ● |
            +-------+
            """;

    String dice5 = """
            +-------+
            | ●   ● |
            |   ●   |
            | ●   ● |
            +-------+
            """;

    String dice6 = """
            +-------+
            | ●   ● |
            | ●   ● |
            | ●   ● |
            +-------+
            """;

    switch (rolling) {
        case 1 -> System.out.print(dice1);
        case 2 -> System.out.print(dice2);
        case 3 -> System.out.print(dice3);
        case 4 -> System.out.print(dice4);
        case 5 -> System.out.print(dice5);
        case 6 -> System.out.print(dice6);
        default -> System.out.print("Invalid roll");
    }
}

}
