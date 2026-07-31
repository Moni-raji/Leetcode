class Solution {
    public int minimumPushes(String word) {
        int arr[]=new int[26];
        for(char c:word.toCharArray()){
            arr[c-'a']++;
        }
        Arrays.sort(arr);
        int count=0;
        int r=0;
        for(int i=25;i>=0;i--){
            if(arr[i]==0) continue;
            r += ((count/8)+1) * arr[i];
            count++;
        }
        return r;
    }
}