class Solution {
    public int[] twoSum(int[] nums, int target) {
       /*for(int i=0;i<nums.length-1;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            int sum=nums[i]+nums[j];
            if(sum==target)
            {
               return new int[]{i,j}; 
            }
        }
       }
       return new int[]{};*/
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int a=target-nums[i];
        if(map.containsKey(a)) return new int[] {map.get(a),i};
        map.put(nums[i],i);
       }
       return new int[]{};
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution obj=new Solution();
        int result[]=obj.twoSum(arr,target);
        System.out.print(result);
    }
}