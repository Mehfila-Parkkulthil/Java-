//Question 25
//Ticket discount Calculator

import java.util.Scanner;
public class Question25 {
    public static void main(String[] args){
        System.out.println("Your Ticket discount calculator");
        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age= scanner.nextInt();
        System.out.println("Are you a female(true/false)");
        boolean female =scanner.nextBoolean();
        
        if(age<5){
            System.out.println("You get 75% discount");
        }else if(female){
            System.out.println("You get 50% discount.");
        }else if(age>60 && !female){
            System.out.println("You get 25% discount");
        }else{
            System.out.println("No discount");
        }

        scanner.close();
    
    }

    
}
