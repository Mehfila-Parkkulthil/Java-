//Question 19
//Create a program that determines the greatest of three numbers.

import java.util.Scanner;
public class Question19{    
    public static void main(String[] args){
        System.out.println("I can say which is greater among the three numbers you provide.");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b= scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
       if(a >= b && a >= c){
           System.out.println("a is the greatest number.");
       } else if(b >= a && b >= c){
           System.out.println("b is the greatest number.");
       } else {
           System.out.println("c is the greatest number.");
       }
}
}