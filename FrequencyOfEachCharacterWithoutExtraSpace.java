public class FrequencyOfEachCharacterWithoutExtraSpace
{
    public static void main(String[] args) {
        String input = "abcbba";

        int[] bitMap = new int[26]; // inshort frequency array for all chars with value 0 (default value)
        
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            // System.out.println(ascii);

            bitMap[ascii - 97]++;
        }

        for (int i = 0; i < bitMap.length; i++) {
            if(bitMap[i] > 0)
            {
                System.out.println("count of "+(char)(i + 97) + " is = "+bitMap[i]);
            }
        }
    }
}
