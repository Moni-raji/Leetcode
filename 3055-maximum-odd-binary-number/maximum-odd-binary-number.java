class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cones=0,czero=0;
        for(char c:s.toCharArray()){
            if(c=='1') cones++;
            else czero++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<cones-1;i++){
            sb.append("1");
        }
        for(int i=0;i<czero;i++){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}