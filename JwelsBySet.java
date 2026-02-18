import java.util.*;

public class JwelsBySet 
{
    public static void main(String[] args) {
        String jwells = "aA";
        String stones = "abAAAbb";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jwells.length(); i++) 
        {
            char ch = jwells.charAt(i);

            set.add(ch);
        }

        // System.out.println(set);
        int count = 0;
        for (int i = 0; i < stones.length(); i++) 
        {
            char ch = stones.charAt(i);

            if(set.contains(ch))
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
