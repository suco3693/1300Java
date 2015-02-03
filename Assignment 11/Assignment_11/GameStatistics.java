/**
 * This class keeps track of statistics for the number
 *  of wins and losses in a game. 
 * 
 * @author Jeffrey LaMarhce 
 * @version 1.0 December 4th 2013
 * @version 1.1 December 8th 2013
 * updated loadStats to check for filesize and also recover if the
 *  file does not contain the correct information
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GameStatistics
{
    // instance variables
    private int gamesWon;
    private int gamesLost;

    // constants
    private static final String statsFileName = "stats.dat";

    /**
     * Constructor for objects of class GameStatistics
     */
    public GameStatistics() throws IOException
    {
        loadStats();
    }

    /**
     * Loads the game won and lost values from the stats text file. If no file exists
     *  it is created and the values for games won and games lost are initialized to 
     *  zero. The zero values are not written to the new file automatically. 
     */
    public void loadStats() throws IOException
    {
        try
        {
            File inFile = new File(statsFileName);

            if(inFile.exists() && inFile.length() >= 4)
            {   
                // this try/catch handles problems with trying to read from
                //   the stats.dat file if it has incorrect values that 
                //   would cause an exception when they were read
                try
                {
                    Scanner fReader = new Scanner(inFile);
                    gamesWon = Integer.parseInt(fReader.nextLine());
                    gamesLost = Integer.parseInt(fReader.nextLine());
                }
                catch(Exception e)
                {
                    // create the file if it does not exist or if
                    //   the file contains information that cannot
                    //   be read correctly
                    inFile.createNewFile();

                    gamesWon = 0;
                    gamesLost = 0;
                }
            }
        }    
        catch(IOException ioe)
        {
            System.err.println(ioe);
            System.exit(1);
        }
    }

    /**
     * Saves the game won and lost values to the stats text file. This overwrites
     *  the previous file contents.
     */
    public void saveStats() throws IOException
    {
        File outFile;
        FileWriter fWriter;
        PrintWriter pWriter;

        try
        {
            // all of this just to write to a file!        
            // this makes a file object, it takes care of various details when working with files
            outFile = new File (statsFileName); 

            // this is an object to write to files, it uses a write function and an explicit '\n' is required to make newlines 
            fWriter = new FileWriter (outFile);  

            // this is another object that can use print, println, and fprint to write to files
            pWriter = new PrintWriter (fWriter);

            pWriter.println(gamesWon);
            pWriter.println(gamesLost);

            pWriter.close();
        }
        catch(IOException ioe)
        {
            System.err.println(ioe);
            System.exit(1);
        }
    }

    /**
     * Assigns the total for games won and lost to zero. Updates the stats text
     *  file to reflect these changes. 
     */
    public void resetStats() throws IOException
    {
        try
        {
            gamesWon = 0;
            gamesLost = 0;
            saveStats();
        }
        catch(IOException ioe)
        {
            System.err.println(ioe);
            System.exit(1);
        }
    }

    /**
     * Increases the number of games won
     */
    public void increaseWon()
    {
        gamesWon++;
    }

    /**
     * Increases the number of games lost
     */
    public void increaseLost()
    {
        gamesLost++;
    }

    /**
     * Provides access to the number of games won
     * 
     * @return     total games won 
     */
    public int getGamesWon()
    {
        return gamesWon;
    }

    /**
     * Provides access to the number of games lost
     * 
     * @return     total games lost 
     */
    public int getGamesLost()
    {
        return gamesLost;
    }

    /**
     * Provides access to the total number of games played
     * 
     * @return     total games played 
     */
    public int getGamesPlayed()
    {
        return gamesLost + gamesWon;
    }

    /**
     * Prints statistics about games won and lost 
     */
    public void printStats()
    {
        double percentWon = 0.0;
        double percentLost = 0.0;

        System.out.println();
        System.out.println("Gameplay Statistics:");
        System.out.println("--------------------------------------");

        System.out.println("Total Games Played: " + getGamesPlayed());

        if(getGamesPlayed() > 0)
        {
            System.out.printf("Games Won: %3d  Percent Won: %7.2f%s\n", 
                getGamesWon(), ((double)getGamesWon() / (double)getGamesPlayed()) * 100, "%");

            System.out.printf("Games Lost: %2d  Percent Lost: %6.2f%s\n", 
                getGamesLost(), ((double)getGamesLost() / (double)getGamesPlayed()) * 100, "%");

        }
        else
        {
            System.out.printf("Games Won: %3d  Percent Won: %7.2f%s\n", 
                getGamesWon(), 0.0, "%");
            System.out.printf("Games Lost: %2d  Percent Lost: %6.2f%s\n", 
                getGamesLost(), 0.0, "%");
        }
    }
}
