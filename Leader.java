package STS;

public class Leader {

    public static void leadersOAnArray(int[] arr){
        int n = arr.length;
        int leader = arr[n-1];
        System.out.println(leader);
        for(int i = n-2; i>=0; i--){
            if(arr[i] > leader){
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leadersOAnArray(arr);
        
    }
    
}
