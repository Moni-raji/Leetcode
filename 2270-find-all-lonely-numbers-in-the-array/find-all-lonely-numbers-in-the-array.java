class Solution {
    public List<Integer> findLonely(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> al=new ArrayList<>();
        for(int a:nums){
            if(map.get(a)==1){
                if(!set.contains(a+1) && !set.contains(a-1)) al.add(a);
            }
        }
        return al;
    }
}