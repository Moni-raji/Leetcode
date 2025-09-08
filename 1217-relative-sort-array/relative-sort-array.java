class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int left=0;
        
        for(int i=0;i<arr2.length;i++){
            for(int j=left;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    int temp=arr1[j];
                    arr1[j]=arr1[left];
                    arr1[left]=temp;
                    left++;
                }
                
            }
        }
        for(int i=left;i<arr1.length;i++){
            for(int j=left;j<arr1.length-1;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        return arr1;
    }
}