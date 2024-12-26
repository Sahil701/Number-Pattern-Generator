package numberpatterngenerator;

public class Pattern1 
{    
    public static  void main(String args[])
    {
        int i, j, n = 5;
        //For Pattern:-
        /*  1
            12
            123
            1234
            12345 */
        System.out.println("Pattern 1:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  12345
            1234
            123
            12
            1  */
        System.out.println("Pattern 2:-");
        for (i = n; i >= 1; i--) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*      1
               21
              321
             4321
            54321 */
        System.out.println("Pattern 3:-");
        for (i = 1; i <= n; i++) 
        {
            for (j = n; j >= i + 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) 
            {
                System.out.print(j);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  54321
             4321
              321
               21
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
                System.out.print(j);
            }
            System.out.println("*");
        }
        //For Pattern:-
        /*  1    |    1
            12   |   21
            123  |  321
            1234 | 4321
            12345|54321 */
        System.out.println("Pattern 5:-");
        for(i = 1; i <= n; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j);
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
                System.out.print(j);
            }
            System.out.println();
        }
        //For Pattern:-
        /*  12345|54321
            1234 | 4321  
            123  |  321
            12   |   21
            1    |    1 */
        //System.out.println("-----------");
        for (i = n; i >= 1; i--) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j);
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
                System.out.print(j);
            }
            System.out.println();
        }
    }
}