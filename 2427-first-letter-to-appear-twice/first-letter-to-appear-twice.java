class Solution {
    public char repeatedCharacter(String s) {
        int x=Integer.MAX_VALUE;
        char result=' ';
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(a==s.charAt(j)){
                    int index=j-1;
                    if(index<=x) {
                        x=index;
                        result=a;
                    }
                    break;
                }

            }
        }
        return result;
    }
}