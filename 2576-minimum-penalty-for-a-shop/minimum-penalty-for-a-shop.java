class Solution {
    public int bestClosingTime(String customers) {
        int min;
        int result=0;
        int n=customers.length();
        int penalty=0;
        for(char c:customers.toCharArray()){
            if(c=='Y') penalty++;
        }
        min=penalty;
        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='Y') penalty--;
            else penalty++;
            if(penalty<min){
                min=penalty;
                result=i+1;
            }
        }
        return result;
    }
    
}