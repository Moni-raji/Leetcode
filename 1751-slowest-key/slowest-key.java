class Solution {
    public char slowestKey(int[] arr, String keysPressed) {
        char c=' ';
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int diff=0;
            if(i==0){
                diff=arr[i];
            }
            else{
                diff=arr[i]-arr[i-1];
            }
            if(diff>max){
                max=diff;
                c=keysPressed.charAt(i);
            }
            else if(diff==max){
                if(keysPressed.charAt(i)>c) c=keysPressed.charAt(i);
            }
        }
        return c;
    }
}