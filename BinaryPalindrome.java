package STS;

public class BinaryPalindrome {
    public static boolean Palindromic(int x)
    {
        int rev =0;
        int original = x;
        while(x>0)
        {
            rev <<=1;
            rev |=(x&1);
            x>>=1;
        }
        return rev==original;
    }

    public static void main(String[] args) {
        int x = 9;
        System.out.println(Palindromic(x));
        System.out.println(Integer.toBinaryString(x));
        String s = "10011";
        System.out.println(Integer.parseInt(s,2));
        String num ="1234";
        int k = Integer.parseInt(num);
        System.out.println(k);
        String h = Integer.toString(k);
        System.out.println(h+"Hi");
    }
    
}
