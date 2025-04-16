package STS;

public class ChineseRem {
    public static int calculate(int size, int div[], int rem[])
    {
        int j,x=1;
        while(true)
        {
            for(j =0;j<size;j++)
            {
                if(x%div[j]!=rem[j])
                {
                    break;
                }

            }
            if(j==size)
            {
                return x;
            }
            x++;
        }
    }

    public static void main(String args[])
    {
        int num[] = {5,7};
        int rem[] = {1,3};
        int k = num.length;
        System.out.println("x is " + calculate(k,num,rem));
    }
}
