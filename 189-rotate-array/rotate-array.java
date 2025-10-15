class Solution {
    public void rotate(int[] nums, int k) {
        /*int temp[]=new int[k];
        int n=nums.length;
        k=k%n;
        for(int i=0;i<k;i++){
            temp[i]=nums[(n-k)+i];
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }*/
        int n=nums.length;
		k=k%n;
		int a[]=new int[n];
		for(int i=0;i<k;i++){
		    a[i]=nums[n-k+i];
		}
		for(int i=k;i<n;i++){
		    a[i]=nums[i-k];
		}
        for(int i=0;i<n;i++){
            nums[i]=a[i];
        }
    }
}