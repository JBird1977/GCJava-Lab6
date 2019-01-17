import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Lab6 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //declare and initialize all variables
        int sides = 0; 
        int result = 0;
        int die1 = 0;
        int die2 = 0;
        String cont = "";
        
       do {
           
       //display welcome message
        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println();
        
        //prompt user to enter amount of sides
        System.out.println("Please enter the number of sides of the die: ");
        sides = scan.nextInt();
        
        //prompt to roll dice
        System.out.println("Press any key to roll the dice!");
        scan.nextLine();
      
        //run the random die roll method
        die1 = generateRandomDieRoll(sides);
        die2 = generateRandomDieRoll(sides);
      
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        
      //check the dice for special combinations
      
      if (die1 == 1 && die2 == 1) {
          System.out.print("Snake eyes!"); 
      }
      if ((die1 + die2) == 2 || die1 + die2 == 3 || die1 + die2 == 12) {
          System.out.println("Craps!");
      }
      
      if (die1 == 6 && die2 == 6) {
          System.out.println("Box cars!");
      }
      
      
      
      System.out.print("Do you want to continue? (y/n) ");
      cont = scan.nextLine();
      
       } while (!(cont.equals("n" )) && !(cont.equals("N")) );
      
        System.out.println("Thank you come again!");
        
    }

    //this method generates a random number and returns the result
    private static int generateRandomDieRoll(int sides) {
        int result = 0;
        //the second parameter in nextInt excludes the top value
        //so we need to add one to the user's choice to accommodate for that
        result = ThreadLocalRandom.current().nextInt(1, sides+1);      
        
        return result; 
    }
}



  


