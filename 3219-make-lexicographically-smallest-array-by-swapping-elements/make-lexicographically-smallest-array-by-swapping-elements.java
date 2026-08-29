class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int r[]=new int[n];
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start=0;
        while(start<n){
        int end=start;
        while(end+1<n && (long)arr[end+1][0]-arr[end][0]<=limit){
            end++;
        }
        List<Integer> al=new ArrayList<>();
        for(int i=start;i<=end;i++){
            al.add(arr[i][1]);
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            r[al.get(i)]=arr[start+i][0];
        }
        start=end+1;
        }
        return r;
    }
}