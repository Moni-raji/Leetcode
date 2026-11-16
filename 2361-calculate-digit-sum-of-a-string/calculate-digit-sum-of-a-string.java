class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(s.length()>k){
            String a="";
            if(i+k<s.length()){
                a=s.substring(i,i+k);
            }
            else if(i<s.length()){
                a=s.substring(i);
            }
            i+=k;
            sb.append(sum(a));
            
            if(i>=s.length()){
                s=sb.toString();
                sb.setLength(0);
                i=0;
            }
        }
        return s;
    }
    public int sum(String s){
        int sum=0;
        for(char c:s.toCharArray()){
            sum+=(c-'0');
        }
        return sum;
    }
}