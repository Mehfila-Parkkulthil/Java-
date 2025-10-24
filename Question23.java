//Question 23
//Create a program that categorise person nto different age groups 
/*
 Child - below 13
 Teen - below 20
 Adult - below 60
 Senior = above 60
 */

import java.util.Scanner;
public class Question23{
    public static void main(String[] args){
        System.out.println("Hi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age= scanner.nextInt();
        if(age>=60){
            System.out.println("SENIOR");
        }else if(age<=60 && age>=20){
            System.out.println("ADULT");
        }else if(age<=20 && age>=13){
            System.out.println("TEEN");
        }else{
            System.out.println("CHILD");
        }
    }
}