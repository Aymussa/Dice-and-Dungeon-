public class HumanCharacter {
    private String name;

    //private String weapon;
    public HumanCharacter(String name)//String weapon)
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

    public class Wizard extends HumanCharacter{
        private String name;

        public Wizard(String name)//, String weapon){

        {
            super(name);// weapon
            this.name = name;
        }

    }

    public class Knight extends HumanCharacter{
        private String name;

        public Knight(String name)//, String weapon){

        {
            super(name);// weapon
            this.name = name;
        }

    }

}
