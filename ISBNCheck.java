public class ISBNCheck 
{
    public static boolean CheckValidISBNNumber(long Number) 
    {
        int iCnt = 0;
        long isbn = Number;
        while (Number > 0) 
        {
            iCnt++;
            Number /= 10;
        }
        // System.out.println(iCnt);

        // Check filter
        if(!(iCnt == 10)) return false;

        int digitIndex = 10;
        long sum = 0;

        while (isbn != 0) 
        {
            int iDigit = (int) (isbn % 10);
            sum = sum + digitIndex * iDigit;
            digitIndex--;
            isbn = isbn / 10;
        }

        // System.out.println(sum);

        if(sum % 11 == 0)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) 
    {
        boolean res = CheckValidISBNNumber(2222222222L);

        if(res == true)
        {
            System.out.println("Number is valid ISBN Number");
        }
        else
        {
            System.out.println("Number is Not valid ISBN Number");
        }
    }
}
