class Solution {
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        int lvl =0;
        q.offer(n);
        s.add(n);
        while(q.isEmpty() ==false){
            int size = q.size();
            lvl++;
            for(int i = 0 ; i<size; i++){
                int curr =  q.poll();
                for(int j =0 ; j*j<=curr;j++){
                    int nxt= curr-(j*j);
                    if(nxt==0){
                        return lvl;
                    }
                    if(!s.contains(nxt)){
                        q.offer(nxt);
                        s.add(nxt);
                    }
                }
            }
        }
        return lvl;
    }
}