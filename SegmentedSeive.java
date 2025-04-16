package STS;

public class SegmentedSeive {
    public static void segmented(int l, int h)
    {
        boolean[] prime = new boolean[h+1];
        for(int p=2; p*p<=h; p++)
        {
            //find smallest multiple of p in range [l,h]
            int sm = (l/p)*p;
            if(sm<l)
            {
                sm+=p; //Make sure sm is in the range[l,h]
            }
            //mark all multiples of p non-prime
            for(int i = sm;i<=h;i+=p)
            {
                prime[i]=true;
            }
        }

        for(int p=l;p<=h;p++)
        {
            if(!prime[p]&& p>l)
            {
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        int l = 10;
        int h = 50;
        segmented(l, h);
    }
}
