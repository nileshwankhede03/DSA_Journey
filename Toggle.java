public class Toggle 
{
    public static void main(String[] args) 
    {
        String input = "nilesH";

        String ans = "";

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            int ascii = (int)ch;
            // System.out.println(ascii);

            if(ch >= 'a' && ch <= 'z')
            {
                ans = ans + (char)(ascii - 32);
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                ans = ans + (char)(ascii + 32);
            }
        }

        System.out.println(ans);
    }
}