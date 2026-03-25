class Solution {
    public int[][] generateMatrix(int n) {
        int t=0 , l =0;
        int b = n-1;
        int r = n-1;
        int a =1;
        int [][] mat =new int[n][n];
        while(t<=b && l<=r && a<=n*n){
            for(int i=l;i<=r;i++)
            mat[t][i]=a++;
            t++;
            for(int i=t;i<=b;i++)
            mat[i][r]=a++;
            r--;
            if(t<=b){
                for(int i=r;i>=l; i--)mat[b][i]=a++;
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t; i--)mat[i][l]=a++;
                l++;
            }
        }
        return mat;
    }
}