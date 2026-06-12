class Solution {
    public int compress(char[] chars) {
        int i=0;
        int left=0;
        while(i<chars.length){
            char curr=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==curr){
                count++;
                i++;
            }
            chars[left++]=curr;
            if(count>1){
                String a=String.valueOf(count);
                for(char c:a.toCharArray()){
                    chars[left++]=c;
                }
            }
        }
        return left;
    }
}