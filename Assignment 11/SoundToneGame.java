/**
 * Put comments here
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class SoundToneGame
{
    // instance variables
    /* ------ DO NOT CHANGE THESE OR ADD NEW INSTANCE VALUES ------ */
    private int secretToneIndex;
    private int difficultyLevel;
    private SoundTone [] gameTones;
    private GameStatistics audioGameStats;
    private Scanner keyboard;

    // constants
    /* ----- Do Not Change Or Remove These!! Provided Code Will Break!! ------ */
    /* ----- Add Additional Constant Values if Needed ------ */
    private static final int EASY = 8;
    private static final int MEDIUM = 6;
    private static final int HARD = 4;
    private static final int MENU_CHOICES = 5;
    private static final int DIFFICULTY_CHOICES = 3;
    private static final int NUMBER_OF_GAME_TONES = 100;
    
    /* --------  Complete Methods Below Here -------- */
    
    /**
     * Default constructor for an AudioGame object
     */
    public SoundToneGame() throws IOException
    {
        secretToneIndex = -1;
        audioGameStats = new GameStatistics();
        keyboard = new Scanner(System.in);
        
        // Assign a default difficulty level
        difficultyLevel=EASY;
        // Initialize gameTones array
        gameTones = new SoundTone [NUMBER_OF_GAME_TONES];
    }

    /**
     * Starts the Audio Game program so a user can play the game
     */
    public void runSoundToneGame() throws IOException
    {
        // Declare and initialize local variables used for running the overall game
        // Initialize instance variables if needed
        // Keep looping until the user selects to quit
        //   Get user main menu choice
        //   Decide what to do based on choice
        boolean loop = true;
        int choice= 1;
        while (loop ==true)
        {
          displayMainMenu();
          choice=playerMainMenuChoice();
          if (choice==5)
          {
            quitGame();
          }  
        }  

        // Choice 1
        // Setup local and instance variables for starting a new game
        // Keep looping until player correctly guesses or player has run out of guesses
        //   Get user guess and based on that value decide what to do
        //      One of four tone patterns will be played depending on if the
        //       user guess was the secret tone and how many guesses remain
        // Update game statistics based on game outcome
        
        // Choice 2
        // Get player difficulty selection
        // Set game difficulty to new value chosen (this could be the same value and it doesn't matter)
        
        // Choice 3
        // Display the game statistics
        
        // Choice 4
        // Confirm with player that they really want to reset the stats
        // If player confirms to reset the game statistics they are reset
        
        // Choice 5
        // Quits the program
    }
    
    /**
     * 
     * 
     * @param 
     */
    private void createGameTones()
    {
        // Setup the gameTones array object to contain unique tones
        //  where the lowest sounding tones start at the beginning and
        //  each successive tone is a little louder. 
        // The easiest way to do this is by using a loop
        // The tones do not need to be specific notes and they need to be
        //  distinguishable from each other.
    }

    /**
     * 
     * 
     * @param 
     */
    private void playSecretTone()
    {
        // play the tone that the user is attempting to guess
    }

    /**
     * 
     * 
     * @param 
     */
    private void playGuessTone(int guess)
    {
        // play the tone that the user guessed
    }

    /**
     * 
     * 
     * @param 
     */
    private void playLowTone()
    {
        // play the tone that indicates the user guess was too low
    }

    /**
     * 
     * 
     * @param 
     */
    private void playHighTone()
    {
        // play the tone that indicates the user guess was too high
    }

    /**
     * The sounds that play when a player wins the game
     */
    private void playWinFanfare() 
    {
        //This needs to be unique from other sounds and try to have it 
        //   convey that the game was won. Be creative.
    }
    
    /**
     * The sounds that play when a player loses the game
     */
    private void playLoseFanfare() 
    {
        //This needs to be unique from other sounds and try to have it 
        //  convey that the game was lost. Be creative. 
    }
    
    /**
     * 
     * 
     * @param 
     */
    private void updateGameStats(boolean gameWon)
    {
        // use the gameWon variable to decide how to update the
        //   game statistics in the audioGameStats object
    }

    /**
     * Changes the game difficulty to a new value
     * 
     * @param newDifficulty the new difficulty to use
     */
    private void setGameDifficulty(int newDifficulty)
    {
        // update the game difficulty value
    }
    
    /**
     * Queries user to confirm that they want to reset the game statistics
     * 
     * @return true if user chooses to reset the statistics and false otherwise
     */
    private boolean confirmResetStats()
    {
        // prompt user to confirm selection and store response
        // handle the user input in some manner, which could mean making sure they entered
        //   a correct value or making a default choice for what to return based on their response 
        // decide what to do based on user response
            // return true if user confirmed resetting statistics
            // return false if user indicated not resetting statistics
            
        return false;
    }
    
    /* --------  The Methods Below Here Are Finished and You Will Use Them to Complete the Assignment  -------- */

    /**
     * Determines whether a string is an integer value
     * 
     * return true if integer and false otherwise
     */
    private boolean isInteger(String s)
    {
        try  
        {  
            Integer.parseInt( s );  
            return true;  
        }  
        catch( Exception e )  
        {  
            return false;  
        }  
    }

    /**
     * Prompts the user to select an option from the difficulty menu. Validates
     *  user choice to ensure it is a valid difficulty option.
     * 
     * @return player difficulty selection menu choice
     */
    private int playerSelectDifficulty()
    {
        String strChoice = "";
        int intChoice = 0;
        boolean validInteger = false;

        System.out.print("Select Difficulty: ");
        strChoice = keyboard.nextLine();
        validInteger = isInteger(strChoice);

        if(validInteger)
        {
            intChoice = Integer.parseInt(strChoice);
        }

        while(validInteger == false || intChoice < 1 || intChoice > DIFFICULTY_CHOICES)
        {
            System.out.print("Select Difficulty: ");
            strChoice = keyboard.nextLine();
            validInteger = isInteger(strChoice);

            if(validInteger)
            {
                intChoice = Integer.parseInt(strChoice);
            }
        }

        return intChoice;
    }

    /**
     * Prompts the user to select an option from the main menu. Validates
     *  user choice to ensure it is a valid menu option.
     * 
     * @return player main menu choice
     */
    private int playerMainMenuChoice()
    {
        String strChoice = "";
        int intChoice = 0;
        boolean validInteger = false;

        System.out.print("Select Option: ");
        strChoice = keyboard.nextLine();
        validInteger = isInteger(strChoice);

        if(validInteger)
        {
            intChoice = Integer.parseInt(strChoice);
        }

        while(validInteger == false || intChoice < 1 || intChoice > MENU_CHOICES)
        {

            System.out.print("Select Option: ");
            strChoice = keyboard.nextLine();
            validInteger = isInteger(strChoice);

            if(validInteger)
            {
                intChoice = Integer.parseInt(strChoice);
            }
        }

        return intChoice;
    }

    /**
     * Asks the user to enter a guess and validates that the guess is in the 
     *  correct range. The number of remaining guesses are also printed.
     * 
     * @param numGuesses    the number of player guesses remaining
     * @return player guess
     */
    private int playerGetGuess(int numGuesses)
    {
        String strChoice = "";
        int intChoice = 0;
        boolean validInteger = false;

        System.out.println();
        System.out.println(numGuesses + " Guesses Remaining"); 
        System.out.print("Enter a guess between 1 and " + gameTones.length + ": ");
        strChoice = keyboard.nextLine();
        validInteger = isInteger(strChoice);

        if(validInteger)
        {
            intChoice = Integer.parseInt(strChoice);
        }

        while(validInteger == false || intChoice < 1 || intChoice > gameTones.length)
        {

            System.out.print("Invalid Guess\nEnter a guess between 1 and " + gameTones.length + ": ");
            strChoice = keyboard.nextLine();
            validInteger = isInteger(strChoice);

            if(validInteger)
            {
                intChoice = Integer.parseInt(strChoice);
            }
        }

        return intChoice;
    }

    /**
     * Prints out the main menu
     */
    private void displayMainMenu()
    {
        System.out.println();
        System.out.println("Main Menu:");
        System.out.println("----------------------------");
        System.out.print("1. Play Game [");

        if(difficultyLevel == EASY)
        {
            System.out.println("EASY]");
        }
        else if(difficultyLevel == MEDIUM)
        {
            System.out.println("MEDIUM]");
        }
        else
        {
            System.out.println("HARD]");
        }

        System.out.println("2. Select Difficulty");
        System.out.println("3. View Statistics");
        System.out.println("4. Reset Statistics");
        System.out.println("5. Quit");
        System.out.println();
    }
    
    /**
     * Prints out the game difficulty selections menu
     */
    private void displayDifficultyMenu()
    {
        System.out.println();
        System.out.println("Difficulty Options:");
        System.out.println("-------------------------");
        System.out.println("1. Easy    - " + EASY + " Guesses");
        System.out.println("2. Medium  - " + MEDIUM + " Guesses");
        System.out.println("3. Hard    - " + HARD + " Guesses");
        System.out.println();
    }

    /**
     * Completes various tasks before the program finishes
     * 
     * @return true if user chooses to reset the statistics and false otherwise
     */
    private void quitGame() throws IOException
    {
        // make sure that the current overall game stats are updated
        audioGameStats.saveStats();

        // makes sure that all of the sounds have played through audio out (speakers)
        StdAudio.close(); 

        // Java programs with sound need to be terminated this way
        System.exit(0);
    }
}