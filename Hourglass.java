package STS;

public class Hourglass {
    public static void hourglass(int mat[][], int R, int C)
    {
        if(R<3 || C<3)
        {
            return;
        }
        int maxsum = 0;
        int sum;
        for(int i =0;i<R-2;i++)
        {
            for(int j =0; j<C-2;j++)
            {
                sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) + (mat[i+1][j+1]) + (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        hourglass(arr, 3, 3);
        int R = mat.length;
        int C = mat[0].length;
        hourglass(mat, R, C);
    }
}
