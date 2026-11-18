class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int arr[]=new int[6];
        for(int i=0;i<garbage.length;i++){
            count(garbage[i],arr,i);
        }
        int waste=0;
        for(int i=0;i<3;i++){
            waste+=arr[i];
        }
        for(int i=1;i<travel.length;i++){
            travel[i]+=travel[i-1];
        }
        int total=waste;
        for(int i=3;i<=5;i++){
            if(arr[i]>0){
                total+=travel[arr[i]-1];
            }
        }
        return total;

    }
    public void count(String a,int arr[],int i){
        for(char c:a.toCharArray()){
            if(c=='G'){
                 arr[0]++;
                 arr[3]=i;
            }
            else if(c=='P'){
                 arr[1]++;
                 arr[4]=i;
            }
            else{
                 arr[2]++;
                 arr[5]=i;
            }
        }
    }
}