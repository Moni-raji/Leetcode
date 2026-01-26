class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int d=Math.abs(arr[i]-arr[i+1]);
            if(d<min) min=d;
        }
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i]) == min) {
            al.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return al;
    }
}