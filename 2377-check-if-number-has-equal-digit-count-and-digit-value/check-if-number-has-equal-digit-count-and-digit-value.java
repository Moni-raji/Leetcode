class Solution {
    public boolean digitCount(String num) {
        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-'0';
            if(count(num,(char)('0'+i)) != a) return false;
        }
        return true;
    }
    public int count(String s,char c){
        int count=0;
        for(char a:s.toCharArray()){
            if(a==c) count++;
        }
        return count;
    }
}