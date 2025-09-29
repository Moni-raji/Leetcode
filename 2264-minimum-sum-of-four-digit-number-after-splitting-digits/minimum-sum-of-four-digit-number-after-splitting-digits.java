class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
        int arr[]=new int[s.length()];
        int i=0;
        while(num!=0){
            arr[i++]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int a=arr[0]*10+arr[2];
        int b=arr[1]*10+arr[3];
        return a+b;
    }
}