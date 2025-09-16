class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        Arrays.sort(a);
        int rank=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])) map.put(a[i],rank++);
        }
        int r[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            r[i]=map.get(arr[i]);
        }
        return r;
    }
}