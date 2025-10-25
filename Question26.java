// Question 26
//Create a program to calculate Bitwise AND operator

import java.util.Scanner;
 public class Question26 {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitwise 'AND' Operator");
        System.out.println("Enter two numbers");
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();


        System.out.println();
        System.out.println("AND operator: " + (a & b) );

        
        scanner.close();

    }
    
}
