package lab01c;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Integer numInput=getInt("Please enter a number:");
        String stringInput=getString("Please enter a string:");
        System.out.printf("The number is %d and the string is %s",numInput,stringInput);
    }

     public static int getInt(String prompt){
        System.out.println(prompt);
        Scanner scanner=new Scanner(System.in);  // I couldn't close it due to one main thread error.
        try {
            String num=scanner.nextLine();
            return Integer.parseInt(num);
        } catch(NumberFormatException error){
            Integer numInput=getInt("Please enter a number:");
            return 1;
        }
    }

    public static String getString(String prompt){
        System.out.println(prompt);
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        scanner.close();
        return input;
    }
}
