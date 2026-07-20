class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> stack=new Stack<>();
        int l[]=new int[26];
        boolean v[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            l[c-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(v[c-'a']) continue;
            while(!stack.isEmpty() && stack.peek()>c && l[stack.peek()-'a']>i){
                v[stack.pop()-'a']=false;
            }
            stack.push(c);
            v[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}