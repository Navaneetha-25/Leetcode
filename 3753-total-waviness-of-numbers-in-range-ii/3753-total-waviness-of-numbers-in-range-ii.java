class Solution {
    static class Pair {
        long cnt;
        long wav;

        Pair(long cnt, long wav) {
            this.cnt = cnt;
            this.wav = wav;
        }
    }

    String num;
    Pair[][][][] memo;
    boolean[][][][] vis;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x <= 0) return 0;

        num = String.valueOf(x);

        memo = new Pair[num.length()][12][12][2];
        vis = new boolean[num.length()][12][12][2];

        return dfs(0, 10, 10, 1).wav;
    }

    private Pair dfs(int pos, int prev1, int prev2, int tight) {

        if (pos == num.length()) {
            return new Pair(1, 0);
        }

        if (vis[pos][prev1][prev2][tight]) {
            return memo[pos][prev1][prev2][tight];
        }

        vis[pos][prev1][prev2][tight] = true;

        long totalCnt = 0;
        long totalWav = 0;

        int limit = (tight == 1) ? num.charAt(pos) - '0' : 9;

        for (int d = 0; d <= limit; d++) {

            int newTight =
                    (tight == 1 && d == limit) ? 1 : 0;

            Pair next;

            if (prev1 == 10 && d == 0) {

                next = dfs(pos + 1, 10, 10, newTight);

            } else if (prev1 == 10) {

                next = dfs(pos + 1, d, 10, newTight);

            } else if (prev2 == 10) {

                next = dfs(pos + 1, d, prev1, newTight);

            } else {

                long add = 0;

                if ((prev1 > prev2 && prev1 > d) || (prev1 < prev2 && prev1 < d)) {
                    add = 1;
                }

                next = dfs(pos + 1, d, prev1, newTight);

                totalWav += add * next.cnt;
            }

            totalCnt += next.cnt;
            totalWav += next.wav;
        }

        return memo[pos][prev1][prev2][tight] = new Pair(totalCnt, totalWav);
    }
}