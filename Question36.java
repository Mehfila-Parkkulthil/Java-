//Question 36
//Create a program  that computes the sum of the digits in a given number

import java.util.Scanner;
public class Question36{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int Sum = sumOfDigits(num);
        System.out.println("Sum of digits : " + 
        Sum);

scanner.close();
    }

    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num =num/10;
        }
        return sum;

    }
}