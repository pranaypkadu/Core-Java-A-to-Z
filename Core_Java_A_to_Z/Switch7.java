public class Switch7 {
    public static void main(String [] args) {
        String day = "wed";

        switch (day)
        {
            case "mon" : System.out.println("Monday");
            case "tue" : System.out.println("Tuesday");
            case "wed" : System.out.println("wednesday");
            case "thur" : System.out.println("Thursday");
            case "fri" : System.out.println("Friday");
            case "sat" : System.out.println("Saturday"); break;
            case "sun" : System.out.println("Sunday");
            default: System.out.println("No day");
        }
    }
    
}
