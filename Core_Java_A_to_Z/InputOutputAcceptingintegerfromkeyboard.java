import java.io.*;

public class InputOutputAcceptingintegerfromkeyboard {
    public static void main(String[] args) throws Exception {

        // create BufferedReader object to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ask for Integer and read it

        System.out.print("Enter an int value: ");
        
        
        int num = Integer.parseInt(br.readLine());

        //
        System.out.println("You entered is: "+num);
        
    }
}