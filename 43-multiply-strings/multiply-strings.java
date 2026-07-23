class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        int n=num1.length();
        int m=num2.length();
        int arr[]=new int[n+m];
        for(int i=n-1;i>=0;i--){
            int a=num1.charAt(i)-'0';
            for(int j=m-1;j>=0;j--){
                int b=num2.charAt(j)-'0';
                int pro=a*b;
                int p1=i+j;
                int p2=p1+1;
                int sum=pro+arr[p2];
                arr[p2]=sum%10;
                arr[p1]+=sum/10;
            }
        }
        int k=0;
        while(k<arr.length && arr[k]==0) k++;
        while(k<arr.length){
            sb.append(arr[k]);
            k++;
        }
        return sb.toString();
    }
}