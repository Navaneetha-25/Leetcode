class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            int onesCount=Integer.bitCount(i);
            if(isPrime(onesCount)){
                cnt++;
            }
        }
        return cnt;
    }
}