public class ElfCharacter {
    private String name;

    //private String weapon;
    public ElfCharacter(String name)//String weapon)
    {
        this.name = name;
        //this.weapon = weapon;
    }

    public String toString() {
        return "Name: " + name;
    }
   // public String getWeapon() {
       // return weapon;
    //}

    public class WoodElf extends ElfCharacter {
        private String name;

        public WoodElf(String name)//, String weapon){

        {
            super(name);// weapon
            this.name = name;
        }

    }

    public class HighElf extends ElfCharacter {
        private String name;

        public HighElf(String name)//, String weapon){

        {
            super(name);// weapon
            this.name = name;
        }

    }

}
