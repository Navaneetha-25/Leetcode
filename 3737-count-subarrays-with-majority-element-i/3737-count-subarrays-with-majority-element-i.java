class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int[] pre=new int[2*n+1];
        pre[n]=1;
        int cnt=n;
        long preSum=0;
        long ans=0;

        for(int x:nums){
            if(x==target){
                preSum+=pre[cnt];
                cnt++;
                pre[cnt]++;
            }else{
                cnt--;
                preSum-=pre[cnt];
                pre[cnt]++;
            }
            ans+=preSum;
        }
        return (int) ans;
    }
}