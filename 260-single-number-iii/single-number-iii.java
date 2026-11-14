class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=0;
        for(int a:map.values()){
            if(a==1) count++;
        }
        int arr[]=new int[count];
        int i=0;
        for(int a:map.keySet()){
            if(map.get(a)==1) arr[i++]=a;
        }
        return arr;
    }
}