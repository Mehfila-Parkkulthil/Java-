//Question7
//Calculate perimeter of a rectangle

import java.util.Scanner;
public class Question7 {
    public static void main (String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter breadth of rectangle:");
        double breadth = scanner.nextDouble();
        
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }
    
}
