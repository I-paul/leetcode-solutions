class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()%2==0){
            for(char i : s.toCharArray()){
                if(i=='(' || i=='{' || i=='['){
                    st.push(i);
                }
                else if(!st.isEmpty()){
                    char top=st.pop();
                    if(i==')' && top!='(' || i=='}' && top !='{' || i==']' && top!='[')
                    {
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return st.isEmpty();
    }
}