// Problem statement

// You have been given an array ‘a’ of ‘n’ unique non-negative integers.


// Find the second largest and second smallest element from the array.


// Return the two elements (second largest and second smallest) as another array of size 2.


// Example :

// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]

// The second largest element after 5 is 4, and the second smallest element after 1 is 2.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :

// 4
// 3 4 5 2

// Sample Output 1 :

// 4 3

// Explanation For Sample Input 1 :

// The second largest element after 5 is 4 only, and the second smallest element after 2 is 3.

// Sample Input 2 :

// 5
// 4 5 3 6 7

// Sample Output 2 :

// 6 4

// Expected Time Complexity:

// O(n), Where ‘n’ is the size of an input array ‘a’.

// Constraints:

// 2 ≤ 'n' ≤ 10^5
// 0 ≤ 'a'[i] ≤ 10^9

// Time limit: 1 sec


// Hints:

// 1. Sort the array.
// 2. More efficiently, can you use the largest and smallest elements to find the required elements?

// Java (17)
// 1
// 2
// 3
// 4
// 5

import java.io.*;
import java.util.*;

package Chapter8array;

public class Arrayp4 {

    static private int secondSmallest(int[] arr, int n)
    {
        if (n < 2)
        {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
           if (arr[i] < small)
           {
              second_small = small;
              small = arr[i];
           }
           else if (arr[i] < second_small && arr[i] != small)
           {
              second_small = arr[i];
           }
        }
       return second_small;
    }
    static private int secondLargest(int[] arr, int n)
    {
        if(n<2)
        return -1;

        int large = Integer.MIN_VALUE;
        
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }
    
            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
            int sS = secondSmallest(arr, n);
            int sL = secondLargest(arr, n);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);
    }
    
    }    
