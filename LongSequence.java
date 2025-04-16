package STS;

public class LongSequence {
    public static int longestConsecutiveOnes(int n)
    {
        String bin = Integer.toBinaryString(n);
        int maxlength = 0;
        int currlength = 0;
        int prevlength = 0;
        for(char bit:bin.toCharArray())
        {
            if(bit=='1')
            {
                currlength++;
            }
            else
            {
                maxlength = Math.max(maxlength,currlength+prevlength+1);
                prevlength=currlength;
                currlength=0;
                
            }
        }

        maxlength = Math.max(maxlength,currlength+prevlength+1);
        return maxlength;

    }

    public static byte swapNibbles(byte x)
    {
        return (byte) ((x & 0x0F)<<4 | (x & 0xF0)>>4);
    }

    public static void main(String[] args) { 
        int n = 17; // Example number
        int result = longestConsecutiveOnes(n);
        System.out.println("The longest sequence of consecutive 1s is: " + result);

        byte val = (byte)0xAB;
        byte swap = swapNibbles(val);
        System.out.println(Integer.toBinaryString(val & 0xFF));
        System.out.println(Integer.toBinaryString(swap & 0xFF));
    }

}
