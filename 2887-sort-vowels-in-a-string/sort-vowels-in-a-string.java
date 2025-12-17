class Solution {
    public String sortVowels(String s) {
        List<Character> al=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(isVowel(c)) al.add(c);
        }
        Collections.sort(al);
        char arr[]=s.toCharArray();
        int r=0;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=al.get(r++);
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}