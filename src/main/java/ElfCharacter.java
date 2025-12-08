/**
 * This is where I create a ElfCharacter class, which extends from the Character class.
 * It has a WoodElf and HighElf subclass.
 */
public class ElfCharacter extends Character {
    public ElfCharacter(String name){
        super(name);
    }

    public static class WoodElf extends ElfCharacter{
        public WoodElf(String name){
            super(name);
        }
    }

    public static class HighElf extends ElfCharacter{
        public HighElf(String name){
            super(name);
        }
    }
}