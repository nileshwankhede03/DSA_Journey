public class AnagramCheck 
{
    public static void main(String[] args) 
    {
        String input1 = "car";
        String input2 = "arc";

        // check for length
        if(input1.length() != input2.length())
        {
            System.out.println("not anagram");
            return;
        } 

        int[] bitMap = new int[128];

        for (int i = 0; i < input1.length(); i++) 
        {
            char ch1 = input1.charAt(i);
            int asciiChar1 = (int)ch1;

            bitMap[asciiChar1]++;

            char ch2 = input2.charAt(i);
            int asciiChar2 = (int)ch2;

            bitMap[asciiChar2]--;
        }

        for (int i = 0; i < bitMap.length; i++) {
            // System.out.println(bitMap[i]);

            if(bitMap[i] != 0)
            {
                System.out.println("Not anagram");
                return;
            }
        }
        
        System.out.println("Anagram");

        System.out.println("End");
    }
}
