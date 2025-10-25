//Question31
// Create a program to print multiplication table


import java.util.Scanner;
public class Question31{
    public static void main(String[] args){
        System.out.println("Enter the number to know its multiplication table");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int a  =scanner.nextInt();

        multiplication(a);
        scanner.close();
    }

    public static void multiplication(int a){
        int i =1;
        while(i<=10){
            System.out.println(a  + "x" + i + "=" + (a*i));
            i++;
        }
    }
    
}
        
    

