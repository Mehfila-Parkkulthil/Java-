//Question 51
//Write a function that calculates the factorial of a given number.

import java.util.*;
public  class Question51{
    public static void main(String[] args){
        System.out.println("Hi , lets calculate factorial");
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        
        long fact=1;
        int i=num;
        while (i>=1) {
            fact *=i;
            i--;    
        }
        System.out.println("So your factorial of " + num +" is " + fact);

        scanner.close();
    }

}