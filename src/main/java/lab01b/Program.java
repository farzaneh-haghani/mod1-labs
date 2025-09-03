package lab01b;

import java.util.Scanner;

class Program{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your mark:");
        Integer mark=scanner.nextInt();
        // Integer mark=Integer.parseInt(scanner.nextLine());
        scanner.close();
        if(mark<1 || mark>100){
            throw new ArithmeticException("Error: marks must be between 1..100 ");
        }else if(mark<50){
            System.out.println("Fail");
        }else if(mark>=50 && mark<=60){
            System.out.println("Pass");
        }else if(mark>=61 && mark<=70){
            System.out.println("Merit");
        }else{
            System.out.println("Distinction");
        }
    }
}