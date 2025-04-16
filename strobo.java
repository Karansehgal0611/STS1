package STS;
import java.util.*;

public class strobo {
    public static boolean isStrobo(String num)
    {
        HashMap<Character , Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int l = 0, r = num.length()-1;
        while(l<=r)
        {
            if(!map.containsKey(num.charAt(l)))
            {
                return false;
            }
            if(map.get(num.charAt(l))!=num.charAt(r))
            {
                return false;
            }   
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String num = "101";
        System.out.println(isStrobo(num));
    }
}
