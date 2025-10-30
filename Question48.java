//Question 48 - chang3
//Create a program for Inverted Right half pyramid


import java.util.Scanner;
public class Question48{
    public static void main(String[] args){
        System.out.println("Inverted Right Half Pyramid");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n=scanner.nextInt();

        System.out.println();

            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                
                // stars
                for(int y=1;y<=1;y++){
                    System.out.print("*");
                }

                System.out.println();
            }
      
       }
          scanner.close();}}
       
    

        
       
    
