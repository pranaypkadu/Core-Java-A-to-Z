import java.io.*;
import java.util.*;

public class Inputoutputaccepting_different_types_of_of_input_in_a_line {
    public static void main(String[] args) throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // ask for input - seperated by commas
        System.out.println("Enter name, age, salary: ");

        // ask for input into a string
        String str = br.readLine();

        // use StringTokenizer to spit input at commas
        StringTokenizer st = new StringTokenizer(str, ",");

        //we will have 3 tokens as strings
        // first token represents name, second one age, third one salary

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        // trim any spaces before and after the tokens

        s1=s1.trim();
        s2=s2.trim();
        s3=s3.trim();

        // convert s1 into string, s2 into an int s3 into a float
        String name = s1;
        int age = Integer.parseInt(s2);
        float salary = Float.parseFloat(s3);

        // display the entered data
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Salary = "+salary);

    }
}