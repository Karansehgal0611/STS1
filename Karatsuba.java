package STS;
import java.lang.Math;
public class Karatsuba {
    public static long KaratsubaMultiply(long x , long y)
    {
        if(x<10 || y<10)
        {
            return x*y;
        }
        int n = Math.max(Long.toString(x).length(),Long.toString(y).length());
        int half = (n+1)/2;
        long a = x/(long)Math.pow(10,half);
        long b = x%(long)Math.pow(10,half);
        long c = y/(long)Math.pow(10,half);
        long d = y%(long)Math.pow(10,half);
        long ac = KaratsubaMultiply(a,c);
        long bd = KaratsubaMultiply(b,d);
        long adbc = KaratsubaMultiply(a+b,c+d)-ac-bd;
        return (long)(ac*Math.pow(10,2*half)+adbc*Math.pow(10,half)+bd);
    }

    public static void main(String[] args) {
        long x = 1234;
        long y = 5678;
        long result = KaratsubaMultiply(x, y);
        System.out.println("The result of multiplying " + x + " and " + y + " is: " + result);
    }
}
