class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> al;
        Set<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j) continue;
                    if(digits[k]%2!=0) continue;

                    int a=digits[i]*100+digits[j]*10+digits[k];
                    set.add(a);
                }
            }
        }
        al=new ArrayList<>(set);
        Collections.sort(al);
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++) arr[i]=al.get(i);
        return arr;
    }
}