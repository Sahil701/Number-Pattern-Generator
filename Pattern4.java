package numberpatterngenerator;

public class Pattern4 
{
    public static void main(String args[]) 
    {
        int i, j, n = 5;
        //For Pattern:-
        /*  5
            54
            543
            5432
            54321 */
        System.out.println("Pattern 1:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(j);
            }
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  54321
            5432
            543
            54
            5  */
        System.out.println("Pattern 2:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(j);
            }
            for (j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*      5
               45
              345
             2345
            12345 */
        System.out.println("Pattern 3:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = i; j >= 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) 
            {
                System.out.print(j);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  12345
             2345
              345
               45
                5 */
        System.out.println("Pattern 4:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = 2; j < i + 1; j++) 
            {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) 
            {
                System.out.print(j);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /* 5    |    5
           54   |   45
           543  |  345
           5432 | 2345
           54321|12345  */
        System.out.println("Pattern 5:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(j);
            }
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (j = i; j > 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
        //For Pattern:-
        /* 54321|12345
           5432 | 2345
           543  |  345
           54   |   45
           5    |    5 */
        //System.out.println("-----------");
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(j);
            }
            for (j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (j = 2; j < i + 1; j++) 
            {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}