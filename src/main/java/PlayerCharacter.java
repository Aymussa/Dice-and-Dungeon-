/**
 * This is where i have created a PlayerCharacter class, where i have combined the HumanCharacter and ElfCharacter classes previously created.
 * I have created a Wizard and Knight subclass.
 * I have also created a WoodElf and HighElf subclass.
 * I have also created a getLives() and lostLife() method which i will use to track the player's lives.
 */
public class PlayerCharacter extends Character {
    private int lives;

    public PlayerCharacter(String name) {
        super(name);
        this.lives = 3;
    }

    public static class Wizard extends PlayerCharacter {
        public Wizard(String name) {
            super(name);
        }
    }

    public static class Knight extends PlayerCharacter {
        public Knight(String name) {
            super(name);
        }
    }

    public static class WoodElf extends PlayerCharacter {
        public WoodElf(String name) {
            super(name);
        }
    }

    public static class HighElf extends PlayerCharacter {
        public HighElf(String name) {
            super(name);
        }
    }

    public int getLives2() {
        return lives;
    }

    public int lostLife() {
        this.lives -= 1;
        return lives;
    }
}
