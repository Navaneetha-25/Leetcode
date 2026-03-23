class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int max=0;
        int l=0,r=0;
        int maxFreq=0;
        HashMap<Character,Integer> freq=new HashMap<>();
        
        while(r<n){
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq,freq.get(s.charAt(r)));

            int windowSize=r-l+1;
            int changes=windowSize-maxFreq;

            if(changes>k){
                char leftChar=s.charAt(l);
                freq.put(leftChar,freq.get(leftChar)-1);
                l++;
            }
            if(changes<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}