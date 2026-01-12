class Solution {
    public String removeDuplicates(String s) {
        /*Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()) stack.push(s.charAt(i));
            else if(stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();*/

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int len=sb.length();
            char c=s.charAt(i);
            if(len>0 && sb.charAt(len-1)==c) sb.deleteCharAt(len-1);
            else sb.append(c);
        }
        return sb.toString();
    }
}