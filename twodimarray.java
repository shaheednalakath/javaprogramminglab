import java.util.*;
public class twodimarray{
    public static void main(String[] args)
    {
        int i,n,m,j;
        System.out.println("enter size of row and column");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arraymxone[][]=new int[n][m];
        int arraymxtwo[][]=new int[n][m];
        int array[][]=new int[n][m];
        System.out.println("enter element to first mx");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
              arraymxone[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter element to second mx");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
              arraymxtwo[i][j]=sc.nextInt();
            }
        }
        System.out.println("add to mx");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                array[i][j]=arraymxone[i][j]+arraymxtwo[i][j];
            }
        }
        System.out.println("add two mx is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(   array[i][j]+"  ");
            }
            System.out.println( );
        }
        
    }
}

