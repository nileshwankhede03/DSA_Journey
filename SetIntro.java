import java.util.HashSet;
import java.util.*;

public class SetIntro 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,1,2,5,8,2,8,2,3,3};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i]))
            {
                set.remove(arr[i]);
            }
            else
            {
                set.add(arr[i]);
            }
        }

        System.out.println(set);
    }
}
