class Solution {
    public boolean checkString(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]=='b' && arr[i+1]=='a') return false;
        }
        return true;
    }
}