//Question 4
//  Create a program to add two numbers 


import java.util.Scanner;

public class Question4 {
    public static void main (String[] args){
    
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hi , Welcome To UNO calculator");
        System.out.println("********************************************");

        System.out.println("What would you like to do ?");
        System.out.println("We will give you both the sum and difference of the number you provide.");
        System.out.println("********************************************");
       
        System.out.println("Enter your first number:");
        int a = scanner.nextInt();
        System.out.println("Enter your second number:");
        int b = scanner.nextInt();
        int c= a + b;
        int d =a - b;
       
        System.out.println("Now Tadaaaaa ✨✨✨✨ ");
        System.out.println("Sum :" + c );
        System.out.println("Difference:" + d);

        scanner.close();

    }

    
}
