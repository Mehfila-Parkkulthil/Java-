//Question 34
//Find the odd sum

import java.util.Scanner;
public class Question34{
    public static void main(String[] args){
        System.out.println("Lets calculate odd sum  using method function");

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        int Sum = oddSum(num);
        System.out.println("Sum is " + Sum);

        scanner.close();
    }

    public static int oddSum(int num){
        int i = 1;
        int sum =0;
        while(i<=num){
           sum=sum+i;
           i+=2;
        }
        return sum;


    }
}
