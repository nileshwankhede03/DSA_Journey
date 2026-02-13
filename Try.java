import java.util.Scanner;

public class Try {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < arr.length; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        System.out.println((float)sum/size);
    }
}
