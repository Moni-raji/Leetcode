class Solution {
    public static boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        while(x!=0 && x>0)
        {
            rev=rev*10+ x%10;
            x/=10;
        }
        if(org>=0 && org==rev)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(isPalindrome(N));

    }
}