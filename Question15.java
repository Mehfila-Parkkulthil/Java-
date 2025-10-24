//Question 15
//True or False 

import java.util.Scanner;
public class Question15{
    public static void main(String[] args){
        //just intro
        System.out.println("Welcome to Questionairre");
        System.out.println("Are you ready");

        // adding scanner
        Scanner scanner = new Scanner(System.in);

        //adding questions
        String[] questions ={
            "1. Computers understand high-level languages like Java and C. (true/false)",
            "2. An algorithm is a set of instructions to accomplish a task. (true/false)",
            "3. Java first released in 1992. (true/false)",
            "4. RAM is a type of permanent memory. (true/false)",
            "5. Operating systems manage hardware and software resources. (true/false)",
            "6. Java was named a person who makes good coffee. (true/false)",
            "7. Bytecode is platform independent language.  (true/false)",
            "8.JDK is part of JRE.(true/false)",
            "9.Its optional to declare main method as public.(true/false)",
            "10.class file contains byte code.(true/false)",
            "11.In Java, a variable's name can start with a number.(true/false)",
            "12.char in Java can store a single character. (true/false)",
            "13.Class names in Java typically start with a lowercase letter.(true/false)",
            "14.100L is a valid long literal in Java. (true/false)",
            "15. \t is an escape sequence in Java for a digit character.(true/false)",
            "16.Scanner class is used for reading console input.(true/false)",
            " 17.In Java, an int can be automatically converted to a byte.(true/false)",
            "18.Java variable names are case-sensitive.(true/false)",
            " 19.Scanner class can be used to read both primitive data types and strings.(true/false)",
            "20.Explicit casting is required to convert a double to an int.(true/false)"
           };

        //adding answers
        String[] answers={
            "false", "true", "false", "false", "true","false","true","false","false","true",
            "false","true","false","true","false","true","false","true","true","true"
        };

        int score =0;

        // adding loop
        for(int i=0 ; i< questions.length; i++){

            System.out.println(questions[i]);
            String useranswer= scanner.nextLine();

             if (useranswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Congrats, thats a correct answer");
                score++;
            }else{
                System.out.println("Sorry,thats wrong . \n  The correct answer is  " + answers[i]);
            }
        }
          
        System.out.println("-----------------------------------");
        
        int a=questions.length;
        
        if(score==a){
            System.out.println("Congratulations!!!. You scored " + score + " out of " + questions.length);
        }else{
            System.out.println("You scored " + score + " out of " + questions.length);
        }

        System.out.println("-----------------------------------");
    
        scanner.close();
    }
}