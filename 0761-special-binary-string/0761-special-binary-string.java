class Solution {
    public String makeLargestSpecial(String s) {
        int cnt=0,i=0;
        List<String> res=new ArrayList();
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1') cnt++;
            else cnt--;

            if(cnt==0){
                res.add("1" + makeLargestSpecial(s.substring(i+1,j)) + "0");
                i=j+1;
            }
        }
        Collections.sort(res,Collections.reverseOrder());
        return String.join("",res);
    }
}