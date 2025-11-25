import java.util.Scanner;

public class StageThree {

    public static void stage3Mystic(String selectedClass, String selectedBoss) {

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    Magical energy arcs around the chamber, responding violently to your """+ selectedClass + """
                    presence. You attempt to harness it, but the raw force backlashes. Sparks
                    ignite, runes shatter, and the dungeon consumes you whole. """+selectedBoss+"""
                     senses the disturbance, but your attempt ends in fiery ruin.
                    """);
        }
        else if(roll >= 3 && roll <= 4){
            System.out.println("""
                    The magic of the dungeon overwhelms your senses. You stumble
                    through twisting halls, runes burning around you. Eventually,
                    you find a narrow escape, but the final seal prevents any progress toward """+selectedBoss+"""
                    . Survival comes at the price of failing your quest.
                    """);


        } else if (roll >= 5 && roll <= 6) {

            //roll 3/4/5/6 this is the outcome if they pick number 3
            System.out.println("You emerge silently. "+selectedBoss+" lifts its head toward you, sensing your presence.");

            boolean stage3Mystic = true;
            while (stage3Mystic) {

                System.out.println("Press 1 for your final dice roll");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                Scanner Input = new Scanner(System.in);
                int MysticSelections = Input.nextInt();
                if (MysticSelections == 1 ) {
                    stage3Mystic = true;
                } else {
                    System.out.println(MysticSelections + " - Invalid option. Please try again.");
                    stage3Mystic = true;
                }
                if (MysticSelections == 1) {
                    StageFour.stage4Final(selectedClass, selectedBoss);
                    Input.nextLine();
                    stage3Mystic = false;
                } else {
                    System.out.println("invalid pick");
                }
            }
        }
    }


    public static void stage3Combat(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    Stones tumble, weapons fall, and the ground shakes.
                    You struggle, pushing against debris and fallen enemies,
                    but the weight is too much. As a """+selectedClass+
                    """
                    strength cannot overcome sheer ruin. The dungeon’s power crushes you, leaving only silence
                    """);

        } else if (roll >= 3 && roll <= 4) {

            //roll 3/4/5/6 this is the outcome if they pick number 3
            System.out.println("""
                    You face formidable foes in the ruins, fighting with all your might.
                    Despite bravery, the enemies prove too strong. Wounded, you withdraw,leaving
                    """);
            System.out.println(selectedBoss+" undisturbed. Your "+selectedClass+" training saved your life,");
            System.out.println("but victory eludes you.");
        } else if (roll >= 5 && roll <= 6) {
            System.out.println("""
                    You stride forward confidently. The lair trembles as [boss] rises.
                    """);
            boolean stage3Combat = true;
            while (stage3Combat) {

                System.out.println("Press 1 for your final dice roll");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                Scanner Input = new Scanner(System.in);
                int combatSelection = Input.nextInt();
                if (combatSelection == 1) {
                    stage3Combat = true;
                } else {
                    System.out.println(combatSelection + " - Invalid option. Please try again.");
                    stage3Combat = true;
                }
                if (combatSelection == 1) {
                    StageFour.stage4Final(selectedClass, selectedBoss);
                    Input.nextLine();
                    stage3Combat = false;
                } else {
                    System.out.println("invalid pick");

                }
            }
        }
    }

    public static void stage3Stealth(String selectedClass, String selectedBoss) {
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    The stealthy shadows you sought to navigate turn against you.
                    Darkness engulfs you, unseen claws or tendrils dragging you into the void.
                    Even as a nimble """ +selectedClass +
                    """
                     you cannot escape the dungeon's wrath. """+selectedBoss+"""
                     stirs above, indifferent.
                    """);
        } else if (roll >= 3 && roll <= 4 ) {
            System.out.println("""
                        Shadows and traps nearly overwhelm you, but quick thinking lets you slip through.
                        You emerge battered and shaken. The dungeon keeps its secrets, and """ + selectedBoss+
                        """
                         remains undefeated. Your """+selectedClass+
                        """
                        skills saved you, but at great cost.
                        """);
        }else if (roll >= 5 && roll <= 6) {

                //roll 5/6 this is the outcome if they pick number 3
                System.out.println("The runes blaze, and the chamber opens. "+selectedBoss+ " stands ready.");

                boolean stage3Stealth = true;
                while (stage3Stealth) {

                    System.out.println("Press 1 for your final dice roll");

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 3 of the story
                    Scanner Input = new Scanner(System.in);
                    int stealthSelection = Input.nextInt();
                    if (stealthSelection == 1 ) {
                        stage3Stealth = true;
                    } else {
                        System.out.println(stealthSelection + " - Invalid option. Please try again.");
                        stage3Stealth = true;
                    }
                    if (stealthSelection == 1 ) {
                        StageFour.stage4Final(selectedClass, selectedBoss);
                        Input.nextLine();
                        stage3Stealth = false;
                    } else {
                        System.out.println("invalid pick");
                    }
                }
            }
        }
    }