class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return true;
        /*Map<Integer,Integer> map=new HashMap<>();
        while(n!=1){
            if(map.containsKey(n)) return false;
            map.put(n,map.getOrDefault(n,0)+1);
            int sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return true;*/
    }
}