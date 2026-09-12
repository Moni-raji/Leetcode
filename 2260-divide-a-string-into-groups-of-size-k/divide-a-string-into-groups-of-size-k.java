class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int rem=n%k;
        List<String> al=new ArrayList<>();
        for(int i=0;i<n-rem;i+=k){
            al.add(s.substring(i,i+k));
        }
        if(rem!=0){
        String a="";
        for(int i=n-rem;i<n;i++){
            a+=s.charAt(i);
        }
        for(int i=0;i<k-rem;i++){
            a+=fill;
        }
        al.add(a);
        }
        String arr[]=new String[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}