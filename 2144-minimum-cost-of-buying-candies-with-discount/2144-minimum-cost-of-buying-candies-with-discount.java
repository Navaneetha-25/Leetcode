class Solution {
    public int minimumCost(int[] cost) {
        int totalCost=0;
        int count=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            count++;
            if(count==3) count=0;
            else totalCost+=cost[i];
        }
        return totalCost;
    }
}