class Solution {
    public int minDeletion(String s, int k) {
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                al.add(arr[i]);
            } 
        }
        Collections.sort(al);
        if(al.size() <= k) return 0;
        int a=0;
        int r=al.size()-k;
        for(int i=0;i<r;i++){
            a+=al.get(i);
        }
        return a;
    }
}