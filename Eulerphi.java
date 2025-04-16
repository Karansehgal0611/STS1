package STS;

public class Eulerphi {
    public static int gcd(int a , int b)
    {
        if(a==0)
        {
            return b;
        }
        else
        {
            return gcd(b%a , a);
        }
    }
    public static int phi(int n)
    {
        int result = 1;
        for(int i =2;i<n;i++)
        {
            if(gcd(i,n)==1)
            {
                result++;
            }
        }
        return result;
    }

    public static int phi1(int n)
    {
        int result = n;
        for(int p = 2; p*p<=n; p++)
        {
            if(n%p==0)
            {
                while(n%p==0)
                {
                    n=n/p;
                }
                result = result - result/p;
            }
        }

        if(n>1)
        {
            result = result - result/n;
        }   

        return result;
    }

    public static void main(String[] args) {
        int n = 13; // You can change this value to compute phi for different numbers
        System.out.println("phi(" + n + ") = " + phi(n));
        System.out.println("phi(" + n + ") = " + phi1(n));
    }
}