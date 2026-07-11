class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int lucky=-1;
        for(int x:map.keySet()){
            if(map.get(x)==x && x>lucky) lucky=x;
        }
        return lucky;
    }
}