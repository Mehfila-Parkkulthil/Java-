// Question 6
// Create a program that takes two numbers and shows result of all arithmetic operations

import java.util.Scanner;
public class Question6 {
    public static void main (String[] args){
        System.out.println("Lets calculate all operations of two numbers a and b");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a= scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();
        
        int sum = a +b;
        int difference = a-b;
        int product = a*b;
        int reminder = a%b;
        int quotient = a/b;

        System.out.println("Sum:"+ sum);
        System.out.println("Difference: " + difference);
         System.out.println("Product:"+ product);
          System.out.println("Remainder :"+ reminder);
           System.out.println("Quotient:" + quotient); 

           scanner.close();
    }
    
}
