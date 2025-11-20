
import java.util.Scanner;

public class MainStory {

    public static void startStory(String selectedClass, String selectedBoss) {
        System.out.println("welcome");
        //stage 1 of the story, origin story start

        System.out.println("""
                You awaken in the shadowed ruins of The Fallen Gate,
                the air thick with dust and echoing distant tremors. As your senses return,
                you steady yourself — the resolve of a seasoned 
                """
                + selectedClass +
                """
                settles into your bones.
                Somewhere deep below, you hear a low rumble… the presence of
                """
                + selectedBoss +
                """
                stirs. Three passageways stretch before you, each leading deeper into the ancient dungeon.
                """);


        boolean storyline = true;
        while (storyline) {

            System.out.println("1.Forest Hall \n2.Wetstone Tunnels \n3.Broken Stairwell");
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
                MainStory.stage1Option1(selectedClass, selectedBoss);
                Input.nextLine();
                storyline = false;
            } else if (firstStage == 2) {
                //MainStory.stage1Option2();
                Input.nextLine();
                storyline = false;
            } else if (firstStage == 3) {
                // MainStory.stage1Option3();
                Input.nextLine();
                storyline = false;

            }
        }
    }


    private static void stage1Option1(String selectedClass, String selectedBoss) {
        System.out.println(" Selected: Forest Hall");

        //System.out.println("You rolled a " + Dice.dice(6));

        int roll = Dice.dice(6);
        //roll 1/2 this is the end of the line
        if (roll >= 1 && roll <= 2) {
            System.out.println("""
                    The ruins shudder and shift beneath your feet.
                    A hidden pathway collapses.
                    You scramble, but the dungeon rejects your presence.
                    Darkness swallows you, and you never move beyond the Fallen Gate.
                    Even as a [class], your journey ends here — before it begins.
                    """);

        }

        if (roll >= 3 && roll <= 4) {
            //roll 3/4 this is the outcome if they pick number 1
            System.out.println("""
                    Roots coil along the walls like veins, ancient murals peeking through.
                    The ground trembles faintly — signs of [boss-title] stirring below.
                    """);
//            boolean stage1Option2Mid = true;
//            while (stage1Option2Mid) {
//
//                System.out.println("1.Continue \n2.Duck Under Root \n3.Inspect Murals");
//
//                System.out.println("");
//
//                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
//                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
//                Scanner Input = new Scanner(System.in);
//                int secondStage = Input.nextInt();
//                if (secondStage == 1 || secondStage == 2 || secondStage == 3) {
//                    stage1Option2Mid = true;
//                } else {
//                    System.out.println(secondStage + " - Invalid option. Please try again.");
//                    stage1Option2Mid = true;
//                }
//                if (secondStage == 1 && secondStage == 2 && secondStage == 3) {
//                    //MainStory.stage2Option1Roll();
//                    Input.nextLine();
//                    stage1Option2Mid = false;
//                } else {
//                    System.out.println("invalid pick");
//                }
//            }

        }

        //roll 5/6 this is the outcome if they pick number 1
        if (roll >= 5 && roll <= 6) {
            System.out.println("""
                    You move like a shadow between brambles.
                    Glowing runes react to your"""
                    + selectedClass +
                    """
                    presence.
                    The air warms — """
                    +  selectedBoss +

                    """
                    lingers ahead.
                    """);
            boolean stage1Option2Mid = true;
            while (stage1Option2Mid) {

                System.out.println("1.Continue \n2.Duck Under Root \n3.Inspect Murals");

                System.out.println("");

                // after user picks one of the options and if the dice lands on 1/2 their story ends regardless of the options picked
                //if the dice lands 3/4 or 4/5 it goes to stage 2 of the story
                Scanner Input = new Scanner(System.in);
                int secondStage = Input.nextInt();
                if (secondStage == 1 || secondStage == 2 || secondStage == 3) {
                    stage1Option2Mid = true;
                } else {
                    System.out.println(secondStage + " - Invalid option. Please try again.");
                    stage1Option2Mid = true;
                }
                if (secondStage == 1 || secondStage == 2 || secondStage == 3) {
                    //MainStory.stage2Option1Roll();
                    Input.nextLine();
                    stage1Option2Mid = false;
                } else {
                    System.out.println("invalid pick");


                }
            }
        }
    }

        private static void stage1Option2 () {
            System.out.println(" Selected: Wetstone Tunnels");
            //System.out.println("You rolled a " + Dice.dice(6));

            int roll = Dice.dice(6);
            //roll 1/2 this is the end of the line
            if (roll >= 1 && roll <= 2) {
                String selectedClass ="";
                System.out.println("""
                        The ruins shudder and shift beneath your feet.
                        A hidden passage collapses.
                        You scramble, but the dungeon rejects your presence.
                        Darkness swallows you, and you never move beyond the Fallen Gate.
                        Even as a"""
                        +selectedClass +
                        """
                        your journey ends here — before it begins.
                        """);
            } else if (roll >= 3 && roll <= 4) {
                //roll 3/4 this is the outcome if they pick number 2
                System.out.println("""
                        Water trickles along slick stone.
                        The rhythmic boom from below shakes droplets loose,
                        echoing the approach of [boss-title].
                        """);
            }
            if (roll >= 5 && roll <= 6) {
                //roll 5/6 this is the outcome if they pick number 2
                System.out.println("""
                        You glide over wet stone with expert balance.
                        Reflections distort unnaturally,
                        as though the dungeon watches a [class] pass.
                        """);
            }

        }

        private static void stage1Option3 () {
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
                        Even as a [class], your journey ends here — before it begins.
                        """);
            } else if (roll >= 3 && roll <= 4) {

                //roll 3/4 this is the outcome if they pick number 3
                System.out.println("""
                        Cracks spiderweb across the descent. Cold wind rises,
                        carrying faint hints of [boss-sign] — ash, steel, or sulfur.
                        """);
            }

            if (roll >= 5 && roll <= 6) {
                //roll 5/6 this is the outcome if they pick number 3
                System.out.println("""
                        Your movement is clean, precise.
                        Claw marks / scorch marks / blade marks reveal [boss] passed this way.
                        """);
            }


        }

        private static void stage2Option1Roll () {
            //System.out.println(" Selected : Forest Hall");
            //System.out.println("You rolled a " + Dice.dice(6));

            int roll = Dice.dice(6);
            //roll 1/2 this is the end of the line
            if (roll >= 1 && roll <= 2) {
                System.out.println("""
                        The dungeon is alive with peril. Roots snap. You claw, but gravity,
                        overwhelms you. The echo of [boss-title] passes unseen above as
                        your story ends in the cold, unyielding depths.
                        """);
            } else if (roll >= 3 && roll <= 4) {

                //roll 3/4 this is the outcome if they pick number 3
                System.out.println("""
                        You advance quietly, sensing patrols ahead and faint tremors of
                        [boss-title] deeper down. Shadows shift, offering hidden routes.
                        """);
            }

            if (roll >= 5 && roll <= 6) {
                //roll 5/6 this is the outcome if they pick number 3
                System.out.println("""
                        
                        """);
            }
        }

//    private static void stage2Option1Holl() {
//        //System.out.println(" Selected : Forest Hall");
//        //System.out.println("You rolled a " + Dice.dice(6));
//
//        int roll = Dice.dice(6);
//        //roll 1/2 this is the end of the line
//        if (roll >= 1 && roll <= 2) {
//            System.out.println("""
//                    The dungeon is alive with peril. Roots snap. You claw, but gravity,
//                    overwhelms you. The echo of [boss-title] passes unseen above as
//                    your story ends in the cold, unyielding depths.
//                    """);
//        } else if (roll >= 3 && roll <= 4) {
//
//            //roll 3/4 this is the outcome if they pick number 3
//            System.out.println("""
//
//                    """);
//        }
//
//        if (roll >= 5 && roll <= 6) {
//            //roll 5/6 this is the outcome if they pick number 3
//            System.out.println("""
//
//                    """);
//        }


    }

//private static void stage2Option2Roll2() {
//    //System.out.println(" Selected : Wetstone Tunnels");
//    //System.out.println("You rolled a " + Dice.dice(6));
//
//    int roll = Dice.dice(6);
//    //roll 1/2 this is the end of the line
//    if (roll >= 1 && roll <= 2) {
//        System.out.println("""
//                The dungeon is alive with peril. Water surges.
//                You swim, but the current, overwhelms you.
//                The echo of [boss-title] passes unseen above
//                as your story ends in the cold, unyielding depths.
//                """);
//    } else if (roll >= 3 && roll <= 4) {
//
//        //roll 3/4 this is the outcome if they pick number 3
//        System.out.println("""
//
//                """);
//    }
//
//    if (roll >= 5 && roll <= 6) {
//        //roll 5/6 this is the outcome if they pick number 3
//        System.out.println("""
//
//                """);
//    }
//}

//    private static void stage2Option2Highroll() {
//        //System.out.println(" Selected : Wetstone Tunnels");
//        //System.out.println("You rolled a " + Dice.dice(6));
//
//        int roll = Dice.dice(6);
//        //roll 1/2 this is the end of the line
//        if (roll >= 1 && roll <= 2) {
//            System.out.println("""
//                    The dungeon is alive with peril. Water surges.
//                    You swim, but the current, overwhelms you.
//                    The echo of [boss-title] passes unseen above
//                    as your story ends in the cold, unyielding depths.
//                    """);
//        } else if (roll >= 3 && roll <= 4) {
//
//            //roll 3/4 this is the outcome if they pick number 3
//            System.out.println("""
//
//                    """);
//        }
//
//        if (roll >= 5 && roll <= 6) {
//            //roll 5/6 this is the outcome if they pick number 3
//            System.out.println("""
//
//                    """);
//        }

//    private static void stage2Option3Roll3() {
//    //System.out.println(" Selected : Broken Stairwell");
//    //System.out.println("You rolled a " + Dice.dice(6));
//
//    int roll = Dice.dice(6);
//    //roll 1/2 this is the end of the line
//    if (roll >= 1 && roll <= 2) {
//        System.out.println("""
//                 The dungeon is alive with peril. Stone gives way. You fight,
//                but the crushing stone overwhelms you. The echo of [boss-title]
//                passes unseen above as your story ends in the cold, unyielding depths.
//                """);
//    } else if (roll >= 3 && roll <= 4) {
//
//        //roll 3/4 this is the outcome if they pick number 3
//        System.out.println("""
//
//                """);
//    }
//
//    if (roll >= 5 && roll <= 6) {
//        //roll 5/6 this is the outcome if they pick number 3
//        System.out.println("""
//
//                """);
//    }


//}
//    private static void stage2Option3Highroll() {
//        //System.out.println(" Selected : Broken Stairwell");
//        //System.out.println("You rolled a " + Dice.dice(6));
//
//        int roll = Dice.dice(6);
//        //roll 1/2 this is the end of the line
//        if (roll >= 1 && roll <= 2) {
//            System.out.println("""
//                    The dungeon is alive with peril. Stone gives way. You fight,
//                    but the crushing stone overwhelms you. The echo of [boss-title]
//                    passes unseen above as your story ends in the cold, unyielding depths.
//                    """);
//        } else if (roll >= 3 && roll <= 4) {
//
//            //roll 3/4 this is the outcome if they pick number 3
//            System.out.println("""
//
//                    """);
//        }
//
//        if (roll >= 5 && roll <= 6) {
//            //roll 5/6 this is the outcome if they pick number 3
//            System.out.println("""
//
//                    """);
//        }


//}