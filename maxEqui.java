package STS;
import java.util.*;

public class maxEqui {
    public static int maxEquil(int arr[])
    {
        int n = arr.length;
        int rightsum = 0;
        int leftsum = 0;
        int maxsum = 0;
        for(int i =0;i<n;i++)
        {
            rightsum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            rightsum= rightsum - arr[i];
            if(leftsum==rightsum && leftsum>maxsum)
            {
                maxsum = leftsum;
            }
            leftsum+=arr[i];
        }

        return maxsum;
    }

    public static void findLeaders(int arr[])
    {
        List<Integer> leaders = new ArrayList<>();
        int l = arr.length;
        int max = arr[l-1];
        leaders.add(max);

        for(int i = l-2; i>=0;i--)
        {
            if (arr[i]>max) {
                max=arr[i];
                leaders.add(max);
            }
        }

        for(int i=0;i<leaders.size();i++)
        {
            System.out.println(leaders.get(i));
        }

    }

    public static void findMajortiy(int arr[])
    {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
            candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
            count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element found");
        }
    }

    public static void findMajortiy2(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                System.out.println("Majority element is: " + entry.getKey());
                return;
            }
        }

        System.out.println("No majority element found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("---------");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("---------");
        findMajortiy2(arr);

        sc.close();
    }
}
