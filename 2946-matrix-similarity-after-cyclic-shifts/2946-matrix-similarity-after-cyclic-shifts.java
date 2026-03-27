class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int shift=k%m;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                  int ogCol;
                  if(i%2==0){
                    ogCol=(j+shift)%m;
                  }else{
                    ogCol=(j-shift+m)%m;
                  }
                  if(mat[i][j]!=mat[i][ogCol]){
                    return false;
                  }
            }
        }
        return true;
    }
}