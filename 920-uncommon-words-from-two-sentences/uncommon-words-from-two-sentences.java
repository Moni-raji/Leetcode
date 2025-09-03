class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();
        for(String a:s1.split(" ")){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(String a:s2.split(" ")){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        List<String> al=new ArrayList<>();
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==1) al.add(e.getKey());
        }
        String arr[]=new String[al.size()];
        int i=0;
        for(String x:al){
            arr[i++]=x;
        }
        return arr;  
    }
}