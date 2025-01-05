import java.io.*;

class InputOutputacceptingfloatvalue {
    public static void main(String[] args)  throws Exception {
        //create BufferedReader Object to accept data from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //ask for float and read it

        System.out.print("Enter a float value: "); // byte, short, long , boolean

        float n = Float.parseFloat(br.readLine());   // byte, short, long , boolean

        // display the float

        System.out.println("You entered: "+n);

    }


}