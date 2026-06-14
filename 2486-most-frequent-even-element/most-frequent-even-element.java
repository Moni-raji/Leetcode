class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            if(a%2==0) map.put(a,map.getOrDefault(a,0)+1);
        }
        int r=-1;
        int max=0;
        for(int a:map.keySet()){
            if(map.get(a)>max){
                max=map.get(a);
                r=a;
            }
            else if(map.get(a)==max && a<r){
                r=a;
            }
        }
        return r;
    }
}