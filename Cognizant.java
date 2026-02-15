

/**
 * input : Nilesh Bhausaheb Wankhede
 * output : N B Wankhede
 */
public class Cognizant 
{
    public static void main(String[] args) {
        String input = "Nilesh Bhausaheb Wankhede";

        String arr[] = input.split(" ");

        String finalResult = "";
        
        for (int i = 0; i < arr.length; i++) 
        {
            String word = arr[i];
            String result = "";

            if(i == 0 || i == 1)
            {
                char firstCharacter = word.charAt(0);
                result += firstCharacter+" ";
            }
            else
            {
                result += word;
            }

            finalResult += (result);
        }

        System.out.println(finalResult);
    }
}
