import java.io.*;

public class Inputoutput_leapyear_or_not {
    public static void main(String[] args) throws IOException {
        // accept year 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Year No: ");

        int year =Integer.parseInt(br.readLine());

        // if it is century year and divisible by 400
        if      (year % 100 ==0 && year % 400 ==0)
        System.out.println("Leap Year");
        //  if it is not a century year and divisible by 4
        else if (year % 100 !=0 && year % 4 == 0)
        System.out.println("leap Year");
        // otherwise, it is not a leap year
        else
        System.out.println("Not Leap Year");
    }
    
}
