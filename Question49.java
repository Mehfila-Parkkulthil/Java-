//Question 49
// Create a program right half pyramid

import java.util.Scanner;
public class Question49{
    public static void main(String[] args) {
        
        System.out.println("Right Half Pyramid");
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a number:");
        int n =scanner.nextInt();

        right(n);
        scanner.close();

    }

    public static void right(int n){
        int i=1;
        while(i<=n){

            int j= 1;
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }

            int y =1;
            while(y<=i){
                System.out.print("*");
                y++;
            }
            i++;
            System.out.println();
        }
    }
}

