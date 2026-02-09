import java.util.Scanner;

public class BijaliBillX
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit : ");
        int unit = sc.nextInt(); 
        double amount = 0;

        if(unit > 400) // 13
        {
            amount = ( unit - 400 ) * 13;
            // unit 400 cha hishob hawa so unit chi value update keli trr pudhe codition satisfy hoil and if block chalen
            // ( Task is : unit update kara )
            unit = 400; 
        }

        if(unit <= 400 && unit > 200) // 8
        {
            amount = amount + (unit - 200) * 8;
            unit = 200; // 200 cha hishob dila 200 baki so 200 updated
        }

        if(unit <= 200 && unit > 100) // 8
        {
            amount = amount + (unit - 100) * 6;
            unit = 100; // 10 cha hishob dila 200 baki so 200 updated
        }

        amount = amount + ( unit  * 4.2);

        System.out.println(amount);
    }
}


