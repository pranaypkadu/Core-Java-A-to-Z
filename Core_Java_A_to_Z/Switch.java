public class Switch {
    public static void main(String[] args) {
        char color = 'g';
        switch(color)
        {
            case 'r' : System.out.println("Red");
            case 'g' : System.out.println("Green");
            
            case 'b' : System.out.println("Blue");
            case 'i' : System.out.println("Indigo");
            break;
            case 'v' : System.out.println("Violet");
            case 'w' : System.out.println("White");
            default : System.out.println("No Color");
        }
    }
}