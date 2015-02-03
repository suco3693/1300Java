/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searchesandsorts;

/**
 *
 * @author user
 */
public class SearchesAndSorts {

    public static int linearSearch(int[] searchList, int target)
    {
        /*
         * Searches linearly through an integer array for the target integer
         * returns the index of the first instance of target
         * if target is not found, returns -1
         */
        
        int targetIndex = -1;
        
        //TODO: Add code here
        
        return targetIndex;
    }

    public static int binarySearch(int[] searchList, int target)
    {
        /*
         * Searches through an integer array for the target integer
         * uses a binary search algorithm
         * NOTE: Requires searchList to be sorted low to high
         * returns the index of the first instance of target
         * if target is not found, returns -1
         */
        int targetIndex = -1;
        
        //TODO: Add code here
        
        return targetIndex;
    }
    
    public static int[] selectionSort(int[] sortList)
    {
        /*
         * Sorts an integer array using the selection sort method
         * returns an array with each element sorted low to high
         */
        
        //TODO: Add code here
        
        return sortList;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myDigits = {8, 5, 1, 7, 3, 2, 9, 6, 0, 4};
        // search myDigits using linearSearch for 4
        // Sort myDigits using selectionSort
        // search myDigits using binarySearch for 4
        
        int[] bigArray = new int[10000];
        for(int i = 0; i < 10000; i++)
        {
            bigArray[i] = i*2;
        }
        
        //search bigArray using linearSearch for an even number
        
        //search bigArray using binarySearch for an even number
        
        //search bigArray using linearSearch for an odd number
        
        //search bigArray using binarySearch for an odd number
    }
}
