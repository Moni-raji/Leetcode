class Solution {
    public boolean areNumbersAscending(String s) {
        int x=0;
        String arr[]=s.split(" ");
        for(String r:arr){
            if(r.chars().allMatch(Character::isDigit)){
                int b=Integer.parseInt(r);
                if(b<=x) return false;
                x=b;
            }
        }
        return true;
    }
}