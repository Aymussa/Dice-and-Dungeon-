/**
 * This is where I create a HumanCharacter class, which extends from the Character class.
 * It has a Wizard and Knight subclass.
 */
public class HumanCharacter extends Character {
    public HumanCharacter(String name) {
        super(name);
    }

    public static class Wizard extends HumanCharacter {
        public Wizard(String name) {
            super(name);
        }
    }

    public static class Knight extends HumanCharacter {
        public Knight(String name) {
            super(name);
        }
    }
}
