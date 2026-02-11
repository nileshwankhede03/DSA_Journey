public class StrongNumber 
{
    public static void main(String[] args) 
    {
        int num = 145;
        int copy = num;
        int sum = 0;

        while (num > 0) 
        {
            int iDigit = num % 10;
            int fact = 1;
            for (int i = 1; i <= iDigit; i++) 
            {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if(sum == copy)
        {
            System.out.println("strong number aahe");
        }
        else
        {
            System.out.println("strong number nahiyeeee");
        }
    }
}