class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),i);
            map2.put(t.charAt(i),i);
        }
        int sum=0;
        int len=s.length();
        int a=0;
        while(a!=len){
            int x=map1.get(s.charAt(a));
            int y=map2.get(s.charAt(a));
            sum+=Math.abs(x-y);
            a++;
        }
        return sum;

    }
}