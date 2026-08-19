class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            int r=reservedSeats[i][0];
            int c=reservedSeats[i][1];
            map.computeIfAbsent(r,x->new HashSet<>()).add(c);
        }
        int count=2*n;
        for(int a:map.keySet()){
            Set<Integer> set=map.get(a);
            boolean f=true;
            boolean s=true;
            boolean t=true;
            for(int b:set){
                if(b>=2 && b<=5) f=false;
                if(b>=4 && b<=7) s=false;
                if(b>=6 && b<=9) t=false;
            }
            if(f && t){

            }
            else if(f || s || t) count--;
            else count-=2;
        }
        return count;
    }
}