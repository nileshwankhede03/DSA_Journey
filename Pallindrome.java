public class Pallindrome 
{
    public static void main(String[] args) 
    {
        String input = "Madam";
        input = input.toLowerCase();
        String rev = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {
            char ch = input.charAt(i);

            rev += ch;
        }

        if(rev.equals(input))
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not a pallindrome");
        }
    }
}
