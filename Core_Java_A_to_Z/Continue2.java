public class Continue2 {
    public static void main(String[] args) {
        int i=1,j;
        lp1: while(i<=3)
        {
            System.out.println(i); //i value change from 1 to 3
            lp2: for(j=1; j<=5; j++)
            {
                System.out.println("\t"+j);
                if(j==3) //j values change up to 3 only
                {
                    i++;
                    continue lp1;
                }
            }
        }
    }
}
