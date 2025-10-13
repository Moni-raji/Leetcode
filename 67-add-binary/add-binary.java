class Solution {
    public String addBinary(String a, String b) {
        int n=a.length()-1;
        int m=b.length()-1;
        String r="";
        int carry=0;
        while(n>=0 || m>=0 || carry>0){
            int x=(n>=0)? a.charAt(n)-'0' : 0;
            int y=(m>=0)? b.charAt(m)-'0' :0;
            int sum=x+y+carry;
            if(sum==0 || sum==1){
                r=sum+r;
                carry=0;
            }
            else if(sum==2){
                r="0"+r;
                carry=1;
            } 
            else if(sum==3){
                r="1"+r;
                carry=1;
            }
            n--;
            m--;
        }
        return r;
    }
}