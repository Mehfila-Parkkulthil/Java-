//Question 29
//Create a program using Left shift operator 

import java.util.Scanner;
 public class Question29 {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Left shift  Operator");
        System.out.println("Enter two numbers (a<<b)");
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();


        System.out.println();
        System.out.println("Left shift operator: " + (a << b) );
         scanner.close();
    }
    
}