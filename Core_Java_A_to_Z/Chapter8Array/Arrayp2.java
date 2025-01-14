// Problem statement

// Given an array ‘arr’ of size ‘n’ find the largest element in the array.


// Example:

// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: 5

// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample input 1:

// 6
// 4 7 8 6 7 6 

// Sample output 1:

// 8

// Explanation of sample input 1:

// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.

// Sample input 2:

// 8
// 5 9 3 4 8 4 3 10 

// Sample output 2:

// 10

// Expected Time Complexity:

// O(n), Where ‘n’ is the size of an input array ‘arr’.

// Constraints :

// 1 <= 'n' <= 10^5
// 1 <= 'arr[i]' <= 10^9

// Time Limit: 1 sec

// Brute Force Approach

package Chapter8array;

import java.util.*;

public class Arrayp2 {
    public static void main(String [] args){
        int arr [] = {10,20,20,5,0,60,99,6};

        Arrays.sort(arr);
        
        System.out.println(arr[arr.length-1]);

        // System.out.println(arr[length-1]);

    }
    
}
