package lab01c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Integer numInput = getInt("Please enter a number:");
        String stringInput = getString("Please enter a string:");
        System.out.printf("The number is %d and the string is %s\n", numInput, stringInput);
        theLunchQueue();
    }

    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in); // Why I can't close non of scanner?
        System.out.println(prompt);
        try {
            Integer num = scanner.nextInt();
            return num;
        } catch (InputMismatchException error) {
            Integer num = getInt(prompt);
            return num;
        }
    }

    public static String getString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input;
    }

    public static void theLunchQueue() {
        String mainCourse = getString("What main dish would you like(Fish, Burger or veg)?");
        Integer potatoes = getInt("How many roast potatoes would you like?");
        Integer sprouts = getInt("How many Brussel Sprouts would you like?");
        System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts.\n", mainCourse,
                potatoes, sprouts);
    }
}
