class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[]=new boolean[arr.length];
        return find(start,arr,visited);
    }
    public boolean find(int i,int arr[], boolean visited[]){
        int n=arr.length;
        if(i<0 || i>=n) return false;
        if(visited[i]) return false;
        if(arr[i]==0) return true;
        visited[i]=true;
        boolean add=find(i+arr[i],arr,visited);
        boolean sub=find(i-arr[i],arr,visited);
        return add || sub;
    }
}