class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int a:nums){
            min.offer(a);
            if(min.size()>k) min.poll();
        }
        return min.peek();
    }
}