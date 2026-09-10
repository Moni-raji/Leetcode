class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        find(0,candidates,target,r,al);
        return r;
    }
    public void find(int ind,int arr[],int target,List<List<Integer>> r,List<Integer> al){
        if(ind==arr.length){
            if(target==0){
                r.add(new ArrayList<>(al));
            }
            return;
        }
        if(arr[ind]<=target){
            al.add(arr[ind]);
            find(ind,arr,target-arr[ind],r,al);
            al.remove(al.size()-1);
        }
        find(ind+1,arr,target,r,al);
    }
}