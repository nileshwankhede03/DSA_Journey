public class SubArrayTargetLen 
{
    public static void main(String[] args) 
    {
        // subarray : contineous part of an Array
        int arr[] = {1,2,3,7,5};
        int target = 12; // 2,3,7 ="1st subaray " // 7,5 " ="2nd subaray "
        int count = 0;


        for (int i = 0; i < arr.length; i++) 
        {
            int sum = 0;
            for (int j = i; j < arr.length; j++) 
            {
                sum = sum + arr[j];

                if(sum == target)
                {
                    count++;
                }
            }
        }


        System.out.println("Count of subarray which matches to target is : "+count);
    }
}
