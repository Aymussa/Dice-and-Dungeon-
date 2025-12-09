/*
 * This is where I create a BossCharacter class, which extends from the Character class.
 * It has a all my boss characters
 */
public class BossCharacter extends Character {
    public BossCharacter(String name) {
        super(name);
    }

    public static class Dragon extends BossCharacter {
        public Dragon(String name) {
            super(name);
        }
    }

    public static class DarkElf extends BossCharacter {
        public DarkElf(String name) {
            super(name);
        }
    }

    public static class Cerberus extends BossCharacter {
        public Cerberus(String name) {
            super(name);
        }
    }

    public static class Goblin extends BossCharacter {
        public Goblin(String name) {
            super(name);
        }
    }
}
