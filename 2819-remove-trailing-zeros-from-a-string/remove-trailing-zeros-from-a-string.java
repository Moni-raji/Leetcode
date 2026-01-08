class Solution {
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;
        while(i>=0){
            if(num.charAt(i) == '0') i--;
            else break;
        }
        /*int j=0;
        StringBuilder sb=new StringBuilder();
        while(j<=i){
            sb.append(num.charAt(j));
            j++;
        }
        return sb.toString();*/
        return num.substring(0,i+1);
    }
}