public class Dice {
    public static int dice(int roll) {
        int rolling = (int) (Math.random() * roll) + 1;
        if (roll == 6) {
            printDie(rolling);
        }
        System.out.println("You rolled a " + rolling +"\n");

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
