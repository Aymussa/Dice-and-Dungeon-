package src.main.dungeon;

public class Dice {
    public static int dice(int roll) {
        int rolling = (int) (Math.random() * roll) + 1;
//        System.out.println("You rolled a " + rolling);

        if (rolling == 1 || rolling == 2) {
            System.out.println("You rolled a " + rolling + " you lose!");
        } else if (rolling == 3 || rolling == 4) {
            System.out.println("You rolled a " + rolling + "  you lose a little!");
        } else {
            System.out.println("You rolled a " + rolling + ", you won");
        }
        return rolling;
    }
}
