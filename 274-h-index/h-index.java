class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int arr[]=new int[n];
        int j=n-1;
        for(int i=0;i<n;i++){
            arr[i]=citations[j--];
        }
        int hindex=0;
        for(int i=0;i<n;i++){
            if(!(arr[i]>=i+1)) break;
            hindex=i+1;
        }
        return hindex;
    }
}