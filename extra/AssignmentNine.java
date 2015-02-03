/* Assignment 9
 * Sutton Cowperthwaite
 * Investment Calculator
 * 10/30/13
 */

import java.util.Scanner;

public class AssignmentNine{

	public static void main(String[] args){	
       Scanner in = new Scanner(System.in);
        System.out.println("This program calculates the future value of an Investment");
        int years;
        System.out.println("Enter number of years of investment");
        years=in.nextInt();
        double npr;
        System.out.println("Enter the interest Rate");
        npr=in.nextDouble();
        int compound;
        System.out.println("Enter the compounds per year");
        compound=in.nextInt();
        int ranger=compound*years;
        double principal;
        System.out.println("Enter your Principal Investment");
        principal=in.nextDouble();
        for(int i=0,i<ranger,1++);
        {
            principal=principal*(1+npr/compound);
        }
        System.out.println(principal);
	
	}
}
