import java.util.Scanner;

public class SwapWithoutThirdVariable 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("values before swap : "+ a );
        System.out.println("values before swap : "+ b );
        // a = 10 , b = 5

        a = (a + b) - (b = a);

        System.out.println("values after swap : "+ a );
        System.out.println("values after swap : "+ b );

    }
}
