import java.io.*;
import java.io.BufferedReader;

public class Inputoutputacceptinginputfromthekeyboard {
    public static void main(String[] args) throws IOException {
        InputStreamReader obj = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(obj);

        System.out.println("Enter a name");

        // char ch = (char)br.read();  to read a string, we need readLine() method of bufferedReader class.
                                       // accepting a single character from keyboard


        String ch = br.readLine();

        System.out.println("You entered "+ch);
    }
}