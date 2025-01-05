import java.io.*;

public class Inputoutputacceptinganddisplayingtheemployeedetails {
    
    public static void main(String[] args) throws Exception {
        // create BufferedReader object to accept data 
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // accept the employee detais
        System.out.println("Enter id: ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter sex (M/F): ");
        String sex = br.readLine();  // Solution 1:
                                     // char sex = (char)br.read(); if we use the character the input for name will not be taken
                                     // as char takes only only one character and \n and because of tha it will not take the 
                                    //  name input 
        //Solution 2: char sex = br.readLine().CharAt(0);   in this statement we are accepting the input for sex as string
                            // i.e M/n using readline(). Then we are retrieving the 0th character
                            // i.e only M from it and returning it into sex variable. This is doen by charAt(0) method
        // Solution 3: br.skip(2);

        System.out.println("Enter Name: ");
        String name = br.readLine();
        
        // Display employee details
        System.out.println("Id : "+ id);
        System.out.println("Sex : "+ sex);
        System.out.println("Name : "+ name);
    }
}