
import java.util.Scanner;

public class MainStory {

    public static void startStory(String selectedClass, String selectedBoss) {
        //stage 1 of the story, origin story start
        System.out.println("");
        System.out.println("""
                        +--------------------------------------------------------------+
                        |You awaken in the shadowed ruins of The Fallen Gate,          |
                        |the air thick with dust and echoing distant tremors.          |
                        |As your senses return, you steady yourself —                  |
                        |the resolve of a seasoned """+ selectedClass+
                """
                        settles into your bones.  |
                        Somewhere deep below, you hear a low rumble… the presence of   |
                        """ + selectedBoss +
                """
                         stirs. Three passageways stretch before you, each leading |
                        |deeper into the ancient dungeon.                              |
                        """);


        boolean storyline = true;
        while (storyline) {

            System.out.println("""
                            +-----------------------------------+
                            | which path are you going to take ? |
                            |____________________________________|
                            |                                    |
                            |    1.Forest Hall                   |
                            |    2.Wetstone Tunnels              |
                            |    3.Broken Stairwell              |
                            |                                    |
                            +------------------------------------+
                    """);
            System.out.println("");

            // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
            //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
            Scanner Input = new Scanner(System.in);
            int firstStage = Input.nextInt();
            if (firstStage == 1 || firstStage == 2 || firstStage == 3) {
                storyline = true;
            } else {
                System.out.println(firstStage + " - Invalid option. Please try again.");
                storyline = true;
            }
            if (firstStage == 1) {
                MainStory.stage1Forest(selectedClass, selectedBoss);
                Input.nextLine();
                storyline = false;
            } else if (firstStage == 2) {
                MainStory.stage1Wetstone(selectedClass, selectedBoss);
                Input.nextLine();
                storyline = false;
            } else if (firstStage == 3) {
                MainStory.stage1Stairwell(selectedClass, selectedBoss);
                Input.nextLine();
                storyline = false;

            }
        }
    }


    private static void stage1Forest(String selectedClass, String selectedBoss) {
        System.out.println(" Selected: Forest Hall");

        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6); // prints out the number you roll and the dice art
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    The ruins shudder and shift beneath your feet.
                    A hidden pathway collapses.
                    You scramble, but the dungeon rejects your presence.
                    Darkness swallows you, and you never move beyond the Fallen Gate.
                    Even as a"""
                    + selectedClass +
                    """
                            your journey ends here — before it begins.
                            """);
        }

        if (roll >= 3 && roll <= 4) {
            //roll 3/4 this is the outcome if they pick number 1
            System.out.println("""
                    Roots coil along the walls like veins, ancient murals peeking through.
                    The ground trembles faintly — signs of """ + selectedBoss +
                    """
                             stirring below.
                            """);
            boolean stage1ForestOptionsOne = true;
            while (stage1ForestOptionsOne) {


                System.out.println("1.Continue \n2.Duck Under Root \n3.Inspect Murals");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner Input = new Scanner(System.in);
                int forestSelections = Input.nextInt();
                if (forestSelections == 1 || forestSelections == 2 || forestSelections == 3) {
                    stage1ForestOptionsOne = true;
                } else {
                    System.out.println(forestSelections + " - Invalid option. Please try again.");
                    stage1ForestOptionsOne = true;
                }
                if (forestSelections == 1 || forestSelections == 2 || forestSelections == 3) {
                    StageTwo.stage2Stealth(selectedClass, selectedBoss);
                    Input.nextLine();
                    stage1ForestOptionsOne = false;
                } else {
                    System.out.println("invalid pick");

                }
            }
        }

            //roll 5/6 this is the outcome if they pick number 1
            if (roll >= 5 && roll <= 6) {
                System.out.println("""
                        You move like a shadow between brambles.
                        Glowing runes react to your """ + selectedClass +
                        """
                                presence. The air warms — """ + selectedBoss +
                        """
                                lingers ahead.
                                """);
                boolean stage1ForestOptionsTwo = true;
                while (stage1ForestOptionsTwo) {


                    System.out.println("1.Advance \n2.Touch Rune \n3.Climb Roots");

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                    Scanner InputTwo = new Scanner(System.in);
                    int forestSelectionsTwo = InputTwo.nextInt();
                    if (forestSelectionsTwo == 1 || forestSelectionsTwo == 2 || forestSelectionsTwo == 3) {
                        stage1ForestOptionsTwo = true;
                    } else {
                        System.out.println(forestSelectionsTwo + " - Invalid option. Please try again.");
                        stage1ForestOptionsTwo = true;
                    }
                    if (forestSelectionsTwo == 1 || forestSelectionsTwo == 2 || forestSelectionsTwo == 3) {
                        StageTwo.stage2Stealth(selectedClass, selectedBoss);
                        InputTwo.nextLine();
                        stage1ForestOptionsTwo = false;
                    } else {
                        System.out.println("invalid pick");

                    }
                }
            }
        }

    private static void stage1Wetstone(String selectedClass, String selectedBoss) {
        System.out.println(" Selected: Wetstone Tunnels");
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    The ruins shudder and shift beneath your feet.
                    A hidden passage collapses.
                    You scramble, but the dungeon rejects your presence.
                    Darkness swallows you, and you never move beyond the Fallen Gate.
                    Even as a"""
                    + selectedClass +
                    """
                            your journey ends here — before it begins.
                            """);
        } else if (roll >= 3 && roll <= 4) {
            //roll 3/4 this is the outcome if they pick number 2
            System.out.println("""
                    Water trickles along slick stone.
                    The rhythmic boom from below shakes droplets loose,
                    echoing the approach of """ + selectedBoss);

            boolean stage1WetstoneOptionsOne = true;
            while (stage1WetstoneOptionsOne) {

                System.out.println("1.Cross Ledge \n2.Wade Forward \n3.Toss Stone");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner Input = new Scanner(System.in);
                int forestSelections = Input.nextInt();
                if (forestSelections == 1 || forestSelections == 2 || forestSelections == 3) {
                    stage1WetstoneOptionsOne = true;
                } else {
                    System.out.println(forestSelections + " - Invalid option. Please try again.");
                    stage1WetstoneOptionsOne = true;
                }
                if (forestSelections == 1 || forestSelections == 2 || forestSelections == 3) {
                    StageTwo.stage2Stealth(selectedClass, selectedBoss);
                    Input.nextLine();
                    stage1WetstoneOptionsOne = false;
                } else {
                    System.out.println("invalid pick");

                }
            }
        }
            if (roll >= 5 && roll <= 6) {
                //roll 5/6 this is the outcome if they pick number 2
                System.out.println("""
                        You glide over wet stone with expert balance.
                        Reflections distort unnaturally,
                        as though the dungeon watches a [class] pass.
                        """);
                boolean stage1WetstoneOptionsTwo = true;
                while (stage1WetstoneOptionsTwo) {


                System.out.println("1.Leap Stream \n2.Probe Dept \n3.Hug Wall");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner Input = new Scanner(System.in);
                int weststoneSelections = Input.nextInt();
                if (weststoneSelections == 1 || weststoneSelections == 2 || weststoneSelections == 3) {
                    stage1WetstoneOptionsTwo = true;
                } else {
                    System.out.println(weststoneSelections + " - Invalid option. Please try again.");
                    stage1WetstoneOptionsTwo = true;
                }
                if (weststoneSelections == 1 || weststoneSelections == 2 || weststoneSelections == 3) {
                    StageTwo.stage2Combat(selectedClass, selectedBoss);
                    Input.nextLine();
                    stage1WetstoneOptionsTwo = false;
                } else {
                    System.out.println("invalid pick");
                }

                }
            }


    }

    private static void stage1Stairwell(String selectedClass, String selectedBoss) {
        System.out.println(" Selected : Broken Stairwell");
        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    The ruins shudder and shift beneath your feet.
                    A hidden trap snaps open.
                    You scramble, but the dungeon rejects your presence.
                    Darkness swallows you, and you never move beyond the Fallen Gate.
                    Even as a """ + selectedClass +" your journey ends here — before it begins.");
        } else if (roll >= 3 && roll <= 4) {

            //roll 3/4 this is the outcome if they pick number 3
            System.out.println("""
                    Cracks spiderweb across the descent. Cold wind rises,
                    carrying faint hints of """ + selectedBoss + "— ash");

            boolean stage1StariwellOptionsOne = true;
            while (stage1StariwellOptionsOne) {

                System.out.println("1.Slow Step \n2.Brace Wall \n3.Jump Gap");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner Input = new Scanner(System.in);
                int stairwellSelections = Input.nextInt();
                if (stairwellSelections == 1 || stairwellSelections == 2 || stairwellSelections == 3) {
                    stage1StariwellOptionsOne = true;
                } else {
                    System.out.println(stairwellSelections + " - Invalid option. Please try again.");
                    stage1StariwellOptionsOne = true;
                }
                if (stairwellSelections == 1 || stairwellSelections == 2 || stairwellSelections == 3) {
                    StageTwo.stage2Combat(selectedClass, selectedBoss);
                    Input.nextLine();
                    stage1StariwellOptionsOne = false;
                } else {
                    System.out.println("invalid pick");

                }
            }
        }

            if (roll >= 5 && roll <= 6) {
                //roll 5/6 this is the outcome if they pick number 3
                System.out.println("""
                        Your movement is clean, precise. The  """+ selectedClass+
                        "must have passed this way as the signs are clear");

                boolean stage1StariwellOptionsTwo = true;
                while (stage1StariwellOptionsTwo) {

                    System.out.println("1.Charge \n2.Listen \n3.Examine");

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                    Scanner Input = new Scanner(System.in);
                    int stairwellSelections = Input.nextInt();
                    if (stairwellSelections == 1 || stairwellSelections == 2 || stairwellSelections == 3) {
                        stage1StariwellOptionsTwo = true;
                    } else {
                        System.out.println(stairwellSelections + " - Invalid option. Please try again.");
                        stage1StariwellOptionsTwo = true;
                    }
                    if (stairwellSelections == 1 || stairwellSelections == 2 || stairwellSelections == 3) {
                        StageTwo.stage2Mystic(selectedClass, selectedBoss);
                        Input.nextLine();
                        stage1StariwellOptionsTwo = false;
                    } else {
                        System.out.println("invalid pick");

                    }
                }
            }
    }
}
