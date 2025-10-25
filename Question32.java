//Question 32
//Create a program that shows bitwise compliment of a number

import java.util.Scanner;

public class Question32{
    public static void main(String[] args){
        System.out.println("Bitwise Compliment Operator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scanner.nextInt();
        int number = ~ num;

        System.out.println("Compliment number :" + number);
        
        scanner.close();
    }
}