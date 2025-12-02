public class HumanCharacter extends Character {
    //private String name;

    public HumanCharacter(String name){
        super(name);// weapon
        //this.name = name;
    }
    //public String toString() {
        //return "name: " + name;
    //}
    public static class Wizard extends HumanCharacter{
        //private String name;

        public Wizard(String name){
            super(name);
            //this.name = name;
        }
        public String toString(){
            return "name: " + getName();
        }
    }
    public static class Knight extends HumanCharacter{
        //private String name;

        public Knight(String name){
            super(name);
            //this.name = name;
        }
        public String toString(){
            return "name: " + getName();
        }
    }
}
