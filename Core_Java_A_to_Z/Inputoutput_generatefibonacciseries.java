import java.io.*;

public class Inputoutput_generatefibonacciseries {
    public static void main(String[] args) throws IOException {
        // accept how many fibonacci needed
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many fibonaccis? ");
        int n = Integer.parseInt(br.readLine());

        // take first two fibonacci as 0 & 1
        long f1 = 0, f2 = 1;
        System.out.println(f1);
        System.out.println(f2);

        // find next fibonacci no.
        long  f = f1+f2;
        System.out.println(f);

        // Already 3 fibonaccis are displayed , so count willl start at 3 
        int count = 3;
        while (count < n)
        {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.println(f);
            count++;
        }


    }
    
}
