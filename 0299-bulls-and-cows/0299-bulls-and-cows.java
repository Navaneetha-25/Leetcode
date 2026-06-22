class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder hint=new StringBuilder();
        int bulls=0;
        int cows=0; 
        int[] arr=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)) bulls++;
            else {
                if(arr[secret.charAt(i)-'0']++<0 ) cows++;
                if(arr[guess.charAt(i)-'0']-->0) cows++;
            }
        }
        return bulls+"A"+cows+"B";
    }
}