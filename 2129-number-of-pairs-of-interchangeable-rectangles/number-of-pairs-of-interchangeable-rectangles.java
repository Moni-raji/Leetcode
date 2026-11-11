class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> map=new HashMap<>();
        long result=0;
        for(int a[]:rectangles){
            double b=(double)a[0]/a[1];
            result+=map.getOrDefault(b,0);
            map.put(b,map.getOrDefault(b,0)+1);
        }
        return result;
    }
}