class Solution {
    public int splitNum(int num) {
        List<Integer> al=new ArrayList<>();
        while(num!=0){
            al.add(num%10);
            num/=10;
        }
        int a=0,p1=1;
        int b=0,p2=1;
        Collections.sort(al);
        for(int i=al.size()-1;i>=0;i--){
            if(i%2==0){
                a+=(al.get(i)*p1);
                p1*=10;
            }
            else{
                b+=(al.get(i)*p2);
                p2*=10;
            }
        }
        return a+b;
    }
}