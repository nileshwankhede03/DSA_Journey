public class MoveNegandPositive 
{
    public static void main(String[] args) 
    {
        // int arr[] = {-5, -4, -3, 1, 2, 3};
        int arr[] = {0, 4, 5, -1, -2};

        int index = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] <= 0)
            {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
