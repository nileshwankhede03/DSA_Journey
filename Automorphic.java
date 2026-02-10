
/*
AutomorphicNumber means square of that number contais that number itself at the end

ex : 5 (Automorphic)
    25

    2. 76 (Automorphic)
    5776

*/

public class Automorphic 
{
    public static boolean checkAutomorphicNumber(int input) 
    {
        int copy = input;
        int iCnt = 0;
        int square = input * input;

        while (input > 0) 
        {
            iCnt++;
            input /= 10;
        }

        // to get last digits directly by mod
        // 6543 % 10 => 43 , 54334 % 100 => 334

        // System.out.println((int)(square % Math.pow(10, iCnt)));

        if(copy == (int)(square % Math.pow(10, iCnt)))
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) 
    {
        boolean iRet = checkAutomorphicNumber(76);

        if(iRet == true)
        {
            System.out.println("Number is Automorphic");
        }
        else
        {
            System.out.println("not a Automorphic number");
        }
    }
}
