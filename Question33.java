//Question33

import java.util.Scanner;
public class Question33{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Odd sum");
        System.out.println("Enter your number");
        int a= scanner.nextInt();
        System.out.println();

        int sum = oddSum(a);

        System.out.println("OddSum till" + a + "is =" + sum ) ;
        scanner.close();

    }

    public static int oddSum(int a){
        int sum =0;
        int i =1;
        while(i<=a){
            sum+=1;
        }
        return 0;
       

    }
}