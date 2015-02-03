
package sutton_cowperthwaite_assignment10;

/**
 * Assignment 10: Die Simulation
 * By Sutton Cowperthwaite
 * Info: This program gives the attributes of the die and prints 
 * out the number rolled. This is the main class of thr project
 * 11/19/2013
 */
import java.util.Scanner;
public class TestDieClass
{
    public static void main(String [] args)
    {
        /*
         * write code to thoroughly test the Die class
         *  that you made in Die.java 
         *  (sometimes this is called exercising your code)
         * 
         * if you create additional methods (optional) make
         *  aure to document them
         */
        System.out.println("Enter the number of sides on the dice between 4 and 100 ");
        Scanner in = new Scanner(System.in); 
        int x = in.nextInt();
        Die dieOne= new Die(x);
        System.out.println("Testing Die");
        dieOne.rollDie();
        dieOne.printDice(x);
        //dieOne.printDice(x);
        
        
    }
}