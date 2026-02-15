/**
 * Take an array of strings words and a string prefix.
 * Print the number of strings in words that contain pref as a prefix.
 * Example - input : words = { "pay","attention","practice","attend" } , pref = "at"
 * output : 2
 */

public class PrefAsPrefix 
{
    public static void main(String[] args) 
    {
        String[] arr = {"pay","attention","practice","attend"};
        String pref = "at";

        int icount = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i].startsWith(pref))
            {
                icount++;
            }
        }

        System.out.println(icount);

    }
}
