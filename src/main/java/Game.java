import java.util.Scanner;


public class Game {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Hello and welcome to the D&D game!");
        System.out.println("Let's get started!");

        System.out.print("What is your name? ");
        String firstName = Input.nextLine();
        System.out.println("\nWelcome, " + firstName + "! Let's begin your D&D adventure!");


        boolean characterClass = true;

        while (characterClass) {
            System.out.println("What character class would you like to choose");

            System.out.println("Please select from the following options ? : ");
            System.out.println();
            System.out.println("Option 1: Wizard");
            System.out.println("Option 2: Elf");
            System.out.println("Option 3: Warrior");
            System.out.println();

            try {
                int viewOption = Input.nextInt();
                if (viewOption == 1 || viewOption == 2 || viewOption == 3) {
                    characterClass = true;
                } else {
                    System.out.println(viewOption + " - Invalid option. Please try again.");
                    characterClass = true;
                }
                if (viewOption == 1) {
                    System.out.println("Congratulations " + firstName + " you have selected option 1 ");
                    System.out.println();
                    System.out.println("You have chosen to be an Wizard");
                    System.out.println();
                    Input.nextLine();
                    boolean characterChange = true;

                    while (characterChange) {
                        System.out.println("Would you like to change character? yes / no");
                        String characterOption = Input.nextLine().toLowerCase();
                        System.out.println();


                        if ((!characterOption.equals("yes")) && (!characterOption.equals("no"))) {
                            System.out.println(characterOption + " This is an invalid respond");

                            characterChange = true; // keep asking the user the option question
                        } else if (characterOption.equals("yes")) {
                            System.out.println("Great");
                            characterClass = true; //keep the outer loop running
                            characterChange = false; // EXIt this inner loop
                            //mainStory = true; // exit the option question loop
                        } else {// if user enters no - it carries on the game
                            System.out.println("Great, Choose your final boss. \n Option 1: Dragon \n Option 2: Dark Knight \n Option 3: Cerberus)");
                            boolean finalBoss = true;
                            while (finalBoss) {
                                try {
                                    int boosOption = Input.nextInt();
                                    if (boosOption == 1 || boosOption == 2 || boosOption == 3) {
                                        finalBoss = true;
                                        //finalBoss = false; //exit the option question loop
                                        //mainStory = true; // enteres the main store
                                    } else {
                                        System.out.println(boosOption + " - Invalid option. Please try again.");
                                        finalBoss = true;
                                    }
                                    boolean finalBoosChange = true;
                                    if (boosOption == 1) {
                                        System.out.println("Congratulations " + firstName + " you have selected option 1 ");
                                        System.out.println();
                                        System.out.println("Your final boss is: Dragon");
                                        System.out.println();
                                        Input.nextLine();

                                        while (finalBoosChange) {
                                            System.out.println("Would you like to change your final boss yes / no");
                                            String responseBoosOption = Input.nextLine().toLowerCase();
                                            System.out.println();


                                            if ((!responseBoosOption.equals("yes")) && (!responseBoosOption.equals("no"))) {
                                                System.out.println(responseBoosOption + " This is an invalid respond");

                                                //finalBoosChange = true; // keep asking the user the option question
                                            } else if (responseBoosOption.equals("yes")) {
                                                finalBoss = true; // keep asking the user the option question
                                                //finalBoosChange = false; // EXIT the inner loop

                                            } else {
                                                System.out.println("Great, lets begin your adventure!");
                                                finalBoosChange = false;
                                                MainStory.startStory();// exit the option question loop
                                            }

                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                                    Input.nextLine(); // Clear the scanner buffer
                                    characterClass = true;

                                }
                                System.out.println();
                            }
                        }
                    }

                } else if (viewOption == 2) {
                    System.out.println("Congratulations " + firstName + " you have selected option 2 ");
                    System.out.println();
                    System.out.println("You have chosen to be an Elf");
                    System.out.println();
                    Input.nextLine();

                    boolean proceedOption2 = true;

                    System.out.println("Would you like to return to the Option Menu? yes / no");
                    String responseOption2 = Input.nextLine().toLowerCase();
                    System.out.println();

                    while (proceedOption2) {
                        if ((!responseOption2.equals("yes")) && (!responseOption2.equals("no"))) {
                            System.out.println(responseOption2 + "This is an invalid respond");
                            proceedOption2 = true; // keep asking the user the option question
                        } else if (responseOption2.equals("yes")) {
                            System.out.println("Great");
                            characterClass = true;
                            proceedOption2 = false; // exit the option question loop
                        } else {
                            System.out.println("The Programme will exit now. \nGoodbye!");
                            characterClass = false;
                            proceedOption2 = false; // exit the option question loop
                        }
                    }
                } else if (viewOption == 3) {
                    System.out.println("Congratulations " + firstName + " you have selected option 3 ");
                    System.out.println();
                    System.out.println("You have chosen to be an Warrior");
                    System.out.println();
                    Input.nextLine();

                    boolean proceedOption3 = true;
                    while (proceedOption3) {
                        System.out.println("Would you like to return to the Option Menu?  / no");
                        String responseOption3 = Input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!responseOption3.equals("yes")) && (!responseOption3.equals("no"))) {
                            System.out.println(responseOption3 + "This is an invalid respond");
                            proceedOption3 = true; // keep asking the user the option question
                        } else if (responseOption3.equals("yes")) {
                            System.out.println("Great");
                            characterClass = true;
                            proceedOption3 = false; // exit the option question loop
                        } else {
                            System.out.println("The Programme will exit now. \nGoodbye!");
                            characterClass = false;
                            proceedOption3 = false; // exit the option question loop
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 3.");
                Input.nextLine(); // Clear the scanner buffer
                characterClass = true;

            }
            System.out.println();




        }



    }
}
//}
//}
