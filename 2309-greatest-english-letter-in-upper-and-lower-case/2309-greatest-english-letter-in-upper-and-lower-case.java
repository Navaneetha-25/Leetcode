class Solution {
    public String greatestLetter(String s) {
        int max=-1;
        String maxLetter="";
        
        Set< Character> lower=new HashSet<>();
        Set< Character> upper=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){ 
                lower.add(ch);
                if(upper.contains(Character.toUpperCase(ch))) 
                    max=Math.max(max,ch-'a');
            } 
            else  {
                upper.add(ch);
                if(lower.contains(Character.toLowerCase(ch)))
                    max=Math.max(max,ch-'A');
            }
        }
        if(max!=-1){
            maxLetter=String.valueOf((char)(max+'A'));
        }
        return maxLetter;
    }
}