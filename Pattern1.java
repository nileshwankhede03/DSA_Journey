public class Pattern1 
{
    public static void main(String[] args) 
    {


        // for (int i = 1; i <= 5; i++) 
        // {
        //     System.out.print("row "+ i);

        //     System.out.println(); // new row 
        // }

        // for (int i = 1; i <= 5; i++) 
        // {
        //     System.out.print("* "); // 5 star line madhe because of print
        // }


        // compile nested 
        // task 1 : 5 rows havey
        // task 1 chya aat 5 star havey

        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= 5; j++) // aatla task
            {
                System.out.print("* ");
            }

            System.out.println(); // new row 
        }


        System.out.println();
    }
}
