import java.util.Scanner;

public class BijaliBill 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit : ");
        int unit = sc.nextInt(); 
        // 150
        // 100 * 4.2
        // 50 * 6

        int amount = 0;

        if(unit > 0 && unit <= 100)
        {
            System.out.println(unit * 4.2);
        }
        else if(unit > 100 && unit <= 200)
        {
            System.out.println((100 * 4.2) + (unit - 100) * 6);
        }
        else if(unit > 200 && unit <= 400) // 360
        {
            // 360 - 200 = 160
            System.out.println( (100 * 4.2) + (100 * 6) + (unit - 200) * 8);
        }
        else{
            System.out.println( (100 * 4.2) + (100 * 6) + (200 * 8) + (unit - 400) * 13 );
        }
    }
}
