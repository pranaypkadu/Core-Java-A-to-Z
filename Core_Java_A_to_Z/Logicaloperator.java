public class Logicaloperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        if(x == y || y == z ){
            System.out.println("Yaa Yaa Yaa");
        }
        else {
            System.out.println(z);
        }

        if(x == y && y == z ){
            System.out.println("Yaa Yaa Yaa");
        }
        else {
            System.out.println(z);
        }

        if (!(x.equals(y))){
            System.out.println("Yaa Yaa Yaa");
        }
        else {
            System.out.println(z);
        }



    }
}
