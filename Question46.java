// Question 46
// Create program to form half pyramid

import java.util.Scanner;
public class Question46{
    public static void main(String[] args){
        System.out.println("Lets draw half pyramid");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=scanner.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}