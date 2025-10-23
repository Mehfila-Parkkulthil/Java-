//Question9
//Create a program to calculate simple interest


import java.util.*;
public class Question9 {
    public static void main (String[] args){
        System.out.println("Hi , Welcome to Simple Interest Calculator");
        System.out.println("********************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        int P = scanner.nextInt(); // Principal amount
        System.out.println("Enter Rate of Interest (in %):");
        float R = scanner.nextFloat() ; // Rate of interest
        System.out.println("Enter Time Period (in years):");
        float T = scanner.nextFloat(); // Time in years

        // Simple Interest formula: SI = (P * R * T) / 100
        float SI= (P * R * T) / 100;

        System.out.println("For Principal Amount: " + P);
        System.out.println("At Rate of Interest: " + R + "%");
        System.out.println("Over Time Period: " + T + " years");
        System.out.println("The Simple Interest is: " + SI);

        scanner.close();
    }
    
}
