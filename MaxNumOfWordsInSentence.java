// HomeWork
/*
    Maximum number of words Found in Sentences

    Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
    Output: 6

    Explanation: 
    - The first sentence, "alice and bob love leetcode", has 5 words in total.
    - The second sentence, "i think so too", has 4 words in total.
    - The third sentence, "this is great thanks very much", has 6 words in total.
    Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
*/

public class MaxNumOfWordsInSentence 
{
    public static void main(String[] args) 
    {
        String[] arr  = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) 
        {
            String sentence = arr[i];
            // System.out.println(sentence);
            String[] words = sentence.split(" ");

            // System.out.println("words : "+words.length);

            if(words.length > max)
            {
                max = words.length;
            }
        }
        
        System.out.println(max);
    }
}