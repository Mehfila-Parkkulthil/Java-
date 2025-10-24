//Question 18
//Create a program that determines if a numberr is odd or even.

import java.util.Scanner;
public class Question18{
    public static void main(String[]args){
        System.out.println("Hey, I can detect whether you number is odd or even");
        System.out.println("Enter your number:");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();

        if(a % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

        input.close();
    }
}