
package sutton_cowperthwaite_assignment10;

/**
 * Assignment 10: Die Simulation
 * By Sutton Cowperthwaite
 * Info: This program gives the attributes of the die and prints 
 * out the number rolled. This is the constructor class of thr project
 * 11/19/2013
 */

import java.util.Random;

public class Die
{
    // instance variables 
    private int myDieValue;
    private int myDieSides;
    private Random myRandom;
    
    // Dice Class Constructors
    
    public Die()
    {
        myDieSides = 4;
    }
    
    
    public Die(int numSides)
    {
        setDieSides(numSides);
        
    }
    
    public int getDieSides()
    {
        return myDieSides;
    }
    
    
    public int getDieValue()
    {
        return myDieValue;
    }
    
    // Can't call setDieSides becuase it is a private variable
    private void setDieSides(int newNumSides)
    {
        if (newNumSides >= 100)
        {
            newNumSides= 100;
        }    
        else if (newNumSides <= 4)
        {
            newNumSides =4;
        }    
        this.myDieSides= newNumSides;
       
    }
    
    
    public void rollDie()
    {
        
        myDieValue = (int) ((Math.floor(myDieSides*100*Math.random())/100)+1);
        //System.out.println("Value " +myDieValue);
        //System.out.println("Sides " + myDieSides);
        System.out.println("Rolling Die");
    }
    
   
    public void printDice(int dieNum)
    {
        
        System.out.println("Die Value: " + myDieValue);
    }
}

