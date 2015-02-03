/* Assignment 9
 * Sutton Cowperthwaite
 * Investment Calculator
 * 10/30/13
 */

import java.util.Scanner;
public class AssignmentNine1 {


    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
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
        double interest=0;
        for(int i= 0; i<ranger;i++)
        {
			interest=principal*(npr/compound);
			principal=principal+interest;
			System.out.println("Year" +((i/compound)+1) +" Period "+((i%compound)+1));
			System.out.printf("Interest Earned $"+ "%.2f",interest);
			System.out.println(" ");
		}	
        System.out.printf("The amount of in " +years+ " years is $" + "%.2f", principal);
    }
}
