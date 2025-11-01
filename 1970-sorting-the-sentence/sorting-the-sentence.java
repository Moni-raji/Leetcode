class Solution {
    public String sortSentence(String s) {
        String a[]=s.split(" ");
        String arr[]=new String[a.length];
        for(String x:a){
            int len=x.length();
            int i=x.charAt(len-1)-'0';
            String val=x.substring(0,len-1);
            arr[i-1]=val;
        }
        return String.join(" ",arr);
    }
}