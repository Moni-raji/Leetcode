class Solution {
    public String convertDateToBinary(String date) {
       StringBuilder sb=new StringBuilder();
       String parts[]=date.split("-");
       for(int i=0;i<parts.length;i++){
        int a=Integer.parseInt(parts[i]);
        sb.append(Integer.toBinaryString(a));
        if(i<parts.length-1){
            sb.append("-");
        }
       }
       return sb.toString();
    }
}