class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        long place=1;
        while(n>0){
            int dig=n%10;
            if(dig!=0){
                x=dig*place+x;
                place*=10;
                sum+=dig;
            }
            n/=10;
        }
        return x*sum;
    }
}