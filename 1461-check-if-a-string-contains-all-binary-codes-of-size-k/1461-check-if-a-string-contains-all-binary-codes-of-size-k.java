class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hset=new HashSet();

        for(int i=0;i+k<=s.length();i++){
            hset.add(s.substring(i,i+k));
        }
        return hset.size()==(int) Math.pow(2,k);
    }
}