class Solution {
    public int binaryGap(int n) {
        int onespos=-1, pos=0,maxGap=0;

        while(n>0){
            if((n&1)==1){
                if(onespos!=-1){
                    maxGap=Math.max(maxGap,pos-onespos);
                }
                onespos=pos;
            }
            pos++;
            n>>=1;
        }
        return maxGap;
    }
}