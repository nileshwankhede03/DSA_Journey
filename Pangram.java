// public class Pangram 
// {
//     public static void main(String[] args) 
//     {
//         String input = "abcdefghijklmnopqrstuvwxyz";

//         int[] bitMap = new int[128];

//         for (int i = 0; i < input.length(); i++) 
//         {
//             char ch = input.charAt(i);
//             int ascii = (int) ch;

//             if(ch >= 'a' && ch <= 'z')
//             {
//                 bitMap[ascii]++;
//             }
//         }

//         // for (int i = 'a'; i <= 'z'; i++) 
//         // {
//         //     if(bitMap[i] != 0)
//         //     {
//         //         System.out.println("not a pangram string");
//         //     }
//         // }

//         System.out.println("pangram string");
//     }
// }
