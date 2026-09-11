class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int arr[]=new int[n];
        for(int i=0;i<bookings.length;i++){
            int l=bookings[i][0]-1;
            int r=bookings[i][1]-1;
            for(int j=l;j<=r;j++){
                arr[j]+=bookings[i][2];
            }
        }
        return arr;
    }
}