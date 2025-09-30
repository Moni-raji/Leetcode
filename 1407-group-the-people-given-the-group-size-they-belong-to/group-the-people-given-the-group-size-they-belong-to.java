class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> al=new ArrayList<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++){
            if(groupSizes[i]==Integer.MIN_VALUE) continue;
            int a=groupSizes[i];
            List<Integer> l=new ArrayList<>();
            l.add(i);
            groupSizes[i]=Integer.MIN_VALUE;
            int j=i+1;
            while(l.size()<a){
                if(groupSizes[j]==a){
                    l.add(j);
                    groupSizes[j]=Integer.MIN_VALUE;
                }
                j++;
            }
            al.add(l);
        }
        return al;
    }
}