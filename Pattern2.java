public class Pattern2
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

        // condition chks

        // for (int i = 1; i <= 1; i++) 
        // {
        //     System.out.println("loop 1 : run time count : "+i);
        // }

        // for (int i = 1; i <= 2; i++) 
        // {
        //     System.out.println("loop 2 : run time count : "+i);
        // }


    /*

        *
      * *
    * * *
  * * * *
* * * * *

    */
    
        // for (int i = 1; i <= 5; i++) 
        // {
        //     // spaces
        //     for (int j = 1; j <= 5 - i; j++) 
        //     {
        //         System.out.print("  "); // double space for alignment
        //     }

        //     // stars
        //     for (int j = 1; j <= i; j++) 
        //     {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

/*
            * 
            * * 
            * * * 
            * * * * 
            * * * * * 
*/

        // for (int i = 1; i <= 5; i++) 
        // {
        //     for (int j = 1; j <= i; j++) 
        //     {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= (5 - i + 1); j++) 
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
