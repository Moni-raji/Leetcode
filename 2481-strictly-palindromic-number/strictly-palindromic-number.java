class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!palin(find(n,i))) return false;
        }    
        return true;
    }
    public String find(int a,int b){
        String r="";
        while(a!=0){
            r=String.valueOf(a%b)+r;
            a/=b;
        }
        return r;
    }
    public boolean palin(String a){
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        return a.equals(sb.toString());

    }

}