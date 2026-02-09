import java.util.Scanner;

public class ShopDiscount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount");
        int amount = sc.nextInt();

        int dis = 0;

        // do dynamic
        // if(amount > 0 && amount <= 5000)
        // {
        //     payble = amount - (5 * amount)/100;
        // }

        if(amount > 0 && amount <= 5000)    dis = 0;
        else if(amount > 5000 && amount <= 7000)    dis = 5;
        else if(amount > 7000 && amount <= 9000)    dis = 10;
        else dis = 20;

        System.out.println("Payable amount : "+(amount - (dis * amount)/100));
    }
}
