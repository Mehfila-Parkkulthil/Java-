//Question10
// Create a program to convert temperature from Celsius to Fahrenheit

import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Hi");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();
        
        // Formula to convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
