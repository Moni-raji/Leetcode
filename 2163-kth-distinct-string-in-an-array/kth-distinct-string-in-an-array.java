class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int a=0;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                a++;
                if(a==k) return e.getKey();
            }
            
        }
        return "";
    }
}