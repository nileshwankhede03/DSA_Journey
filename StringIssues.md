nextInt() ke baad nextLine() directly call karte ho, to name empty string ban jata hai.

Reason:

nextInt() sirf number read karta hai.

Enter press karne par jo newline (\n) bachta hai, wo nextLine() consume kar leta hai.

Isliye name read nahi hota.

accept char

2 step :
         char ch = sc.next().charAt(0);

         ch = Character.toLowerCase(ch);


Kab use kare (practical cases)
1. Input validation

User galat input de sakta hai:

Input: 5
Input: @
Input: #

if(!Character.isLetter(ch))
{
    System.out.println("Invalid input");
}

