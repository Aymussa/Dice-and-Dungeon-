public class ElfCharacter extends Character {
    //private String name;

    public ElfCharacter(String name){
        super(name);
        //this.name = name;
    }
   // public String toString(){
       // return "name: " + name;
    //}
    public static class WoodElf extends ElfCharacter{
        //private String name;

        public WoodElf(String name){
            super(name);
            //this.name = name;
        }
        public String toString(){
            return "name: " + getName();
        }
    }
    public static class HighElf extends ElfCharacter{
        //private String name;

        public HighElf(String name){
            super(name);
            //this.name = name;
        }
        public String toString(){
            return "name: " + getName();
        }
    }
}