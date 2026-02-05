class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        //Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int a:candyType){
            //map.put(a,map.getOrDefault(a,0)+1);
            set.add(a);
        }
        //if(map.size()<n) return map.size();
        if(set.size()<n) return set.size();
        return n;
    }
}