class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        solve("",n,n);
        return ans;
    }
    public void solve(String curr,int open,int close){
        if(open==0 && close==0){
            ans.add(curr);
            return;
        }
        if(open>0) solve(curr+'(', open-1,close);
        if(close>open) solve(curr+')',open,close-1);
    }
}