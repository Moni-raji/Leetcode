class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int pse[]=new int[n];
        int nse[]=new int[n];
        Stack<Integer> stack=new Stack<>();

        //prev smallest element:

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) pse[i]=-1;
            else pse[i]=stack.peek();
            stack.push(i);
        }
        stack.clear();

        //next smallest element:

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()) nse[i]=n;
            else nse[i]=stack.peek();
            stack.push(i);
        }
        
        int max_area=0;
        for(int i=0;i<n;i++){
            int w=nse[i]-pse[i]-1;
            int area=heights[i]*w;
            max_area=Math.max(max_area,area);
        }
        return max_area;
    }
}