package STS;

public class Example {
    public static boolean isPalindrome(int x)
    {
        String original = Integer.toBinaryString(x);
        System.out.println(original);
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        String rev = sb.toString();
        System.out.println(rev);
        return original.equals(rev);
    } 
    public static void main(String[] args) {
        String s = "10011";
        String f = "10100";
        int x = Integer.parseInt(s,2);
        int y = Integer.parseInt(f,2);
        int result = x*y;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }
}
