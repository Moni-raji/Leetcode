class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        int r[]=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                count++;
                //r[i]=count;
            }
            else if(!s2.contains(A[i]) && !s1.contains(B[i])){
                //r[i]=count;
            }
            else if(s2.contains(A[i]) && s1.contains(B[i])){
                count+=2;
                //r[i]=count;
            }
            else if(s2.contains(A[i]) || s1.contains(B[i])){
                count++;
                //r[i]=count;
            }
            r[i]=count;
            s1.add(A[i]);
            s2.add(B[i]);
            
        }
        return r;
        
    }
}