// Question24


import java.util.Scanner;
public class Question24{
    public static void main(String[] args){
        System.out.println("Leap Year Checker");
        System.out.println("Enter your year:");
        Scanner scanner = new Scanner(System.in);
        int year=scanner.nextInt();

        if(year%400==0){
            System.out.println("Its a Leap Year");
            }else if(year%100 ==0){
                System.out.println("Its not a leap year");
            }else if(year%4==0){
                System.out.println("Its a Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }

            scanner.close();
        }
    }
