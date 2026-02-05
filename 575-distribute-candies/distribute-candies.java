class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for(int a:candyType){
            set.add(a);
        }
        //if(set.size()<n) return set.size();
        //return n;
        return set.size()<n ? set.size() : n;
    }
}