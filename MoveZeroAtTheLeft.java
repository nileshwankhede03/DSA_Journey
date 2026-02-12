public class MoveZeroAtTheLeft 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,0,1,0,1,1,1,0};
        int j = 0;
        for(int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}

/*
    Logic : (all zeros la left side shift kela trr 1 aapoaap right side janar)
    j kade 1 cha theka deu je kahi asen matter j baghel
    i kde 0 cha theka deu je kahi asen matter j baghel
*/