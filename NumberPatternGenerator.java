package numberpatterngenerator;

public class NumberPatternGenerator 
{
    public static void main(String args[]) 
    {
        int i,j,n=5,k=1;
        for(i=1;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
/* Output:- 1
            2 3
            4 5 6
            7 8 9 10 */