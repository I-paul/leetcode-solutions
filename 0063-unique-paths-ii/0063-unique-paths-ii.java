class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int [m+1][n+1];
        for(int [] row : dp){
            Arrays.fill(row,-1);
        }
        for(int i =0 ; i<m+1; i++){
            for(int j=0; j<n+1 ; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(obstacleGrid[i-1][j-1]==1){
                    dp[i][j]=0;
                }
                else if(i==1 && j==1){
                    dp[i][j]=1;
                }
                else
                {
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    }
}