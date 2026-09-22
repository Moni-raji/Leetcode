class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;//5
        int arr[]=new int[n];//[]
        int j=n-1;//4
        for(int i=0;i<n;i++){
            arr[i]=citations[j--];
        }
        //arr=[6 5 3 1 0]
        int hindex=0;
        for(int i=0;i<n;i++){
            //if(!(arr[i]>=i+1)) break;
            if(arr[i]<i+1) break;
            hindex=i+1;
        }
        return hindex;
    }
}