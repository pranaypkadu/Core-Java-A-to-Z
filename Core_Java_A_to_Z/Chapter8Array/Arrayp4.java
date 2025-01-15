// Second Largest Number
// Easy
// 40/40
// Average time to solve is 23m
// Contributed by
// 731 upvotes
// Asked in company
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


package Chapter8array;

public class Arrayp4 {
    // Method to find the second largest element in an array
    public static int secondLargest(int n, int[] a) {
        if (n < 2) return -1; // Not enough elements for a second largest
    
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
    
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] > slargest && a[i] < largest) {
                slargest = a[i];
            }
        }
    
        return slargest == Integer.MIN_VALUE ? -1 : slargest; // Handle case with no valid second largest
        }
    
    // Method to find the second smallest element in an array
    public static int secondSmallest(int n, int[] a) {
        if (n < 2) return -1; // Not enough elements for a second smallest
    
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
    
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
    return ssmallest == Integer.MAX_VALUE ? -1 : ssmallest; // Handle case with no valid second smallest
    }
    
    // Method to get both second largest and second smallest elements
    public static int[] getSecondOrderElements(int n, int[] a) {
        int slargest = secondLargest(n, a); // Call to find second largest
        int ssmallest = secondSmallest(n, a); // Call to find second smallest
        return new int[]{slargest, ssmallest};
    }
} 

// -------------------------------------------------------------------


// import java.util.*;
// public class Solution {
//     public static int[] getSecondOrderElements(int n, int []a) {
//         // Initializing the driver variables.
//         int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
//         int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;

//         // Iterating over an array and calculating the smaller and larger numbers.
//         for (int i = 0; i < n; i++) {
//             small = Math.min(small, a[i]);
//             large = Math.max(large, a[i]);
//         }

//         // Iterating again and updating the second order numbers.
//         for (int i = 0; i < n; i++) {
//             if (a[i] < secondSmall && a[i] != small) {
//                 secondSmall = a[i];
//             }
//             if (a[i] > secondLarge && a[i] != large) {
//                 secondLarge = a[i];
//             }
//         }

//         return new int[]{secondLarge, secondSmall};
//     }
// }