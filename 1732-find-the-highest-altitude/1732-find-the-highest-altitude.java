class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] prefix=new int[n+1];
        int max=Integer.MIN_VALUE;

        prefix[0]=0;
        max=prefix[0];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+gain[i];
            max=Math.max(max,prefix[i+1]);
        }
        return max;

    }
}