class Solution {
    public String convert(String s, int n) {
        if(n==1) return s;
        String r="";
        for(int i=0;i<n;i++){
            int j=i;
            int flag=0;
            while(j<s.length()){
                r+=s.charAt(j);
                if(i==0 || i==n-1) j+=(n-1)*2;
                else if(flag%2==0){
                    j+=(n-1)*2-(2*i);
                } 
                else{
                    j+=(2*i);
                }
                flag++;
            }
        }
        return r;
    }
}