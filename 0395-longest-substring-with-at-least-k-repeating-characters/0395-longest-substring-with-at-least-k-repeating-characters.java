class Solution {
    public int longestSubstring(String s, int k) {
        return solve(s, 0, s.length() - 1, k);
    }

    public int solve(String s, int start, int end, int k) {

        if (end - start + 1 < k) {
            return 0;
        }

        int[] freq = new int[26];
        for (int i = start; i <= end; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = start; i <= end; i++) {

            if (freq[s.charAt(i) - 'a'] < k) {

                int left = solve(s, start, i - 1, k);
                int right = solve(s, i + 1, end, k);

                return Math.max(left, right);
            }
        }
        return end - start + 1;
    }
}