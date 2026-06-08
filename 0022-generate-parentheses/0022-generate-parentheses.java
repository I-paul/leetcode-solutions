class Solution {
    void solve(int n, List<String> res , int opn , int clo , String ans){
        if(opn==n && clo ==n){
            res.add(ans);
            return;
        }
        else{
            //open 
            if(opn<n){
                solve(n,res,opn+1,clo,ans+"(");
            }
            //close
            if(opn>clo){
                solve(n,res,opn,clo+1,ans+")");
            }
            
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n==1){
            res.add("()");
            return res;
        }
        solve(n,res,0 ,0, "");
        return res;
    }
}