/**
 * This is where i create a inheritance super class for the characters, which will then create a subclass for human and elf.
 * the subclass will reuse the name logic from this super class.
 */

public class Character {
    private String name;
    public Character(String name) {
        this.name = name;
    }
/** this is commented out as i would like to use the getName() method from the HumanCharacter and ElfCharacter classes in the future cases
*    public String getName() {
*        return name;
* }
 */
}
