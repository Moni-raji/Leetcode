class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Set<String> s1=new HashSet<>(Arrays.asList(positive_feedback));
        Set<String> s2=new HashSet<>(Arrays.asList(negative_feedback));
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<report.length;i++){
            String s=report[i];
            String parts[]=s.split(" ");
            int count=0;
            for(String a:parts){
                if(s1.contains(a)) count+=3;
                else if(s2.contains(a)) count-=1;
            }
            map.put(student_id[i],count);
        }
        List<Integer> al=new ArrayList<>(map.keySet());
        al.sort((x,y)->{
            int m=map.get(y)-map.get(x);
            if(m!=0) return m;
            return x-y;
        });
        return al.subList(0,k);
    }
}