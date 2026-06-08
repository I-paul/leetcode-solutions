class Solution {
    void solve(String digits ,String [] map , List<String> res ,String ans,  int n ){
        if(n==digits.length()){
            res.add(ans);
            return;
        }
        else{
            String temp = map[digits.charAt(n)-'0'];
            for(int i=0;i<temp.length();i++){
                solve(digits, map, res,ans+temp.charAt(i),n+1);
            }

            
        }
    }
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        if(n==0){
            return res;
        }
        solve(digits,map , res ,"",0);
        return res;
    }
}