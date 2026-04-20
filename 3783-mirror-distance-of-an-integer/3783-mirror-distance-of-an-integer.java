class Solution {
    public static int reverse(int n){
        int res=0;
        while(n>0){
            int dig=n%10;
            res=res*10+dig;
            n/=10;
        }
        return res;
    }
    public int mirrorDistance(int n) {
        int rev=reverse(n);
        return Math.abs(n-rev);
    }
}