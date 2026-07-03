class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.add(new int[]{k,0});
        int [] dist = new int [n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;

        List<List<int []>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] row : times){
            adj.get(row[0]).add(new int[]{row[1],row[2]});
        }
        while(!pq.isEmpty()){
            int [] curr = pq.poll();
            int u= curr[0];
            int d= curr[1];
            for(int []v : adj.get(u)){
                if(d+v[1] < dist[v[0]]){
                    dist[v[0]]=d+v[1];
                    pq.offer(new int []{v[0],dist[v[0]]});
                }
            }
        }

        int ans = 0;

        for(int i = 1; i <= n; i++){
            if(dist[i] == Integer.MAX_VALUE)
                return -1;

            ans = Math.max(ans, dist[i]);
        }

        return ans;

    }
}