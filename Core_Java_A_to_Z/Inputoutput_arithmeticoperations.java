
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Inputoutput_arithmeticoperations  {
    public static void main(String[] args) throws Exception {
        // to accept data from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // take input into str from keyboard
        System.out.println("Enter two numbers");
        
        String str = br.readLine();

        // split the string at comma
        StringTokenizer st = new StringTokenizer(str, " ");

        // take the two tokens into s1, s2
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // trim the spaces in s1, s2
        s1 = s1.trim();
        s2 = s2.trim();

        // convert s1 and s2 into double type and store in n1, n2
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        // perform the arithmetic operations
        System.out.println("Result of addition: "+ (n1 + n2));
        System.out.println("Result of substraction: "+ (n1 - n2));
        System.out.println("Result of multiplication: "+ (n1 * n2));
        System.out.println("Result of division: "+ (n1 / n2));
        System.out.println("Result of modulus: "+ (n1 % n2));

    }
    
}
