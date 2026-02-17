public class SortingAlgorithm 
{
    public static void main(String[] args) 
    {
        int[] arr = {5,1,8,10,7,12};

        for (int i = 0; i < arr.length - 1; i++) 
        {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            if(min != i)
            {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


        System.out.println();
    }
}
