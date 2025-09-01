class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> set=new HashSet<>();
        for(char c:suits){
            set.add(c);
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ranks.length;i++){
            map.put(ranks[i],map.getOrDefault(ranks[i],0)+1);
        }
        
        if(set.size()==1) return "Flush";
        for(int a:map.values()){
            if(a>=3) return "Three of a Kind";
        }
        for(int a:map.values()){
            if(a==2) return "Pair";
        }
        return "High Card";

    }
}