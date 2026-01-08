class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int[] a:items1){
            map.put(a[0],map.getOrDefault(a[0],0)+ a[1]);
        }
        for(int[] a:items2){
            map.put(a[0],map.getOrDefault(a[0],0)+ a[1]);
        }
        List<List<Integer>> al=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            al.add(Arrays.asList(e.getKey(),e.getValue()));
        }
        return al;
    }
}