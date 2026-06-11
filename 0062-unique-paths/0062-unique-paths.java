class Solution {
    int up(int[][]dp , int m,int n){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if (dp[m+1][n+1]!=-1){
            return dp[m+1][n+1];
        }
        else{
            dp[m+1][n+1] = up(dp,m-1,n) + up(dp,m,n-1);
            return dp[m+1][n+1];
        }
    }
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return up(dp,m-1,n-1);   
    }
}