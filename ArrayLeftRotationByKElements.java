
// (reverse technique)
// 1 2 3 4 5 
// 5 4 3 2 1 
// 3 4 5 1 2 

// k = 2 
// 1 2 3 4 5
// 2 3 4 5 1 (1 time)
// 3 4 5 1 2 (2 time)
public class ArrayLeftRotationByKElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; // 2 3 4 5 1

/* 
        (1 time) core task || same task
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
*/
        int k = 2;
        k = k % arr.length;
        for (int task = 1; task <= k; task++) 
        {
            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) 
            {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
