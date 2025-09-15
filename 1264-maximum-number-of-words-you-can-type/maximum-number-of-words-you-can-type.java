class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        for(String a:text.split(" ")){
            if(isbroken(a,brokenLetters)) count++;
        }
        return count;
    }
    public boolean isbroken(String a,String b){
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)) return false;
            }
        }
        return true;
    }
}