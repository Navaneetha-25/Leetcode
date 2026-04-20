class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        int max=0;
        int n=colors.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(colors[i]!=colors[j])
                    ans=Math.abs(i-j);
                    max=Math.max(ans,max);
            }
        }
        return max;
    }
}