// Question 44
// Create a program using loop to build solid rectangle

import java.util.*;
public class Question44{
    public static void main(String[] args){
        System.out.println("Lets create star solid rectangle!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        for(int i = 1;i<=rows;i++){;
            for(int j=1;j<=columns;j++){
                System.out.print(" * ");
            }
            System.err.println();
        }

        sc.close();
    }
}