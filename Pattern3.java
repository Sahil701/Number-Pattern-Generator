package numberpatterngenerator;

public class Pattern3 
{
    public static void main(String args[]) 
    {
        int i, j, n = 5;
        //For Pattern:-
        /* 5
           44
           333
           2222
           11111 */
        System.out.println("Pattern 1:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  11111
            2222
            333
            44
            5     */
        System.out.println("Pattern 2:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*      5
               44
              333
             2222
            11111 */
        System.out.println("Pattern 3:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  11111
             2222
              333
               44
                5 */
        System.out.println("Pattern 4:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /* 5    |    5
           44   |   44
           333  |  333
           2222 | 2222
           11111|11111 */
        System.out.println("Pattern 5:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
        //For Pattern:-
        /* 11111|11111
           2222 | 2222
           333  |  333
           44   |   44
           5    |    5 */
        //System.out.println("-----------");
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (j = 1; j <= i - 1; j++) 
            {
                System.out.print(" ");
            }
            for (j = n; j >= i; j--) 
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}