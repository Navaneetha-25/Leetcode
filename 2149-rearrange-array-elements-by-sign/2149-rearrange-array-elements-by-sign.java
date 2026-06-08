class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int left=0;
        int right=1;
        int i=0;

        while(i<n){
            if(nums[i]>0) {
                res[left]=nums[i];
                left+=2;
            }
            if(nums[i]<0) {
                res[right]=nums[i];
                right+=2;
            }
            i++; 
        }
        return res;
    }
}