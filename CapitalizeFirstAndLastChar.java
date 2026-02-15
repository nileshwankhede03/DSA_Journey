public class CapitalizeFirstAndLastChar 
{
    public static void main(String[] args) {
        String input = "Hello bhai kaise ho ";

        String[] arr = input.split(" ");

        String result = "";

        for (int i = 0; i < arr.length; i++) 
        {
            String word = arr[i];

            char firstCharacter = Character.toUpperCase(word.charAt(0));
            String midCharacters = word.substring(1,word.length() - 1);
            char lastCharacter = Character.toUpperCase(word.charAt(word.length() - 1));
            String temp = "";

            // System.out.println(firstCharacter);
            // System.out.println(midCharacters);
            // System.out.println(lastCharacter);

            temp = temp + (firstCharacter + midCharacters + lastCharacter);

            result += (temp+" ");
        }
        System.out.println(result);
    }
}
