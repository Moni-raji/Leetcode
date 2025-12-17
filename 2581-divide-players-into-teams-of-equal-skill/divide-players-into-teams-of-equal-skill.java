class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int prev=skill[0]+skill[n-1];
        int left=0;
        int right=n-1;
        long total=0;
        while(left<right){
            if(skill[left]+skill[right] !=prev) return -1;
            total+=(skill[left]*skill[right]);
            left++;
            right--;
        }
        return total;
    }
}