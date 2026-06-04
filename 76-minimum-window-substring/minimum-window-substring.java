class Solution {
    public String minWindow(String s, String t) {
        int freq[]=new int[256];
        int req=t.length();
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0;
        int start=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]>0) req--;
            freq[c]--;
            while(req==0){
                if(i-left+1<min){
                    min=i-left+1;
                    start=left;
                }
                char l=s.charAt(left);
                freq[l]++;
                if(freq[l]>0) req++;
                left++;
            }
        }
        if(start==-1) return "";
        return s.substring(start,start+min);
    }
}