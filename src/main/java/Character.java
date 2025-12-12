/**
 * This is where i create a inheritance super class for the characters, which will then create a subclass for human and elf.
 * the subclass will reuse the name logic from this super class.
 */

public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}

