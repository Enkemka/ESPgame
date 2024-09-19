/*
 * Class: CMSC203 
 * Instructor:
 * Description: (the main class asks the user to play a game, the game uses a random method to see if the user can guess which color is chosen by the program)
 * Due: 09/17/2024
 * Platform/compiler:eclipse ide
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Essemo'o Nkemka
 */


import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        final String COLOR_RED = "red";
        final String COLOR_GREEN = "green";
        final String COLOR_BLUE = "blue";
        final String COLOR_ORANGE = "orange";
        final String COLOR_YELLOW = "yellow";

        int amountRight = 0;
        String randomColor = "";
        String colorSelected = "";
        int randomNum = 0;
        
        System.out.println("what is your name\n");
        String userName = myObj.nextLine();

        System.out.println("what is your M number\n");
        String ID = myObj.nextLine();

        System.out.println("tell me a sentece about your self\n");
        String sentence = myObj.nextLine();

        System.out.println("what is the due date\n");
        String dueDate = myObj.nextLine();

        for (int round = 1; round < 12; round++) {
            System.out.println("Round " + round + "\n \nI am thinking of a color.\n" +
                "Is it Red, Green, Blue, Orange, or Yellow?\n" +
                "Enter your guess: \n");
            colorSelected = myObj.nextLine();
            //take input 
            
            //switch case and random number generation to assign random number to the random num variable
            randomNum = (int)(Math.random() * 5) + 1;
            switch (randomNum) {
                case 1:
                    randomColor = COLOR_RED;
                    break;
                case 2:
                    randomColor = COLOR_GREEN;
                    break;
                case 3:
                    randomColor = COLOR_BLUE;
                    break;
                case 4:
                    randomColor = COLOR_ORANGE;
                    break;
                case 5:
                    randomColor = COLOR_YELLOW;
                    break;
                default:
                   
            }

            if (colorSelected.equalsIgnoreCase(randomColor)) {
               
                amountRight++;
            }
         //make sure number typed is one of the right ones 
            while (!colorSelected.toLowerCase().equals(COLOR_RED)  &&
            		!colorSelected.toLowerCase().equals(COLOR_GREEN)  &&
            		!colorSelected.toLowerCase().equals(COLOR_BLUE)  &&
            		!colorSelected.toLowerCase().equals(COLOR_ORANGE)  &&
            		!colorSelected.toLowerCase().equals(COLOR_YELLOW)){
                System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\n" +
                    "Enter your guess again:");
                colorSelected = myObj.nextLine();     
    }

            System.out.println("I was thinking of " + randomColor + "\n");
        }

        System.out.println("Game Over\n" +
            "You guessed " + amountRight + " out of 10 colors correctly.\n");

        System.out.println("Student Name:" + userName + "\n" +
            "User Description:\n" + sentence + "\n" +
            "Due Date:" + dueDate);
    }
}