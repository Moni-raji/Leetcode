class Solution {
    public String simplifyPath(String path) {
        String parts[]=path.split("/");
        Stack<String> stack=new Stack<>();
        for(String a:parts){
            if(a.equals("") || a.equals(".")) continue;
            else if(a.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(a);
        }
        StringBuilder sb=new StringBuilder();
        for(String a:stack){
            sb.append("/").append(a);
        }
        return sb.length()>0 ? sb.toString() : "/";
    }
}