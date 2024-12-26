package numberpatterngenerator;

public class Pattern2 
{
    public static void main(String args[]) 
    {
        int i, j, n = 5;
        //For Pattern:-
        /*  1
            22
            333
            4444
            55555 */
        System.out.println("Pattern 1:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  55555
            4444
            333
            22
            1     */
        System.out.println("Pattern 2:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*      1
               22
              333
             4444
            55555 */
        System.out.println("Pattern 3:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) 
            {
                System.out.print(i);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /* 55555
            4444
             333
              22
               1 */
        System.out.println("Pattern 4:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) 
            {
                System.out.print(i);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  1    |    1
            22   |   22
            333  |  333
            4444 | 4444
            55555|55555 */
        System.out.println("Pattern 5:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
        //For Pattern:-
        /* 55555|55555
           4444 | 4444
           333  |  333
           22   |   22
           1    |    1 */
        //System.out.println("-----------");
        for (i = n; i >= 1; i--) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(i);
            }
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}