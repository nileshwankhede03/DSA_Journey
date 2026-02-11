public class Pattern3
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= (2 * 5 - 1); j++) 
            {
                if((i == j) || j == (2 * 5 - i))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        
        System.out.println();
    }

    
}
