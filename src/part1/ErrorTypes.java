
package part1;

import java.util.Scanner;

public class ErrorTypes {

    public static void main(String[] args) {
        /*
        3 types of errors: syntax, runtime, logic
        */
        
        //syntax -> type error, program won't run;
        //int x = 45
        
        //runtime -> the program starts but crashes or throws error while running
        //can be avoided by using try/catch
        Scanner s = new Scanner(System.in);
        
        int candy = 100;
        int howmany, eachgets;
        System.out.println("How many people are you giving candy to? ");
        howmany = s.nextInt();
        try{
            eachgets = candy / howmany;
        }catch(Exception e){
            System.out.println("You are too greedy - you lost all candies");
            return;
        }
        System.out.println("Each person gets " + eachgets);
        

        //logic error -> program runs, never crashes but does not do what it should do
        //hardest type to detect because compiler never complains
        System.out.print("Enter wage / hr >");
        double wage = s.nextDouble();
        System.out.println("Enter hours worked >");
        double hours = s.nextDouble();
        double pay = wage + hours; //error, should be wage * hours
        System.out.println("Your pay is $" + pay);
        
        
        
        
       
    }
    
    
    

  
    
}
