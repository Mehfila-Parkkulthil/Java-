//Question 45
//Create a program to form hollow rectangle

import java.util.Scanner;
public class Question45 {
    public static void main(String[] args) {
        System.out.println("Lets draw a hollow rectangle");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows= scanner.nextInt();
        System.out.println("Enter number of columns");
        int columns= scanner.nextInt();


        for(int i=1;i<=rows;i++){
            for(int j =1;j<=columns;j++){
                 if(i==1||j==1||i==rows||j==columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }

        scanner.close();
    
}}
