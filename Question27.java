// Question 27
// Create a program to calculate Bitwise OR operator

import java.util.Scanner;
 public class Question27 {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise 'OR' Operator");
        System.out.println("Enter two numbers");
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();


        System.out.println();
        System.out.println("OR operator: " + (a | b) );

        
 scanner.close();

    }
    
}