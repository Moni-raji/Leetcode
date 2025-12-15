class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        char c[]=s.toCharArray();
        int a=0;
        while(a<c.length){
            if(map.containsKey(c[a])){
            int min=a;
            for(int i=a+1;i<c.length;i++){
                if(map.containsKey(c[i]) && map.get(c[i])<map.get(c[min])) min=i;
            }
            char temp=c[a];
            c[a]=c[min];
            c[min]=temp;
            }
            a++;
        }
        return new String(c);
    }
}