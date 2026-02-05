class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:candyType){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        if(map.size()<n) return map.size();
        return n;
    }
}