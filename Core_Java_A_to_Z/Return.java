public class Return {
    static int mySchool(int num){
        return num*num;

    }

    static int myCollege(int x){
        return x;

    }

    static int myCity(int y){
        return y;

    }
    public static void main(String[] args) {
        int res = Return.mySchool(5);  //classname.methodname
        int a = Return.myCity(10);
        int b = Return.myCollege(25);


        // System.out.println("result= "+ res);
        // System.out.println("result= "+ a);

        // System.out.println("result= "+ b);

    }
    
}
