public class SortStringLexicalScoping 
{
    public static void main(String[] args) 
    {
        String input = "taj mahal is situated at agra";

        String words[] = input.split(" ");


        // Step 2: manual sorting (bubble sort logic)
        for (int i = 0; i < words.length - 1; i++) 
        {
            for (int j = i + 1; j < words.length; j++) 
            {

                // compare lexicographically
                if (words[i].compareTo(words[j]) > 0) 
                {
                    // swap
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // Step 3: join
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
