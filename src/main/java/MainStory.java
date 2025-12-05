
import java.util.Scanner;

public class MainStory {

    public static void startStory(String selectedClass, String selectedBoss) {

        Scanner Input = new Scanner(System.in);
            //stage 1 of the story, origin story start
            System.out.println("");
            String StartLine = String.format("""
                    +------------------------------------------------------------------+
                    |You awaken in the shadowed ruins of The Fallen Gate,              |
                    |the air thick with dust and echoing distant tremors.              |
                    |As your senses return, you steady yourself —                      |
                    |the resolve of a seasoned %s settles into your bones.         |
                    |Somewhere deep below, you hear a low rumble… the presence of      |
                    |%s stirs. Three passageways stretch before you, each leading  |
                    |deeper into the ancient dungeon.                                  |
                    +------------------------------------------------------------------+
                    """, selectedClass, selectedBoss);
            System.out.println(StartLine);
            boolean storyline = true;
            while (storyline) {

                System.out.println("""
                                +------------------------------------+
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
                //Scanner Input = new Scanner(System.in);
                try {
                    int firstStage = Input.nextInt();
                    if (firstStage >= 1 && firstStage <= 3) {
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
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    storyline = true;
                    Input.nextLine(); // Clear the scanner buffer
                }
            }
        }



    private static void stage1Forest(String selectedClass, String selectedBoss) {
        System.out.println(" Selected: Forest Hall");

        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6); // prints out the number you roll and the dice art
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            String forestRoll1or2 = String.format("""
                    The ruins shudder and shift beneath your feet.
                    A hidden pathway collapses.
                    You scramble, but the dungeon rejects your presence.
                    Darkness swallows you, and you never move beyond the Fallen Gate.
                    Even as a %s your journey ends here — before it begins.
                    """, selectedBoss);
            System.out.println(forestRoll1or2);
            System.exit(0);// Exits the game

        } else if (roll >= 3 && roll <= 4) {
            //roll 3/4 this is the outcome if they pick number 1
            String forestRoll3or4 = String.format("""
                    Roots coil along the walls like veins, ancient murals peeking through.
                    The ground trembles faintly — signs of %s stirring below.
                    """, selectedBoss);
            System.out.println(forestRoll3or4);

            boolean stage1ForestOptionsOne = true;
            while (stage1ForestOptionsOne) {

                System.out.println("""
                                +---------------------------+
                                |                           |
                                |   what do you do next?    |
                                |___________________________|
                                |                           |
                                |   1.Continue              |
                                |   2.Duck Under Root       |
                                |   3.Inspect Murals        |
                                |                           |
                                +---------------------------+
                        """);

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner input = new Scanner(System.in);
                try {
                int forestSelections = input.nextInt();
//                        if (forestSelections >= 1 && forestSelections <= 3) {
//                            stage1ForestOptionsOne = true;
//                        } else {
//                            System.out.println(forestSelections + " - Invalid option. Please try again.");
//                            stage1ForestOptionsOne = true;
//                        }

                    if (forestSelections >= 1 && forestSelections <= 3) {
                        StageTwo.stage2Stealth(selectedClass, selectedBoss);// this takes you to the next stage
                        input.nextLine();
                        stage1ForestOptionsOne = false;
                    } else {
                        System.out.println(forestSelections + " - Invalid option. Please try again.");
                        stage1ForestOptionsOne = true;
                        input.nextLine(); // Clear the scanner buffer

                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1ForestOptionsOne = true;
                    input.nextLine(); // Clear the scanner buffer
                }
            }
        } else if (roll >= 5 && roll <= 6) {
            String forestRoll5or6 = String.format("""
                    You move like a shadow between brambles.
                    Glowing runes react to your %s presence.
                    The air warms — %s lingers ahead.
                    """, selectedClass, selectedBoss);
            System.out.println(forestRoll5or6);

            boolean stage1ForestOptionsTwo = true;
            while (stage1ForestOptionsTwo) {

                System.out.println("""
                                +---------------------------+
                                |                           |
                                |   what do you do next?    |
                                |___________________________|
                                |                           |
                                |  1.Advance                |
                                |  2.Touch Rune             |
                                |  3.Climb Roots            |
                                |                           |
                                +---------------------------+
                        """);

                System.out.println("");

                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner input = new Scanner(System.in);
                try {
                int forestSelectionsTwo = input.nextInt();
//                        if (forestSelectionsTwo >= 1 && forestSelectionsTwo <= 3) {
//                            stage1ForestOptionsTwo = true;
//                        } else {
//                            System.out.println(forestSelectionsTwo + " - Invalid option. Please try again.");
//                            stage1ForestOptionsTwo = true;
//                        }

                    if (forestSelectionsTwo >= 1 && forestSelectionsTwo <= 3) {
                        StageTwo.stage2Stealth(selectedClass, selectedBoss);// this takes you to the next stage
                        input.nextLine();
                        stage1ForestOptionsTwo = false;
                    } else {
                        System.out.println(forestSelectionsTwo + " - Invalid option. Please try again.");
                        stage1ForestOptionsTwo = true;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1ForestOptionsTwo = true;
                    input.nextLine(); // Clear the scanner buffer
                }
            }
        }
    }


        private static void stage1Wetstone (String selectedClass, String selectedBoss){
            System.out.println("Selected: Wetstone Tunnels");
            //System.out.println("You rolled a " + Dice.dice(6));

            int roll = Dice.dice(6);
            //roll 1/2 this is the end of the line
            if (roll >= 1 && roll <= 2) {
                String wetstoneRoll1or2 = String.format("""
                        The ruins shudder and shift beneath your feet.
                        A hidden passage collapses.
                        You scramble, but the dungeon rejects your presence.
                        Darkness swallows you, and you never move beyond the Fallen Gate.
                        Even as a %s your journey ends here — before it begins.
                        """, selectedClass);
                System.out.println(wetstoneRoll1or2);
                System.exit(0);

            } else if (roll >= 3 && roll <= 4) {
                //roll 3/4 this is the outcome if they pick number 2
                String wetstoneRoll3or4 = String.format("""
                        Water trickles along slick stone.
                        The rhythmic boom from below shakes droplets loose,
                        echoing the approach of %s
                        """, selectedBoss);
                System.out.println(wetstoneRoll3or4);

                boolean stage1WetstoneOptionsOne = true;
                while (stage1WetstoneOptionsOne) {

                    System.out.println("""
                                    +---------------------------+
                                    |                           |
                                    |   what do you do next?    |
                                    |___________________________|
                                    |                           |
                                    |  1.Cross Ledge            |
                                    |  2.Wade Forward           |
                                    |  3.Toss Stone             |
                                    |                           |
                                    +---------------------------+
                            """);

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                    Scanner input = new Scanner(System.in);
                    try {
                        int forestSelections = input.nextInt();
//                    if (forestSelections >= 1 && forestSelections <= 3) {
//                        stage1WetstoneOptionsOne = true;
//                    } else {
//                        System.out.println(forestSelections + " - Invalid option. Please try again.");
//                        stage1WetstoneOptionsOne = true;
//                    }
                        if (forestSelections >= 1 && forestSelections <= 3) {
                            StageTwo.stage2Stealth(selectedClass, selectedBoss);
                            input.nextLine();
                            stage1WetstoneOptionsOne = false;
                        } else {
                            System.out.println(forestSelections + " - Invalid option. Please try again.");
                            stage1WetstoneOptionsOne = true;
                            input.nextLine(); // Clear the scanner buffer
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        stage1WetstoneOptionsOne = true;
                        input.nextLine(); // Clear the scanner buffer
                    }
                }
            }
            if (roll >= 5 && roll <= 6) {
                //roll 5/6 this is the outcome if they pick number 2
                String stealthRoll5or6 = String.format("""
                        You glide over wet stone with expert balance.
                        Reflections distort unnaturally,
                        as though the dungeon watches a %s pass.
                        """, selectedClass);
                System.out.println(stealthRoll5or6);

                boolean stage1WetstoneOptionsTwo = true;
                while (stage1WetstoneOptionsTwo) {


                    System.out.println("""
                                    +---------------------------+
                                    |                           |
                                    |   what do you do next?    |
                                    |___________________________|
                                    |                           |
                                    |  1.Leap Stream            |
                                    |  2.Probe Depth            |
                                    |  3.Hug Wall               |
                                    |                           |
                                    +---------------------------+
                            """);

                    System.out.println("");

                    // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                    //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                    Scanner Input = new Scanner(System.in);
                    try {
                        int weststoneSelections = Input.nextInt();
//                    if (weststoneSelections == 1 || weststoneSelections == 2 || weststoneSelections == 3) {
//                        stage1WetstoneOptionsTwo = true;
//                    } else {
//                        System.out.println(weststoneSelections + " - Invalid option. Please try again.");
//                        stage1WetstoneOptionsTwo = true;
//                    }
                        if (weststoneSelections >= 1 && weststoneSelections <= 3) {
                            StageTwo.stage2Combat(selectedClass, selectedBoss);
                            Input.nextLine();
                            stage1WetstoneOptionsTwo = false;
                        } else {
                            System.out.println(weststoneSelections + " - Invalid option. Please try again.");
                            stage1WetstoneOptionsTwo = true;
                            Input.nextLine(); // Clear the scanner buffer
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 - 3.");
                        stage1WetstoneOptionsTwo = true;
                        Input.nextLine(); // Clear the scanner buffer
                    }

                }
            }
        }


        private static void stage1Stairwell (String selectedClass, String selectedBoss){
            boolean stage1Staitwellstart = true;
            Scanner Input = new Scanner(System.in);

            while (stage1Staitwellstart) {
                System.out.println(" Selected : Broken Stairwell");
                //System.out.println("You rolled a " + Dice.dice(6));

                int roll = Dice.dice(6);
                //roll 1/2 this is the end of the line
                if (roll >= 1 && roll <= 2) {
                    String stairwellRoll1or2 = String.format("""
                            The ruins shudder and shift beneath your feet.
                            A hidden trap snaps open.
                            You scramble, but the dungeon rejects your presence.
                            Darkness swallows you, and you never move beyond the Fallen Gate.
                            Even as a %s your journey ends here — before it begins.
                            """, selectedClass);
                    System.out.println(stairwellRoll1or2);
                    System.exit(0);

                } else if (roll >= 3 && roll <= 4) {

                    //roll 3/4 this is the outcome if they pick number 3

                    System.out.println("Cracks spiderweb across the descent. Cold wind rises");
                    System.out.println("carrying faint hints of " + selectedBoss + "'s power");

                    boolean stage1StariwellOptionsOne = true;
                    while (stage1StariwellOptionsOne) {

                        System.out.println("""
                                        +---------------------------+
                                        |                           |
                                        |   what do you do next?    |
                                        |___________________________|
                                        |                           |
                                        |   1.Slow Step             |
                                        |   2.Brace Wall            |
                                        |   3.Jump Gap              |
                                        +---------------------------+
                                """);

                        System.out.println("");

                        // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                        //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                        //Scanner Input = new Scanner(System.in);
                        try {
                            int stairwellSelections = Input.nextInt();
//                            if (stairwellSelections >= 1 && stairwellSelections <= 3) {
//                                stage1StariwellOptionsOne = true;
//                            } else {
//                                System.out.println(stairwellSelections + " - Invalid option. Please try again.");
//                                stage1StariwellOptionsOne = true;
//                            }
                            if (stairwellSelections >= 1 && stairwellSelections <= 3) {
                                StageTwo.stage2Combat(selectedClass, selectedBoss);
                                Input.nextLine();
                                stage1StariwellOptionsOne = false;
                            } else {
                                System.out.println(stairwellSelections + " - Invalid option. Please try again.");
                                stage1StariwellOptionsOne = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a number between 1 - 3.");
                            stage1StariwellOptionsOne = true;
                            Input.nextLine(); // Clear the scanner buffer
                        }
                    }
                }
                if (roll >= 5 && roll <= 6) {
                    //roll 5/6 this is the outcome if they pick number 3
                    System.out.println(" Your movement is clean, precise. The " + selectedClass);
                    System.out.println("must have passed this way as the signs are clear");

                    boolean stage1StariwellOptionsTwo = true;
                    while (stage1StariwellOptionsTwo) {

                        System.out.println("""
                                        +---------------------------+
                                        |                           |
                                        |   what do you do next?    |
                                        |___________________________|
                                        |                           |
                                        |   1.Charge                |
                                        |   2.Listen                |
                                        |   3.Examine               |
                                        +---------------------------+
                                """);

                        System.out.println("");

                        // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                        //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                        //Scanner Input = new Scanner(System.in);
                        try {
                            int stairwellSelections = Input.nextInt();
//                            if (stairwellSelections >= 1 && stairwellSelections <= 3) {
//                                stage1StariwellOptionsTwo = true;
//                            } else {
//                                System.out.println(stairwellSelections + " - Invalid option. Please try again.");
//                                stage1StariwellOptionsTwo = true;
//                            }
                            if (stairwellSelections >= 1 && stairwellSelections <= 3) {
                                StageTwo.stage2Mystic(selectedClass, selectedBoss);
                                Input.nextLine();
                                stage1StariwellOptionsTwo = false;
                            } else {
                                System.out.println(stairwellSelections + " - Invalid option. Please try again.");
                                stage1StariwellOptionsTwo = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a number between 1 - 3.");
                            stage1StariwellOptionsTwo = true;
                            Input.nextLine(); // Clear the scanner buffer
                        }

                    }
                }
            }
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter a number between 1 - 3.");
//            Input.nextLine(); // Clear the scanner buffer
        }
    }
