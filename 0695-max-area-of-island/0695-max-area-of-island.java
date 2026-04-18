class Solution {
    public int dfs(int i,int j,int[][] arr){
        if(!isValid(i,j,arr)||arr[i][j]!=1) return 0;
        arr[i][j]=0;
        return 1+dfs(i+1,j,arr)
        +dfs(i-1,j,arr)
        +dfs(i,j+1,arr)
        +dfs(i,j-1,arr);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int area=0,maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area=dfs(i,j,grid);
                    maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }

    public boolean isValid(int r,int c,int[][] arr){

        if(r>=0 && r<arr.length &&c>=0 &&c<arr[0].length) return true;
        else return false;
    }
}