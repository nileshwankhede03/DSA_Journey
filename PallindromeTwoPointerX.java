public class PallindromeTwoPointerX 
{
    public static void main(String[] args) 
    {
        String input = "madam";
        input = input.toLowerCase();

        int i = 0;
        int j = input.length() - 1;

        boolean isPallindrome = true;
        while( i < j ) 
        {
            if(input.charAt(i) != input.charAt(j))
            {
                isPallindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (isPallindrome) {
            System.out.println("String is pallindrome");
            
        } else {
            
            System.out.println("not pallindrome");
        }
    }
}
