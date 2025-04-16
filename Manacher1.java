package STS;

import java.util.Scanner;

public class Manacher1 {
    public static void LongPal(String s)
    {
        int n = s.length();
        char[] T = new char[2*n+3];
        T[0]='$';
        T[2*n+2]='@';
        for(int i =0;i<n;i++)
        {
            T[2*i+1]='#';
            T[2*i+2]=s.charAt(i);
        }
        T[2*n+1]='#';
        int[] p= new int[T.length];
        int c=0,r=0;
        for(int i = 1;i<T.length - 1; i++)
        {
            int mirr = 2*c-i;
            if(i<r)
            {
                p[i]=Math.min(r-i,p[mirr]);
            }
            while(T[i+(1+p[i])]==T[i-(1+p[i])])
            {
                p[i]++;
            }
            if(i+p[i]>r)
            {
                r=i+p[i];
                c=i;
            }
        }
        int length = 0;
        c=0;
        for(int i =1;i<p.length-1;i++)
        {
            if(p[i]>length)
            {
                length = p[i];
                c=i;
            }
        }
        
        if (s.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println(s.substring((c-1-length)/2,(c-1+length)/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LongPal(s);
        sc.close();
    }
}
