public class PallindromeTwoPointer {
    public static void main(String[] args) {
        String input = "madam";
        input = input.toLowerCase();

        char arr[] = input.toCharArray();

        int i = 0;
        int j = arr.length - 1;
        while( i < j ) 
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        String result = new String(arr); // char array to String

        if (result.equals(input)) {
            System.out.println("String is pallindrome");
            
        } else {
            
            System.out.println("not pallindrome");
        }
    }
}
