
(trick) : same task multiple times
(same task) : core logic
(multiple times) : outer loop titkya times

Nested Loops : 

jevha eka question madhe 2 task astat
(1 task madhe ajun 1 task)
tevha use hote nested loops

ex : 145 is a strong number  (each digit cha fact chi addition that num itself)
1! + 4! + 5! = 1 + 24 + 120 = 145

task 1 : 1 digit ghya
task 2 : tya digit cha factorial kadha 

ex code : 

task 1 code :  ( 1 digit ghya )

        while (num > 0) 
        {
            int iDigit = num % 10;

            num = num / 10;
        }

task 2 code :  ( tya digit cha factorial kadha  )

        int fact = 1;
        for (int i = 1; i <= iDigit; i++) 
        {
            fact = fact * i;
        }

compiled code
        // task 1
        while (num > 0) 
        {
            int iDigit = num % 10;

            // task 2
            int fact = 1;
            for (int i = 1; i <= iDigit; i++) 
            {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

moral : task madhe task asen trr nested use kara 

Note : pattern programming madhe
row -> static
columns -> dynamic (can be grow or shrink)
[according to need]