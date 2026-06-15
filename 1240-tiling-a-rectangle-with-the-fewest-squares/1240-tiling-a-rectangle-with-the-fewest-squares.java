class Solution 
{
    int ans;
    public boolean canPlace(int[][] rectangle,int x,int y,int k, int n, int m)
    {
        // Boundary check
        if(x + k > n || y + k > m)
        {
            return false;
        }
        for(int i = x; i < x + k; i++)
        {
            for(int j = y; j < y + k; j++)
            {
                // Already filled
                if(rectangle[i][j] == 1)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public void place(int[][] rectangle, int x, int y, int k, int val)
    {
        int i,j;
        for(i=x;i<x+k;i++)
        {
           for(j = y; j < y + k; j++)
            {
                rectangle[i][j] = val;
            }
        }
    }
    public void solve(int[][] rectangle, int count, int n, int m)
    {
        // Pruning
        if(count >= ans)
        {
            return;
        }
        int x=-1,y=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(rectangle[i][j] == 0)
                {
                    x=i;
                    y=j;
                    break;
                }
            }
            if(x!=-1)
            {
                break;
            }
        }
        // Rectangle fully filled
        if(x == -1)
        {
            ans = Math.min(ans, count);
            return;
        }
        for(int k=Math.min(n-x,m-y);k>=1;k--)
        {//k=5
            if(canPlace(rectangle, x, y, k, n, m))
            {
                place(rectangle,x,y,k,1);
                solve(rectangle,count+1,n,m);
                place(rectangle,x,y,k,0);
            }
        }
    }
    public int tilingRectangle(int n, int m) 
    {
        int[][] rectangle=new int[n][m];
        ans=Integer.MAX_VALUE;
        solve(rectangle,0,n,m);
        return ans;
    }
}