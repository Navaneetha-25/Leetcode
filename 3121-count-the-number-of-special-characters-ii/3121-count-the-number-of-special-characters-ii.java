class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int[] lastLower=new int[26];
        int[] firstUpper=new int[26];
        
        Arrays.fill(lastLower,-1);
        Arrays.fill(firstUpper,-1);

        for(int i=0;i<word.length();i++){
            char s=word.charAt(i);
            if(Character.isLowerCase(s)) 
                lastLower[s-'a']=i;
            else 
                if(firstUpper[s-'A']==-1) 
                    firstUpper[s-'A']=i;;
        }

        for(int i=0;i<26;i++){
            if(lastLower[i]!=-1 && firstUpper[i]!=-1 && lastLower[i]<firstUpper[i]) 
                count++;
        }
        return count;
    }
}