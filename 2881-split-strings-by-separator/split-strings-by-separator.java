class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> al=new ArrayList<>();
        String sep=String.valueOf(separator);
        for(String a:words){
            String parts[]=a.split("\\Q"+sep+"\\E");
            for(String b:parts){
                if(!b.isEmpty()) al.add(b);
            }
        }
        return al;
    }
}