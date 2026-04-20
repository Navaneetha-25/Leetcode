class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int dist=0,max=0;
        int i=0,j=0;
       while(i<n1 && j<n2){
                if(nums1[i]>nums2[j] ) i++;
                else{
                    dist=j-i;
                    max=Math.max(max,dist);
                    j++;
                }
        }
        return max;
    }
}