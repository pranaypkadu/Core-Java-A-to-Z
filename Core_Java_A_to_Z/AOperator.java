import java.util.Scanner;

public class AOperator {
    public static void main(String args []) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();

        // int z = a + b; // addition operator
        // int z = a - b;  // substraction operator
        // int z = a * b;  // multiplication operator 
        // System.out.println(z);
       // int z = a / b;
       // System.out.println(z);
        int z = a % b;
        System.out.println(z);
    }
}
