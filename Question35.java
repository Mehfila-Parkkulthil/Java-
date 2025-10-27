//Question35
//Write a function that calculates the factorial of a given number.

import java.util.Scanner;
public class Question35{
    public static void main(String[] args){
        System.out.println("Lets do factorial");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        long Product = factorial(num);
        System.out.println("Factorial is " + Product );

        scanner.close();
    }

    public static long factorial(int num){
       long prod =1;
       int i =1;
       while(i<=num){
        prod*=i;
        i++;
       }
         return prod;

    }
}