class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && i!=k && j!=k){
                        if(digits[i]!=0 && digits[k]%2==0){
                            int a=100*digits[i]+10*digits[j]+digits[k];
                            set.add(a);
                        }
                    }
                }
            }
        }
        return set.size();
    }
}