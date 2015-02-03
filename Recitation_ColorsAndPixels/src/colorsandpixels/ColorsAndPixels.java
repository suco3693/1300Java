/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colorsandpixels;

//import java.io.InputStream;
import java.awt.Color;
/**
 *
 * Sutton Cowperthwaite
 */
public class ColorsAndPixels {
    
    
    //define a method calcuates distance
    public double calcDistance(Color c1, Color c2){
        
        //calculate power of difference between two values
        //use getRed(), getGreen(), getBlue() to get colors
        double powerR = Math.pow(c1.getRed()-c2.getRed(), 2);
        double powerG = Math.pow(c1.getGreen()- c2.getGreen(),2);
        double powerB= Math.pow(c1.getBlue()-c2.getBlue(),2);
        //calculate square root of above values, using Math.sqrt()
        double distance=Math.sqrt(powerR+powerB+powerG);
        return distance;
    }
    
    //define a method to calculate difference
    
    public void compDifference(double onetwo, double onethree){
    	//compare difference between a and b, and print results here
        double difference= 0;
        if (onetwo >= onethree);
        {
           difference=onethree;
        }
        else;
        {
            difference=onetwo;
        }
        System.out.println(difference);
        return difference;
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create 3 Color instances
        Color c1 = new Color(0, 0, 0);
        Color c2= new Color(0,0,0);
        Color c3=new Color(0,0,0);
        //create an instance of ColorsAndPixels class, to refer methods we defined
        ColorsandPixels cp= new ColorsandPixels();
        //calculate color distancec between c1 - c2, and c1 - c3
        float onetwo = cp.calcDistance(c1,c2);
        float onethree = cp.calcDistance(c1,c3);
        //compare differences between two results
        float difference= cp.compDifference(onetwo,onethree);
        //open a picture
        Picture poke = new Picture("pokemon.png");
        
        //set R,G,B values of the picture to previously created color objects
       	//use set(x, y, Color) method
        poke.set(124, 130, c1);
        poke.set(124, 150, c2);
        poke

        //calculate color distance and compare the results
    }
}
