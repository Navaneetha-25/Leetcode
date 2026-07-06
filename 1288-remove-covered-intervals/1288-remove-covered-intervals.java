class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return b[1]-a[1];
        });

        int count=intervals.length;
        int l=intervals[0][0];
        int h=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]==l||intervals[i][1]<=h)
                count--;
            else {
                l=intervals[i][0];
                h=intervals[i][1];
            }
        }
        return count;
    }
}