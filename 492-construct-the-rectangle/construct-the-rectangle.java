class Solution {
    public int[] constructRectangle(int area) {
        List<int[]> al=new ArrayList<>();
        for(int i=area;i>=1;i--){
            if(area%i==0){
                int x=i;
                int y=area/i;
                al.add(new int[] {x,y});
            }
        }
        int min=Integer.MAX_VALUE;
        int result[]=new int[2];
        for(int i=0;i<al.size();i++){
            int a[]=al.get(i);
            int diff=Math.abs(a[0]-a[1]);
            if(diff<min){
                min=diff;
                result[0]=a[0];
                result[1]=a[1];
            }
        }
        return result;
    }
}