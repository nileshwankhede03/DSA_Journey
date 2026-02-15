public class FrequencyOfEachCharacter 
{
    public static void main(String[] args) {
        String input = "madam";

        int[] bitMap = new int[128]; // inshort frequency array for all chars with value 0 (default value)
        
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            // System.out.println(ascii);

            bitMap[ascii]++;
        }

        for (int i = 0; i < bitMap.length; i++) {
            if(bitMap[i] > 0)
            {
                System.out.println("count of "+((char)i) + " is = "+bitMap[i]);
            }
        }

        // (char)i => i index yeil if 97 then ascii to char convert honar and char bhetnar
    }
}
