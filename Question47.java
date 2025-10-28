//Question 47
// Create a program to form Inverted left half pyramid

import java.util.Scanner;
public class Question47{
    public static void main(String[] args) {
        System.out.println("Lets create inverted left half pyramid");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = scanner.nextInt();
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        scanner.close();
        
        }
    }

}