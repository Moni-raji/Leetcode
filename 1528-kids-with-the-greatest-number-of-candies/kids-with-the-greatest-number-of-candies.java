class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al=new ArrayList<>();
        int n=candies.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(candies[i]>max) max=candies[i];
        }
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies) >=max) al.add(true);
            else al.add(false);
        }
        return al;
    }
}