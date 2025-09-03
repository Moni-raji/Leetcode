class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,Integer> map=new HashMap<>();
        int len=names.length;
        for(int i=0;i<len;i++){
            map.put(heights[i],i);
        }
        Arrays.sort(heights);
        String arr[]=new String[len];
        int j=0;
        for(int i=len-1;i>=0;i--){
            int index=map.get(heights[i]);
            arr[j++]=names[index];
        }
        return arr;

    }
}