import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
      
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;
        
        // Adding 1 million integers to the list
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // Type 1: Using a for-each loop
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i : list) {
            int a = i;     // Looping over each element
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For each loop :: " + (endTime - startTime) + " ms");
        
    }
}