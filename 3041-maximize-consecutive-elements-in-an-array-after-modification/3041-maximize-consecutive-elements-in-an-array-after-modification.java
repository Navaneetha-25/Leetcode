class Solution {
    public int maxSelectedElements(int[] nums) {
        int count=1;
        Arrays.sort(nums);
        int[] dp=new int[1000002];

        for(int i:nums){
            dp[i+1]=Math.max(dp[i+1],dp[i]+1);
            dp[i]=Math.max(dp[i],dp[i-1]+1);

            count=Math.max(count,Math.max(dp[i],dp[i+1]));
        }
        return count;
    }
}