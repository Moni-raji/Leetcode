class Solution {
    public boolean isPalindrome(String s) {
        /*s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String a=sb.toString();
        String b=sb.reverse().toString();
        if(a.equals(b)) return true;
        return false;*/

        int left=0;
        int right=s.length()-1;
        //s=s.toLowerCase();
        while(left<=right){
            while(left<s.length() && !Character.isLetterOrDigit(s.charAt(left)) ) left++;
            while(right>=0 && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(left<=right && 
            Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}