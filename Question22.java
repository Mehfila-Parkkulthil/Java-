//Question 22

import java.util.Scanner;
public class Question22{
    public static void main(String[] args){
        System.out.println("Check your grade here!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = scanner.nextInt();

        if(score>=90){
            System.out.println("Congrats!! , A Grade");
        }else if(score>=75 && score<=90){
            System.out.println("Well done, B Grade");
        }else if(score>=60 && score<=75){
            System.out.println("Good job, C Grade");
        }else if(score>=30 && score<=60){
            System.out.println("You can do better, D Grade");
        }else{
            System.out.println("E Grade . Its okay,try next time");
        }
    }
}