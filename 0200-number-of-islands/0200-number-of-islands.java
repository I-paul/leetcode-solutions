class Solution {
    void BFS(char[][] grid,int i, int j){
        Queue<int[]> q= new LinkedList<>();
        q.offer(new int []{i,j});
        int [][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int []curr=q.poll();
            int x= curr[0];
            int y= curr[1];
            for(int[]d:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && grid[nx][ny]=='1'){
                    q.offer(new int[]{nx,ny});
                    grid[nx][ny]=0;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m= grid[0].length;
        int count =0;
        for (int i=0 ; i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    BFS(grid,i,j);
                }
            }
        }
        return count;
    }
}