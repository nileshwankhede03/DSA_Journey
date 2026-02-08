public class Otp 
{
    public static void main(String[] args) 
    {
        // double result = Math.random() * range + MinValue

        double result = Math.random() * 9000 + 1000;

        // truncate like 20.332 => 20 ans is typecasting

        int Otp = (int) result;

        System.out.println(Otp);
    }
}