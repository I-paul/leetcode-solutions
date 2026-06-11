class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int [m+1][n+1];
        for(int[]row : dp){
            Arrays.fill(row, -1);
        }

        for(int i=0 ; i<m+1; i++){
            for(int j=0 ; j<n+1 ; j++){
                if(i==0 || j==0){
                    dp[i][j]=Integer.MAX_VALUE;
                }
                else if(i==1 && j==1){
                    dp[i][j]=grid[i-1][j-1];
                }
                else{
                    dp[i][j]= grid[i-1][j-1]+Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}