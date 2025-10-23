//Question11
// Create a program to convert temperature from Fahrenheit to Celsius 

import java.util.*;
public class Question11 {
    public static void main(String[] args) {
        System.out.println("Hi");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit:");
        double Fahrenheit = scanner.nextDouble();
        
        // Formula to convert Celsius to Fahrenheit
        double celsius = (Fahrenheit - 32) * 5.0f/9.0f;
        System.out.println("Temperature in celsius: " + Fahrenheit);
        
    }
}
