class Solution {
    public int countAsterisks(String s) {
        int ast=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='|' && count==0) count++;
            else if(count>0 && c=='|') count--;
            else if(count==0) sb.append(c);
        }
        for(char c:sb.toString().toCharArray()){
            if(c=='*') ast++;
        }
        return ast;
    }
}