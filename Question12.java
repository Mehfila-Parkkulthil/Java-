//Question12
// Create a program to check if a number is positive or negative

import java.util.*;
public class Question12 {
    public static void main (String[] args){
        System.out.println("Hello World");
        System.out.println("Lets check if a number is positive or negative");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scanner.nextInt();
    
        if(a>=0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    
    }
}
