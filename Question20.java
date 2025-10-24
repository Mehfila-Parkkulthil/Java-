//Question 20
// Create a program that checks if a year is a leap year or not.

import java.util.Scanner;
public class Question20{
    public static void main(String[] args) {
        System.out.println("Lets see if it's a leap year!");
        System.out.println("Enter your favourite year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}