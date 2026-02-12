public class SecondMax 
{
    public static void main(String[] args) {
        int arr[] = {8, 12, 5, 16, 45, 95, 63, 100};

        // max = 12 kara
        // secondMax = 8 kara (inbuilt use kara)
        int max = Math.max(arr[0], arr[1]);
        int secondMax = Math.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) 
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max)
            {
                secondMax = arr[i];
            }
        }

        System.out.println("Second max element is : "+secondMax);
    }
}