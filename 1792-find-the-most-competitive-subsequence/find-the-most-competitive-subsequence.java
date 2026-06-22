class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>nums[i] && stack.size()-1+(n-i)>=k){
                stack.pop();
            }
            if(stack.size()<k) stack.push(nums[i]);
        }   
        int r[]=new int[k];
        for(int i=k-1;i>=0;i--){
            r[i]=stack.pop();
        }
        return r;
    }
}