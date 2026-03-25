class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int op1=helper(nums,0,n-2,dp1);

        int[] dp2=new int[n];
        Arrays.fill(dp2,-1);
        int op2=helper(nums,1,n-1,dp2);

        return Math.max(op1,op2);
    }
        public int helper(int[] nums, int i,int end, int[] dp) {
        if (i > end) return 0;

        if (dp[i] != -1) return dp[i];

        int rob = nums[i] + helper(nums, i + 2,end,dp);
        int skip = helper(nums, i + 1,end, dp);

        return dp[i] = Math.max(rob, skip);
    }
}