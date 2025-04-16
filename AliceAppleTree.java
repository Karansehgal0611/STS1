package STS;

public class AliceAppleTree {

    public static String Hyphen(String str)
    {
        if(str.contains(("-")))
        {
            int idx = str.indexOf("-");
            return "-"+str.substring(0,idx)+str.substring(idx+1);
        }
        else
        {
            return str;
        }
    }
    public static void main(String[] args) {
        int apple = 4;
        int cnt = 0, sum = 0;
        while(sum<apple)
        {
            cnt++;
            sum+=(12*cnt*cnt);
        }

        //System.out.println(8*cnt);

        System.out.println(Hyphen("Alice-Apple"));

    }
}
