class Solution {
    void BFS(char[][] grid,int i, int j){
        Queue<int[]> q= new LinkedList<>();
        grid[i][j]='S';
        q.offer(new int []{i,j});
        int [][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int []curr=q.poll();
            int x= curr[0];
            int y= curr[1];
            for(int[]d:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && grid[nx][ny]=='O'){
                    q.offer(new int[]{nx,ny});
                    grid[nx][ny]='S';
                }
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0 ; i<m ; i++){
            if(board[0][i]=='O'){
                BFS(board,0,i);
            }
        }
        for(int i=0 ; i<n ; i++){
            if(board[i][0]=='O'){
                BFS(board, i,0);
            }
        }
        for(int i=0 ; i<m ; i++){
            if(board[n-1][i]=='O'){
                BFS(board, n-1,i);
            }
        }
        for(int i=0 ; i<n ; i++){
            if(board[i][m-1]=='O'){
                BFS(board, i,m-1);
            }
        }
        for(int k =0 ; k<n ;k++){
            for(int c = 0 ; c<m;c++){
                if(board[k][c]=='S'){
                    board[k][c] = 'O';
                }
                else if (board[k][c]=='O'){
                    board[k][c]='X';
                }
            }
        }
        return;
    }
}