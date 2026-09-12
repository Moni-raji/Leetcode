class Solution {
    public String decodeString(String s) {
        Stack<Integer> numb=new Stack<>();
        Stack<String> str=new Stack<>();
        int num=0;
        String curr="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=(num*10)+(c-'0');
            }
            else if(Character.isLetter(c)){
                curr+=String.valueOf(c);
            }
            else if(c=='['){
                numb.push(num);
                str.push(curr);
                curr="";
                num=0;
            }
            else if(c==']'){
                int a=numb.pop();
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<a;i++){
                    sb.append(curr);
                }
                String r=str.pop()+sb.toString();
                curr=r;
            }
        }
        return curr;
    }
}