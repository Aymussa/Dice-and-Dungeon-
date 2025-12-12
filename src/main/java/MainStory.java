
import java.util.Scanner;

public class MainStory {

    public static void startStory(PlayerCharacter player, Character boss) {
        /*
         * This is where the story starts, where the player is awoken in the shadowed ruins of The Fallen Gate.
         * The player is then given 3 options to choose from, each leading to a different path.
         * each path is withing this mainStory method and is called when the player selects it.
         * after which they would go to stageTwo, StageThree and finally StageFour.
         */
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
                """, player.getName(), boss.getName());
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

            Scanner input = new Scanner(System.in);
            try {

                int firstStage = input.nextInt();
                System.out.println("you have selected Option: " + firstStage);
                if (firstStage >= 1 && firstStage <= 3) {
                    storyline = false;
                } else {
                    System.out.println(firstStage + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                }
                if (firstStage == 1) {
                    MainStory.stage1Forest(player, boss);
                    input.nextLine();
                } else if (firstStage == 2) {
                    MainStory.stage1Wetstone(player, boss);
                    input.nextLine();
                } else if (firstStage == 3) {
                    MainStory.stage1Stairwell(player, boss);
                    input.nextLine();

                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 3.");
                storyline = true;
                input.nextLine();
            }
        }
    }

    private static void stage1Forest(PlayerCharacter player, Character boss) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Selected: Forest Hall");

        int roll = Dice.dice(6);
        if (roll >= 1 && roll <= 2) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\\\|_/\\\\_/__//\\|//
                        """);
                String forestRoll1or2 = String.format("""
                        The ruins shudder and shift beneath your feet.
                        A hidden pathway collapses.
                        You scramble, but the dungeon rejects your presence.
                        Darkness swallows you, and you never move beyond the Fallen Gate.
                        Even as a %s your journey ends here — before it begins.
                        """, boss.getName());
                System.out.println(forestRoll1or2);
                System.exit(0);//loose
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 1 ");
                MainStory.stage1Forest(player, boss);
            }

        } else if (roll >= 3 && roll <= 4) {
            String forestRoll3or4 = String.format("""
                    Roots coil along the walls like veins, ancient murals peeking through.
                    The ground trembles faintly — signs of %s stirring below.
                    """, boss.getName());
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

                try {
                    int forestSelections = input.nextInt();
                    System.out.println("you have selected Option: " + forestSelections);

                    if (forestSelections >= 1 && forestSelections <= 3) {
                        StageTwo.stage2Stealth(player, boss);
                        input.nextLine();
                        stage1ForestOptionsOne = false;
                    } else {
                        System.out.println(forestSelections + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                        stage1ForestOptionsOne = true;
                        input.nextLine();

                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1ForestOptionsOne = true;
                    input.nextLine();
                }
            }
        } else if (roll >= 5 && roll <= 6) {
            String forestRoll5or6 = String.format("""
                    You move like a shadow between brambles.
                    Glowing runes react to your %s presence.
                    The air warms — %s lingers ahead.
                    """, player.getName(), boss.getName());
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

                try {
                    int forestSelectionsTwo = input.nextInt();
                    System.out.println("you have selected Option: " + forestSelectionsTwo);

                    if (forestSelectionsTwo >= 1 && forestSelectionsTwo <= 3) {
                        StageTwo.stage2Stealth(player, boss);
                        input.nextLine();
                        stage1ForestOptionsTwo = false;
                    } else {
                        System.out.println(forestSelectionsTwo + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1ForestOptionsTwo = true;
                    input.nextLine();
                }
            }
        }
    }

    private static void stage1Wetstone(PlayerCharacter player, Character boss) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Selected: Wetstone Tunnels");

        int roll = Dice.dice(6);
        if (roll >= 1 && roll <= 2) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-. 
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\\\|_/\\\\_/__//\\|//
                        """);
                String wetstoneRoll1or2 = String.format("""
                        The ruins shudder and shift beneath your feet.
                        A hidden passage collapses.
                        You scramble, but the dungeon rejects your presence.
                        Darkness swallows you, and you never move beyond the Fallen Gate.
                        Even as a %s your journey ends here — before it begins.
                        """, player.getName());
                System.out.println(wetstoneRoll1or2);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 1 ");
                MainStory.stage1Wetstone(player, boss);
            }

        } else if (roll >= 3 && roll <= 4) {
            String wetstoneRoll3or4 = String.format("""
                    Water trickles along slick stone.
                    The rhythmic boom from below shakes droplets loose,
                    echoing the approach of %s
                    """, boss.getName());
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

                try {
                    int forestSelections = input.nextInt();
                    System.out.println("you have selected Option: " + forestSelections);

                    if (forestSelections >= 1 && forestSelections <= 3) {
                        StageTwo.stage2Stealth(player, boss);
                        input.nextLine();
                        stage1WetstoneOptionsOne = false;
                    } else {
                        System.out.println(forestSelections + " - Invalid option. Please try again. Please enter a number between 1-3.");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1WetstoneOptionsOne = true;
                    input.nextLine();
                }
            }
        }
        if (roll >= 5 && roll <= 6) {
            String stealthRoll5or6 = String.format("""
                    You glide over wet stone with expert balance.
                    Reflections distort unnaturally,
                    as though the dungeon watches a %s pass.
                    """, player.getName());
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

                try {
                    int weststoneSelections = input.nextInt();
                    System.out.println("you have selected Option: " + weststoneSelections);

                    if (weststoneSelections >= 1 && weststoneSelections <= 3) {
                        StageTwo.stage2Combat(player, boss);
                        input.nextLine();
                        stage1WetstoneOptionsTwo = false;
                    } else {
                        System.out.println(weststoneSelections + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                        input.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1WetstoneOptionsTwo = true;
                    input.nextLine();
                }
            }
        }
    }

    private static void stage1Stairwell(PlayerCharacter player, Character boss) {

        Scanner input = new Scanner(System.in);
        //System.out.println("Selected : Broken Stairwell");

        int roll = Dice.dice(6);
        if (roll >= 1 && roll <= 2) {
            player.lostLife();
            player.getLives2();
            if (player.getLives2() == 0) {
                System.out.println("You have lost all your lives");
                System.out.println("""
                            .-'~~~`-.
                          .'         `.
                          |  R  I  P  |
                          |           |
                          |           |
                        \\\\|_/\\\\_/__//\\|//
                        """);
                String stairwellRoll1or2 = String.format("""
                        The ruins shudder and shift beneath your feet.
                        A hidden trap snaps open.
                        You scramble, but the dungeon rejects your presence.
                        Darkness swallows you, and you never move beyond the Fallen Gate.
                        Even as a %s your journey ends here — before it begins.
                        """, player.getName());
                System.out.println(stairwellRoll1or2);
                System.exit(0);
            } else {
                System.out.println("You've fallen this round and lost a life. You now have " + player.getLives2() + " lives remaining. Start again from stage 1 ");
                MainStory.stage1Stairwell(player, boss);
            }

        } else if (roll >= 3 && roll <= 4) {
            System.out.println("Cracks spiderweb across the descent. Cold wind rises");
            System.out.println("carrying faint hints of " + boss.getName() + "'s power");

            boolean stage1StairwellOptionsOne = true;
            while (stage1StairwellOptionsOne) {

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


                try {
                    int stairwellSelections = input.nextInt();
                    System.out.println("you have selected Option: " + stairwellSelections);

                    if (stairwellSelections >= 1 && stairwellSelections <= 3) {
                        StageTwo.stage2Combat(player, boss);
                        input.nextLine();
                        stage1StairwellOptionsOne = false;
                    } else {
                        System.out.println(stairwellSelections + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1StairwellOptionsOne = true;
                    input.nextLine();
                }
            }
        }
        if (roll >= 5 && roll <= 6) {
            System.out.println(" Your movement is clean, precise. The " + player.getName());
            System.out.println("must have passed this way as the signs are clear");

            boolean stage1StairwellOptionsTwo = true;
            while (stage1StairwellOptionsTwo) {

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

                try {
                    int stairwellSelections = input.nextInt();
                    System.out.println("you have selected Option: " + stairwellSelections);

                    if (stairwellSelections >= 1 && stairwellSelections <= 3) {
                        StageTwo.stage2Mystic(player, boss);
                        input.nextLine();
                        stage1StairwellOptionsTwo = false;
                    } else {
                        System.out.println(stairwellSelections + " - Invalid option. Please try again. Please enter a number between 1 - 3.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    stage1StairwellOptionsTwo = true;
                    input.nextLine();
                }
            }
        }
    }
}