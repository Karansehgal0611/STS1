package STS;

import java.util.List;
import java.util.ArrayList;

public class weightedString {
    public static int values[] = new int[26];
    public static void insertValues()
    {
        values[0]=1;
        int prev = 1;
        for(int i=1;i<26;i++)
        {
            values[i]=(i+1)*prev + prev;
            prev = values[i];
        }
    }

    public static int findfloor(int k, int low, int high)
    {
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(values[mid]<=k)
            {
                ans = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void formedString(List<Character> s , int k)
    {
        int low = 0;
        int high = 25;  
        while(k!=0)
        {
            int ind = findfloor(k, low, high);
            s.add((char)(ind+'A'));
            k-=values[ind];
        }

        for(int i=s.size()-1;i>=0;i--)
        {
            System.out.print(s.get(i));
        }
    }

    public static void main(String[] args) {
        insertValues();
        int k = 25;
        List<Character> s = new ArrayList<>();
        formedString(s, k);
    }
}
