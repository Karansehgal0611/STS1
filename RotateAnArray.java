package STS;

public class RotateAnArray {
    public static void rotate(int arr[], int d)
    {
        int n = arr.length;
        int temp[] = new int[d];
        for(int i =0;i<d;i++)
        {
            temp[i] = arr[i];
        }
        for(int i=0;i<n-d;i++)
        {
            arr[i]=arr[i+d];
        }
        for(int i = 0;i<d;i++)
        {
            arr[n-d+i]=temp[i];
        }

        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int maxSubProd(int arr[])
    {
        int n = arr.length;
        int maxprod = arr[0];
        int minprod = arr[0];
        int res = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                int temp = maxprod;
                maxprod = minprod;
                minprod = temp;
            }
            maxprod = Math.max(arr[i], maxprod*arr[i]);
            minprod = Math.min(arr[i], minprod*arr[i]);
            res = Math.max(res, maxprod);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int k[]={4,0,-2,6};
        System.out.println(maxSubProd(k));
        System.out.println("-----------------");
        rotate(arr, d);
    }
}
