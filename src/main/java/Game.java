import java.util.Scanner;


public class Game {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Hello and welcome to the D&D game!");
        System.out.println("Let's get started!");

        System.out.print("What is your name? ");
        String playerName = Input.nextLine();
        System.out.println("\nWelcome, " + playerName + "! Let's begin your D&D adventure!");


        boolean selectingCharacter = true;

        while (selectingCharacter) {
            System.out.println("What character class would you like to choose");

            System.out.println("Please select from the following options ? : ");
            System.out.println();
            System.out.println("Option 1: Wizard");
            System.out.println("Option 2: Elf");
            System.out.println("Option 3: Warrior");
            System.out.println();

            String selectedClass = "";
            String selectedBoss = "";

            try {
                int characterOptions = Input.nextInt();
                if (characterOptions == 1 || characterOptions == 2 || characterOptions == 3) {
                    selectingCharacter = true;
                } else {
                    System.out.println(characterOptions + " - Invalid option. Please try again.");
                    selectingCharacter = true;
                }
                if (characterOptions == 1) {
                    selectedClass = "Wizard";
                    System.out.println("Congratulations " + playerName + " you have selected option 1 ");
                    System.out.println();
                    System.out.println("You have chosen to be a " + selectedClass);
                    System.out.println();
                    Input.nextLine();

                    boolean confirmClass = true;

                    while (confirmClass) {
                        System.out.println("Would you like to change character? yes / no");
                        String characterChange1 = Input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!characterChange1.equals("yes")) && (!characterChange1.equals("no"))) {
                            System.out.println(characterChange1 + " This is an invalid respond");
                            confirmClass = true; // keep asking the user the option question

                        } else if (characterChange1.equals("yes")) {
                            System.out.println("Great");
                            selectingCharacter = true; //keep the outer loop running

                        } else if (characterChange1.equals("no")){
                            confirmClass = false; // EXIt this inner loop
                        }


//                        } else {// if user enters no - it carries on the game

//                            boolean finalBoss1 = true;
//
//                            while (finalBoss1) {
//                                System.out.println("Great, Choose your final boss. \n Option 1: Dragon \n Option 2: Dark Knight \n Option 3: Cerberus");
//                                try {
//                                    int boosOption1 = Input.nextInt();
//                                    if (boosOption1 == 1 || boosOption1 == 2 || boosOption1 == 3) {
//                                        finalBoss1 = true;
//                                    } else {
//                                        System.out.println(boosOption1 + " - Invalid option. Please try again.");
//                                        finalBoss1 = true;
//                                    }
//                                    boolean finalBoosChange = true;
//
//                                    if (boosOption1 == 1) {
//                                        selectedBoss = "Dragon";
//                                        System.out.println("Congratulations " + playerName + " you have selected option 1 ");
//                                        System.out.println();
//                                        System.out.println("Your final boss is: " + selectedBoss);
//                                        System.out.println();
//                                        Input.nextLine();
//
//                                        while (finalBoosChange) {
//                                            System.out.println("Would you like to change your final boss yes / no");
//                                            String responseBoosOption = Input.nextLine().toLowerCase();
//                                            System.out.println();
//
//                                            if ((!responseBoosOption.equals("yes")) && (!responseBoosOption.equals("no"))) {
//                                                System.out.println(responseBoosOption + " This is an invalid respond");
//
//                                                finalBoosChange = true; // keep asking the user the option question
//                                            } else if (responseBoosOption.equals("yes")) {
//                                                finalBoosChange = false; // EXIT the inner loop
//                                                finalBoss1 = true; // keep asking the user the option question
//
//                                            } else {
//                                                System.out.println("Great, lets begin your adventure!");
//                                                finalBoss1 = false;
//                                                finalBoosChange = false;
//                                                // Change this line when you want to exit the main character selection loop
//                                                selectingCharacter = false;
//                                                MainStory.startStory(selectedClass, selectedBoss);// exit the option question loop and enter the main story arc
//                                            }
//                                        }
//                                    }
//                                } catch (Exception e) {
//                                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
//                                    Input.nextLine(); // Clear the scanner buffer
//                                    selectingCharacter = true;
//                                }
//                                System.out.println();
//                            }

                    }
                } else if (characterOptions == 2) {
                    selectedClass = "Elf";
                    System.out.println("Congratulations " + playerName + " you have selected option 2 ");
                    System.out.println();
                    System.out.println("You have chosen to be an " + selectedClass);
                    System.out.println();
                    Input.nextLine();

                    boolean characterOption2 = true;

                    while (characterOption2) {
                        System.out.println("Would you like to change character? yes / no");
                        String characterChange2 = Input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!characterChange2.equals("yes")) && (!characterChange2.equals("no"))) {
                            System.out.println(characterChange2 + " This is an invalid respond");
                            characterOption2 = true; // keep asking the user the option question

                        } else if (characterChange2.equals("yes")) {
                            System.out.println("Great");
                            selectingCharacter = true; //keep the outer loop running
                            characterOption2 = false; // exit the inner loop
                            // Change this line when you want to exit the main character selection loop

//                        } else {
//                            boolean finalBoss2 = true;
//
//                            while (finalBoss2) {
//                                System.out.println("Great, Choose your final boss. \n Option 1: Dragon \n Option 2: Dark Knight \n Option 3: Cerberus");
//                                try {
//                                    int boosOption2 = Input.nextInt();
//                                    if (boosOption2 == 1 || boosOption2 == 2 || boosOption2 == 3) {
//                                        finalBoss2 = true;
//                                    } else {
//                                        System.out.println(boosOption2 + " - Invalid option. Please try again.");
//                                        finalBoss2 = true;
//                                    }
//
//                                    boolean finalBoosChange = true;
//
//                                    if (boosOption2 == 2) {
//                                        selectedBoss = "Dark Knight";
//                                        System.out.println("Congratulations " + playerName + " you have selected option 2 ");
//                                        System.out.println();
//                                        System.out.println("Your final boss is: " + selectedBoss);
//                                        System.out.println();
//                                        Input.nextLine();
//
//                                        while (finalBoosChange) {
//                                            System.out.println("Would you like to change your final boss? yes / no");
//                                            String responseBoosOption = Input.nextLine().toLowerCase();
//                                            System.out.println();
//
//                                            if ((!responseBoosOption.equals("yes")) && (!responseBoosOption.equals("no"))) {
//                                                System.out.println(responseBoosOption + " This is an invalid respond");
//
//                                                finalBoosChange = true; // keep asking the user the option question
//                                            } else if (responseBoosOption.equals("yes")) {
//
//                                                finalBoss2 = true; // keep asking the user the option question
//                                                //finalBoosChange = false; // EXIT the inner loop
//                                            } else {
//                                                System.out.println("Great, lets begin your adventure!");
//                                                finalBoss2 = false;
//                                                finalBoosChange = false;
//                                                // Change this line when you want to exit the main character selection loop
//                                                selectingCharacter = false;
//                                                MainStory.startStory(selectedClass, selectedBoss);// exit the option question loop and enter the main story arc
//                                            }
//                                        }
//                                    }
//                                } catch (Exception e) {
//                                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
//                                    Input.nextLine(); // Clear the scanner buffer
//                                    selectingCharacter = true;
//
//                                }
//                                System.out.println();
//                            }
                        }
                    }
                } else if (characterOptions == 3) {
                    selectedClass = "Warrior";
                    System.out.println("Congratulations " + playerName + " you have selected option 3 ");
                    System.out.println();
                    System.out.println("You have chosen to be an " + selectedClass);
                    System.out.println();
                    Input.nextLine();

                    boolean characterOption3 = true;

                    while (characterOption3) {
                        System.out.println("Would you like to change your final boss? yes / no");
                        String characterChange3 = Input.nextLine().toLowerCase();
                        System.out.println();

                        if ((!characterChange3.equals("yes")) && (!characterChange3.equals("no"))) {
                            System.out.println(characterChange3 + "This is an invalid respond");
                            characterOption3 = true; // keep asking the user the option question

                        } else if (characterChange3.equals("yes")) {
                            System.out.println("Great");
                            selectingCharacter = true; //keep the outer loop running
                            characterOption3 = false; // exit this inner loop
                            // Change this line when you want to exit the main character selection loop

//                        } else {
//                            boolean finalBoss3 = true;
//
//                            while (finalBoss3) {
//                                System.out.println("Great, Choose your final boss. \n Option 1: Dragon \n Option 2: Dark Knight \n Option 3: Cerberus");
//
//                                try {
//                                    int boosOption3 = Input.nextInt();
//                                    if (boosOption3 == 1 || boosOption3 == 2 || boosOption3 == 3) {
//                                        finalBoss3 = true;
//                                    } else {
//                                        System.out.println(boosOption3 + " - Invalid option. Please try again.");
//                                        finalBoss3 = true;
//                                    }
//                                    boolean finalBoosChange = true;
//
//                                    if (boosOption3 == 3) {
//                                        selectedBoss = "Cerberus";
//                                        System.out.println("Congratulations " + playerName + " you have selected option 3 ");
//                                        System.out.println();
//                                        System.out.println("Your final boss is: " + selectedBoss);
//                                        System.out.println();
//                                        Input.nextLine();
//
//                                        while (finalBoosChange) {
//                                            System.out.println("Would you like to change your final boss yes / no");
//                                            String responseBoosOption = Input.nextLine().toLowerCase();
//                                            System.out.println();
//
//
//                                            if ((!responseBoosOption.equals("yes")) && (!responseBoosOption.equals("no"))) {
//                                                System.out.println(responseBoosOption + " This is an invalid respond");
//                                                //finalBoosChange = true; // keep asking the user the option question
//
//                                            } else if (responseBoosOption.equals("yes")) {
//                                                finalBoss3 = true; // keep asking the user the option question
//                                                //finalBoosChange = false; // EXIT the inner loop
//
//                                            } else {
//                                                System.out.println("Great, lets begin your adventure!");
//                                                finalBoss3 = false;
//                                                finalBoosChange = false;
//                                                // Change this line when you want to exit the main character selection loop
//                                                selectingCharacter = false;
//                                                MainStory.startStory(selectedClass, selectedBoss);// exit the option question loop and enter the main story arc
//                                            }
//                                        }
//                                    }
//                                } catch (Exception e) {
//                                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
//                                    Input.nextLine(); // Clear the scanner buffer
//                                    selectingCharacter = true;
//
//                                }
//                                System.out.println();
//                            }
                        }
                    }
                }
            } catch (
                    Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 - 3.");
                Input.nextLine(); // Clear the scanner buffer
                selectingCharacter = true;

                System.out.println();
            }

            // if user enters no - it carries on the game
            boolean finalBoss1 = true;

            while (finalBoss1) {
                System.out.println("Great, Choose your final boss. \n Option 1: Dragon \n Option 2: Dark Knight \n Option 3: Cerberus");
                try {
                    int boosOption1 = Input.nextInt();
                    if (boosOption1 == 1 || boosOption1 == 2 || boosOption1 == 3) {
                        finalBoss1 = true;
                    } else {
                        System.out.println(boosOption1 + " - Invalid option. Please try again.");
                        finalBoss1 = true;
                    }
                    boolean finalBoosChange = true;

                    if (boosOption1 == 1) {
                        selectedBoss = "Dragon";
                        System.out.println("Congratulations " + playerName + " you have selected option 1 ");
                        System.out.println();
                        System.out.println("Your final boss is: " + selectedBoss);
                        System.out.println();
                        Input.nextLine();

                        while (finalBoosChange) {
                            System.out.println("Would you like to change your final boss yes / no");
                            String responseBoosOption = Input.nextLine().toLowerCase();
                            System.out.println();

                            if ((!responseBoosOption.equals("yes")) && (!responseBoosOption.equals("no"))) {
                                System.out.println(responseBoosOption + " This is an invalid respond");

                                finalBoosChange = true; // keep asking the user the option question
                            } else if (responseBoosOption.equals("yes")) {
                                finalBoosChange = false; // EXIT the inner loop
                                finalBoss1 = true; // keep asking the user the option question

                            } else {
                                System.out.println("Great, lets begin your adventure!");
                                finalBoss1 = false;
                                finalBoosChange = false;
                                // Change this line when you want to exit the main character selection loop
                                selectingCharacter = false;
                                MainStory.startStory(selectedClass, selectedBoss);// exit the option question loop and enter the main story arc
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 - 3.");
                    Input.nextLine(); // Clear the scanner buffer
                    selectingCharacter = true;
                }
                System.out.println();
            }
        }
    }
}