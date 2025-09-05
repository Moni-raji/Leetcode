class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String r=word;
        while(sequence.contains(r)){
            count++;
            r+=word;
        }
        return count;
    }
}