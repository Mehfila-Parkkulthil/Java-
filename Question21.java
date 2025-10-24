//Question 21
// Solve quadratic equation and find roots if a=1 ; b=5;c=2;


import java.util.Scanner;
public class Question21{
    public static void main(String[] args){
        System.out.println("");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a:");
        double a= scanner.nextDouble();
        System.out.println("Enter b:");
        double b= scanner.nextDouble(); 
        System.out.println("Enter c:");
        double c= scanner.nextDouble();

        double result = (b*b)-(4*a*c);
        double denominator = 2*a;

        double root1 = ((-b) - (Math.pow(result, 0.5)))/ (denominator ) ;

        double root2 = ((-b) + (Math.pow(result, 0.5)))/ (denominator) ;

        if(result <= 0){
            System.out.println("They do not have any real roots.");
        }else{
            System.out.println("The two roots are" + root1 + "and" + root2);
        }
    }
}