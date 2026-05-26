class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        //citations=[0 1 3 5 6]
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
//the idea is 1paper should have 1citation
//2paper should have 2 citations
//3paper should have 3 citation
//4paper should have 4cit this fails in input1 hence 3is o/p