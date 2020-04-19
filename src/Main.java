import java.awt.desktop.SystemSleepEvent;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            // Pick odds or evens
        System.out.println("Let's play a game called \"Odds And Evens\"");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();
        if (choice.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked Odds! The computer will be Evens.");
        } else if (choice.equalsIgnoreCase("E")){
            System.out.println(name + " has picked Evens! The computer will be Odds.");
        } else {
            System.out.println("Input not valid");
            System.exit(001);
        }
        lineSeperator();
            // Play the game
        System.out.print(" How many \"fingers\" do you put out? ");
        int numOfFingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");

        lineSeperator();

        int sum = numOfFingers + computer;
        System.out.println(numOfFingers + "+" + computer + "=" + sum );

        boolean oddOrEven = sum % 2 == 0;

        if (oddOrEven == true) {
            System.out.println(sum +" is ...even!");
            if (numOfFingers == 0 || numOfFingers == 2 || numOfFingers == 4){
                System.out.println(name + "won! Your number was Even!");
            } else {
                System.out.println(name + " lost! Your number was Odd!");
            }
        } else {
            System.out.println(sum + " is...odd!");
            if (numOfFingers == 0 || numOfFingers == 2 || numOfFingers == 4) {
                System.out.println(name + " lost! Your number was Even!");
            } else {
                System.out.println(name + " won! Your number was Odd!");
            }
        }
        lineSeperator();
    }

    public static void lineSeperator() {
        for (int i = 0; i <= 20; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
