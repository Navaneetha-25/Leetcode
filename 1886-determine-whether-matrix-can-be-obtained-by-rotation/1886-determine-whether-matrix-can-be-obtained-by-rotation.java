class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        int n=mat.length;
        for(int r=0;r<4;r++){
        boolean isSame=true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    isSame=false;
                }
            }
        }
        if(isSame) return true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }
        }
        return false;

    }
}