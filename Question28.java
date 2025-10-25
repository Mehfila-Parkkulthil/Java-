// Question 28
// Create a program using XOR operator

import java.util.Scanner;
 public class Question28 {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise 'XOR' Operator");
        System.out.println("Enter two numbers");
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();


        System.out.println();
        System.out.println("XOR operator: " + (a ^ b) );

         scanner.close();


    }
    
}