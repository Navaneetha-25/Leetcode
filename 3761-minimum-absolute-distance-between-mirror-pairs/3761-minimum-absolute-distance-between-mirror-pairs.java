class Solution {
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int dist=0,min=Integer.MAX_VALUE;
        int n=nums.length;
        Map<Integer,Integer> reverses=new HashMap<>();
        for(int i=0;i<n;i++){
            if(reverses.containsKey(nums[i])){
                int j=reverses.get(nums[i]);
                dist=Math.abs(i-j);
                min=Math.min(min,dist);
            }
            reverses.put(reverse(nums[i]),i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}