package STS;

public class Recursive {
    public static int Paths(int m , int n)
    {
        if(m==1 || n==1)
        {
            return 1;
        }
        return Paths(m,n-1) + Paths(m-1,n)+ Paths(m-1, n-1);

    }

    public static int josepheus(int n, int k)
    {
        if(n==1)
        {
            return 1;
        }
        return (josepheus(n-1,k)+k-1)%n+1;
    }
}
