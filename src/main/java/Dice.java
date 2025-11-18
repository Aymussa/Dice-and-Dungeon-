public class Dice {
    public static int dice(int roll) {
        int rolling = (int) (Math.random() * roll) + 1;
        System.out.println("You rolled a " + rolling);
        
        // Display ASCII art for 6-sided dice
        if (roll == 6) {
            printDie(rolling);
        }

        if (rolling == 1 || rolling == 2) {
            //System.out.println("You rolled a " + rolling + " you lose!");
        } else if (rolling == 3 || rolling == 4) {
            //System.out.println("You rolled a " + rolling + "  you lose a little!");
        } else {
            //System.out.println("You rolled a " + rolling + ", you won");
        }
        return rolling;
    }

    static void printDie(int rolling) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
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
