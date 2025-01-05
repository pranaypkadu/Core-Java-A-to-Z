import java.io.IOException;
import java.util.Scanner;

public class Inputoutput_scannerclass {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter id name sal: ");

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        float sal = sc.nextFloat();

        System.out.println("Id is : "+id);
        System.out.println("Name is : "+name);
        System.out.println("Sal is : "+sal);

    }
    
}
